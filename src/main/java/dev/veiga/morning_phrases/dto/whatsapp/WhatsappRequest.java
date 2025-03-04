package dev.veiga.morning_phrases.dto.whatsapp;

import feign.form.FormProperty;

public record WhatsappRequest(
        @FormProperty("messaging_product")
        String messagingProduct,

        @FormProperty("recipient_type")
        String recipientType,
        String to,
        String type,
        Text text
) {

    public record Text(
            @FormProperty("preview_url")
            boolean previewUrl,
            String body
    ) {}
}
