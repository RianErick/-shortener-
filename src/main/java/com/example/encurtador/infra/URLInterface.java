package com.example.encurtador.infra;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URLInterface extends MongoRepository<Url, Long> {

    Url findUrlByCompression(String compress);

}
