package dev.soterocra.lab.tweetreceiverclassic.service

import dev.soterocra.lab.tweetreceiverclassic.entity.Tweet
import dev.soterocra.lab.tweetreceiverclassic.repository.TweetReactiveRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.time.Duration
import java.time.Instant

@Service
class TweetService(val repository: TweetReactiveRepository) {

    val logger: Logger = LoggerFactory.getLogger(TweetService::class.java)

    fun save(tweet: Tweet): Tweet {
        val start = Instant.now()
        val saved = repository.save(tweet)
        logger.info("Tweet saved successfully, ellapsed time: {}", Duration.between(start, Instant.now()).toMillis())
        return saved
    }

}