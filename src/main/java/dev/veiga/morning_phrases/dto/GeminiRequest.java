package dev.veiga.morning_phrases.dto;

import java.util.List;
import java.util.Map;

public record GeminiRequest(
        List<Content> contents
) {

    public record Content(
            List<Part> parts
    ) {}

    public record Part(
            String text
    ) {}
}
