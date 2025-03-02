package dev.veiga.morning_phrases.dto;

import java.util.List;

public record MorningPhraseRequestContext(
        String target,
        List<String> preferences
) {
}
