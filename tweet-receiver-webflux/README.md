# tweet-receiver
### Edição BBB

Projeto de exemplo utilizando as tecnologias:

* Spring WebFlux
* Project Reacton
* Kotlin
* JDK 11
* Gradle 6.7
* MongoDB 4.0

Recebe Tweets relacionados ao tema BBB e faz uma quebra:

| Quebra     | Likes   | Replies | Retweets |
|------------|---------|---------|----------|
| Starter    | 0-20    | 0-20    | 0-20     |
| Active     | 21-1000 | 21-1000 | 0-1000   |
| Influencer | >1001   | >1001   | >1001    |

Utiliza o Stream de dados gerado por outra aplicação e que está disponível no Kafka.