package com.example.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Builder
@Jacksonized
@Introspected
public record WebhookRequestBody(
        @JsonProperty("Content") @Valid WebhookContent content,
        @JsonProperty("HashCode") @NotBlank String webhookSecret
) {
}
