# Backend Encurtador de URL com Spring e MongoDB

Este projeto consiste em um backend para encurtar URLs usando Spring Boot e MongoDB.

## Tecnologias Utilizadas

- **Spring Boot**: Framework Java para criar aplicativos web.
- **MongoDB**: Banco de dados NoSQL para armazenamento dos dados das URLs.

## Funcionalidades

- Encurtar URLs longas para URLs curtas.
- Redirecionar URLs curtas para suas respectivas URLs longas.

## Como Utilizar

### Encurtar URL

Para encurtar uma URL longa, você deve fazer um **POST** na rota `https://encurtaweb.onrender.com/` com o seguinte payload em formato JSON:

```json
{
    "fullUrl": "https://www.amazon.com.br/Entendendo-Algoritmos-Ilustrado-Programadores-Curiosos/dp/8575225634?crid=3DCNWL11EO3RT&dib=eyJ2IjoiMSJ9.M543fSmeTNzNRPkq49ChpdvK3psZLwJpsw7Sc8lzCRS98qiSW53cxWBMKkKgr4olrCJ9XKNPgMIZjnUrTXpAhELqz4ozQPyhAh3jPt-Y7UidlaL4649xn6kTD1su7uj7_E8y7z8-iRyQxsWh7Pb0_wji4sBIjE2gjhUerFbs3jIKJd4mDvKFJsyZdJJGMhgvM0-B5gyqS6cIBYIzvJfDBgPzNVo30tTpB03bvqaZlD5m6v7OVhNHbxjnVZGkrqOgs_e13KPY8iE8dcXMoxJJ_RHRQjgNs_bwd1rrv_uGEdw.CGpz6Apx0n99ABqaSlHHCodhKDbpT_9nlNwiWery2FE&dib_tag=se&keywords=entendendo+algoritmos&psr=EY17&qid=1718288843&s=todays-deals&sprefix=entendend,todays-deals,148&sr=1-1&linkCode=sl1&tag=realgalego-20&linkId=572b8a79f6217811e43570c1148fbd6b&language=pt_BR&ref_=as_li_ss_tl"
}
```
```java
body : {  https://encurtaweb.onrender.com/<codigo-unico> }
```
## Avisos

- A instância gratuita ficará inativa, o que pode atrasar as solicitações em 50 segundos ou mais.
- Cole a URL curta no seu navegador de escolha e você será redirecionado para o link encurtado.
- As URLs duram 3 minutos nessa primeira versão.



