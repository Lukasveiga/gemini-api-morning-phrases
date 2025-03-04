package dev.veiga.morning_phrases.controller;

import dev.veiga.morning_phrases.dto.MorningPhraseRequestContext;
import dev.veiga.morning_phrases.services.GeminiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/morning-phrase-gemini")
public class GeminiController {

    private final GeminiService geminiService;

    public GeminiController(GeminiService geminiService) {
        this.geminiService = geminiService;
    }

    @PostMapping("/generate")
    public String generateText(@RequestBody MorningPhraseRequestContext requestContext) {
        return this.geminiService.generateText(requestContext);
    }
}
