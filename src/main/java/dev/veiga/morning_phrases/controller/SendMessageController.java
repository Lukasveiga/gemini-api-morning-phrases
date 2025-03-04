package dev.veiga.morning_phrases.controller;

import dev.veiga.morning_phrases.services.SendMessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/morning-phrase-message")
public class SendMessageController {

    private final SendMessageService sendMessageService;

    public SendMessageController(SendMessageService sendMessageService) {
        this.sendMessageService = sendMessageService;
    }

    @PostMapping()
    public ResponseEntity send() {
        this.sendMessageService.send();
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
