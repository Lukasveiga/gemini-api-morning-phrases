package dev.veiga.morning_phrases.config;

import dev.veiga.morning_phrases.dto.GeminiRequest;
import dev.veiga.morning_phrases.dto.GeminiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "gemini-api", url = "${gemini.api.url}")
public interface GeminiApiClient {

    @PostMapping()
    GeminiResponse generateContent(GeminiRequest request, @RequestParam("key") String apiKey);
}
