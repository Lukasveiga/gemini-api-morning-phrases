package dev.veiga.morning_phrases.services;

import dev.veiga.morning_phrases.dto.MorningPhraseRequestContext;
import dev.veiga.morning_phrases.repository.MessageLogRepository;
import dev.veiga.morning_phrases.repository.entities.MessageLog;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SendMessageService {

    private final GeminiService geminiService;

    private final WhatsappService whatsappService;

    private final MorningPhraseUserService morningPhraseUserService;

    private final MessageLogRepository messageLogRepository;


    public SendMessageService(GeminiService geminiService, WhatsappService whatsappService, MorningPhraseUserService morningPhraseUserService, MessageLogRepository messageLogRepository) {
        this.geminiService = geminiService;
        this.whatsappService = whatsappService;
        this.morningPhraseUserService = morningPhraseUserService;
        this.messageLogRepository = messageLogRepository;
    }

    public void send() {
        var users = this.morningPhraseUserService.listAllActive();

        for (var user : users) {
            var message = this.geminiService.generateText(new MorningPhraseRequestContext(user.getTarget(), user.getPreferences()));
            this.whatsappService.sendWhatsappMessage(user.getPhone(), message);
            this.messageLogRepository.save(new MessageLog(null, user, message, LocalDateTime.now()));
        }
    }
}
