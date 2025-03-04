package dev.veiga.morning_phrases.dto.whatsapp;

import feign.form.FormProperty;

import java.util.List;

public record WhatsappResponse(
        String messaging_product,
        List<ContactsRecord> contacts,
        List<MessagesRecord> messages
) {
    public record ContactsRecord(
            String input,
            String wa_id
    ) {}

    public record MessagesRecord(
            String id
    ) {}
}