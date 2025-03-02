package dev.veiga.morning_phrases.services;

import dev.veiga.morning_phrases.config.GeminiApiClient;
import dev.veiga.morning_phrases.dto.GeminiRequest;
import dev.veiga.morning_phrases.dto.MorningPhraseRequestContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.stream.Collectors;

@Service
public class GeminiService {

    @Value("${GEMINI_API_KEY}")
    private String apiKey;

    private final GeminiApiClient geminiApiClient;

    public GeminiService(GeminiApiClient geminiApiClient) {
        this.geminiApiClient = geminiApiClient;
    }

    public String generateText(MorningPhraseRequestContext context) {
        GeminiRequest request = this.createGeminiRequest(context);

        try {
            var response = this.geminiApiClient.generateContent(request, apiKey);

            if (response != null && response.candidates() != null && !response.candidates().isEmpty()) {
                return response.candidates().get(0).content().parts().get(0).text();
            } else {
                return "No response from Gemini API.";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error communicating with Gemini API: " + e.getMessage();
        }
    }

    private GeminiRequest createGeminiRequest(MorningPhraseRequestContext context) {
        StringBuilder prompt = new StringBuilder();

        prompt.append("Crie uma mensagem de bom dia curta e inspiradora para ").append(context.target()).append(",");

        if (!context.preferences().isEmpty()) {
            var preferencesString = context.preferences().stream().collect(Collectors.joining(", "));
            prompt.append(" Inclua algo relacionado aos seguintes interesses: ").append(preferencesString).append(".");
        }

        prompt.append(" A mensagem deve ser otimista, motivacional e transmitir carinho.");
        prompt.append(" Limite a mensagem a no máximo 30 palavras.");
        prompt.append(" Não inclua hashtags ou referências a IA.");

        var request = new GeminiRequest(
                Collections.singletonList(
                        new GeminiRequest.Content(
                                Collections.singletonList(new GeminiRequest.Part(prompt.toString()))


        )));

        return request;
    }
}
