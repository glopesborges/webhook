package com.example.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.SerdeImport;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@Builder
@Jacksonized
@Introspected
public record WebhookRequestBody(
        @JsonProperty("Content") WebhookContent content,
        @JsonProperty("HashCode") String webhookSecret
) {
}
