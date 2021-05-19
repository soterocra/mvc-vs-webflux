package dev.soterocra.lab.tweetreceiverclassic.controller

import com.fasterxml.jackson.databind.ObjectMapper
import dev.soterocra.lab.tweetreceiverclassic.entity.Tweet
import dev.soterocra.lab.tweetreceiverclassic.service.TweetService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tweets")
class TweetController(val service: TweetService, val mapper: ObjectMapper) {

    val logger: Logger = LoggerFactory.getLogger(TweetController::class.java)

    @PostMapping("/receive")
    fun receive(@RequestBody payload: Tweet): ResponseEntity<Any> {
        return ResponseEntity.ok(mapOf("id" to service.save(payload).mongoId))
    }

}