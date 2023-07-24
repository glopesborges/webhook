package com.example.controller;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller("/api")
@RequiredArgsConstructor
public class WebhookController {

    @Post(uri = "/v1/webhook/callback")
    public HttpStatus receiveWebhookCallback(@Body String body) {
        log.info("Received body: {}", body);
        return HttpStatus.ACCEPTED;
    }
    
}
