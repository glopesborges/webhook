package com.example.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public HttpStatus receiveWebhookCallback(@Body Optional<String> body) {
        body.ifPresent(webhookRequestBody -> log.info("Received body: {}", webhookRequestBody));
        return HttpStatus.OK;
    }

}
