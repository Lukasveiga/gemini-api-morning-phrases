package dev.veiga.morning_phrases.dto.whatsapp;

import feign.form.FormProperty;

import java.util.List;

public record WhatsappResponse(
        @FormProperty("messaging_product")
        String messagingProduct,
        List<ContactsRecord> contacts,
        List<MessagesRecord> messages
) {
    public record ContactsRecord(
            String input,
            @FormProperty("wa_id")
            String waId
    ) {}

    public record MessagesRecord(
            String id
    ) {}
}