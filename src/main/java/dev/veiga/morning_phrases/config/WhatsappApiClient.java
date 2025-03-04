package dev.veiga.morning_phrases.config;

import dev.veiga.morning_phrases.dto.whatsapp.WhatsappRequest;
import dev.veiga.morning_phrases.dto.whatsapp.WhatsappResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "whatsapp-api", url = "${whatsapp.api.url}")
public interface WhatsappApiClient {

    @PostMapping()
    WhatsappResponse sendMessage(@RequestHeader("Authorization") String bearerToken, WhatsappRequest request);
}
