package dev.veiga.morning_phrases.dto;

import java.util.List;

public record MorningPhraseUserDto(
        String target,
        String phone,
        List<String>preferences
) {
}
