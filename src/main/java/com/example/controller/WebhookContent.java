package com.example.controller;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.SerdeImport;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;


@Builder
@Jacksonized
@Introspected
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public record WebhookContent(
         String topic,
         String action,
         String division,
         String key,
         String exactOnlineEndpoint,
         String eventCreatedOn
) {
}
