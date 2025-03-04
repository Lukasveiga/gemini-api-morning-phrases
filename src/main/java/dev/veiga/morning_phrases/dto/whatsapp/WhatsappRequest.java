package dev.veiga.morning_phrases.dto.whatsapp;

import feign.form.FormProperty;

public record WhatsappRequest(
        String messaging_product,
        String recipient_type,
        String to,
        String type,
        Text text
) {

    public record Text(
            boolean preview_url,
            String body
    ) {}
}
