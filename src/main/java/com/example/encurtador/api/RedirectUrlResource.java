package com.example.encurtador.api;

import com.example.encurtador.infra.URLInterface;
import com.example.encurtador.infra.Url;
import com.example.encurtador.record.LinkURl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

@RestController
@RequestMapping()
public class RedirectUrlResource {

    private final URLInterface urlInterface;

    public RedirectUrlResource(URLInterface urlInterface) {
        this.urlInterface = urlInterface;
    }

    @Value("${config.url}")
    protected String baseUrl;

    protected String compressedCode;

    @PostMapping
    public LinkURl shortenURL(@RequestBody Url url) {
        try{

            compressedCode = UUID.randomUUID().toString().substring(0, 3);
            existCode(compressedCode);

            String urlConcat = baseUrl.concat("/").concat(compressedCode);
            url.setCompression(compressedCode);

            urlInterface.insert(url);

            return new LinkURl(urlConcat);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    private void existCode(String compressedCode) {
        Url url = urlInterface.findUrlByCompression(compressedCode);

        if (url != null) {
            compressedCode = UUID.randomUUID().toString().substring(0, 3);
            existCode(compressedCode);
        }
    }

    @GetMapping("{urlCompress}")
    public RedirectView queryLinkCompacted(@PathVariable(value = "urlCompress") String urlCompress) throws URISyntaxException {
        Url url = urlInterface.findUrlByCompression(urlCompress);
        URI uri = new URI(url.getFullUrl());

        try {
            return new RedirectView(uri.toString());
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }


}
