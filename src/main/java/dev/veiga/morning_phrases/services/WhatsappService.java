package dev.veiga.morning_phrases.services;

import dev.veiga.morning_phrases.config.WhatsappApiClient;
import dev.veiga.morning_phrases.dto.whatsapp.WhatsappRequest;
import dev.veiga.morning_phrases.dto.whatsapp.WhatsappResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WhatsappService {

    @Value("${WHATSAPP_BEARER_TOKEN}")
    private String bearerToken;

    private final WhatsappApiClient whatsappApiClient;

    public WhatsappService(WhatsappApiClient whatsappApiClient) {
        this.whatsappApiClient = whatsappApiClient;
    }

    WhatsappResponse sendWhatsappMessage(String to, String message) {
        var request = new WhatsappRequest(
                "whatsapp",
                "individual",
                to,
                "text",
                new WhatsappRequest.Text(
                        false,
                        message
                )
        );

        var token = "Bearer ".concat(bearerToken);

        var response = this.whatsappApiClient.sendMessage(token, request);

        return response;
    }
}
