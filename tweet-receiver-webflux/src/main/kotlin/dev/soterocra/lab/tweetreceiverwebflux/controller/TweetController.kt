package dev.soterocra.lab.tweetreceiverbbb.controller

import com.fasterxml.jackson.databind.ObjectMapper
import dev.soterocra.lab.tweetreceiverbbb.entity.Tweet
import dev.soterocra.lab.tweetreceiverbbb.service.TweetService
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
        return ResponseEntity.ok(
            service.save(payload)
                .map { ResponseEntity.ok(mapOf("id" to it.mongoId)) }
        )
    }

}