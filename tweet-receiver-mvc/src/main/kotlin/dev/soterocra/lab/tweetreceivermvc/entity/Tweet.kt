package dev.soterocra.lab.tweetreceiverclassic.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigInteger

@Document
data class Tweet (
    @Id
    val mongoId: String?,
    val id : BigInteger,
    val id_str : BigInteger,
    val conversation_id : BigInteger,
    val datetime : String,
    val datestamp : String,
    val timestamp : String,
    val user_id : BigInteger,
    val user_id_str : BigInteger,
    val username : String,
    val name : String,
    val place : String,
    val timezone : BigInteger,
    val mentions : List<String>,
    val reply_to : List<ReplyTo>,
    val urls : List<String>,
    val photos : List<String>,
    val video : BigInteger,
    val thumbnail : String,
    val tweet : String,
    val lang : String,
    val hashtags : List<String>,
    val cashtags : List<String>,
    val replies_count : BigInteger,
    val retweets_count : BigInteger,
    val likes_count : BigInteger,
    val link : String,
    val retweet : Boolean,
    val retweet_id : String,
    val retweet_date : String,
    val user_rt : String,
    val user_rt_id : String,
    val quote_url : String,
    val near : String,
    val geo : String,
    val source : String,
    val translate : String,
    val trans_src : String,
    val trans_dest : String
)