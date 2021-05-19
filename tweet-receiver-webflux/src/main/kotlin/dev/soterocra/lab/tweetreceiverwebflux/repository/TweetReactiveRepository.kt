package dev.soterocra.lab.tweetreceiverbbb.repository

import dev.soterocra.lab.tweetreceiverbbb.entity.Tweet
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface TweetReactiveRepository : ReactiveMongoRepository<Tweet, String> {}