package com.example.controller;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.micronaut.core.annotation.Introspected;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import javax.validation.constraints.NotBlank;

@Builder
@Jacksonized
@Introspected
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public record WebhookContent(
        @NotBlank String topic,
        @NotBlank String action,
        @NotBlank String division,
        @NotBlank String key,
        @NotBlank String exactOnlineEndpoint,
        @NotBlank String eventCreatedOn
) {
}
