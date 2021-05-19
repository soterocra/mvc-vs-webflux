package dev.soterocra.lab.tweetreceiverclassic.repository

import dev.soterocra.lab.tweetreceiverclassic.entity.Tweet
import org.springframework.data.mongodb.repository.MongoRepository

interface TweetReactiveRepository : MongoRepository<Tweet, String> {}