package dev.soterocra.lab.tweetreceiverbbb.service

import dev.soterocra.lab.tweetreceiverbbb.entity.Tweet
import dev.soterocra.lab.tweetreceiverbbb.repository.TweetReactiveRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.time.Duration
import java.time.Instant

@Service
class TweetService(val repository: TweetReactiveRepository) {

    val logger: Logger = LoggerFactory.getLogger(TweetService::class.java)

    fun save(tweet: Tweet): Mono<Tweet> {
        val start = Instant.now()
        return repository.save(tweet)
                .doOnSuccess { logger.info("Tweet saved successfully, ellapsed time: {}", Duration.between(start, Instant.now()).toMillis()) }
    }

}