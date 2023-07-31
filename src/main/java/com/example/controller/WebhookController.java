package com.example.controller;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.validation.Validated;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.Optional;

@Slf4j
@Validated
@Controller("/api")
@RequiredArgsConstructor
public class WebhookController {


    @Post(uri = "/v1/webhook/callback", consumes = MediaType.ALL)
    public HttpStatus receiveWebhookCallback(@Body Optional<WebhookRequestBody> body) {
        body.ifPresent(webhookRequestBody -> log.info("Received body: {}", webhookRequestBody));
        return HttpStatus.OK;
    }

//    @Post(uri = "/v1/webhook/callback", consumes = MediaType.ALL)
//    public HttpStatus receiveWebhook() {
//        log.info("Received no body");
//        return HttpStatus.OK;
//    }

}
