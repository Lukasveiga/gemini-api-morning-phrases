package dev.veiga.morning_phrases.dto;

import java.util.List;

public record GeminiResponse(
        List<Candidate> candidates,
        PromptFeedback promptFeedback
) {

    public record Candidate(
            Content content,
            String finishReason,
            SafetyRating safetyRatings,
            Integer index
    ) {}

    public record Content(
            List<Part> parts,
            String role
    ) {}

    public record Part(
            String text
    ) {}

    public record SafetyRating(
            String category,
            String probability,
            Boolean blocked
    ) {}

    public record PromptFeedback(
            String safetyRatings
    ) {}
}
