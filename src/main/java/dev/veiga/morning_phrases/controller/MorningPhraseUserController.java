package dev.veiga.morning_phrases.controller;

import dev.veiga.morning_phrases.dto.MorningPhraseUserDto;
import dev.veiga.morning_phrases.repository.entities.MorningPhraseUser;
import dev.veiga.morning_phrases.services.MorningPhraseUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/morning-phrase-users")
public class MorningPhraseUserController {

    private final MorningPhraseUserService morningPhraseUserService;

    public MorningPhraseUserController(MorningPhraseUserService morningPhraseUserService) {
        this.morningPhraseUserService = morningPhraseUserService;
    }

    @GetMapping()
    public ResponseEntity<List<MorningPhraseUser>> findAll() {
        var users = this.morningPhraseUserService.listAll();

        return ResponseEntity.ok(users);
    }

    @PostMapping()
    public ResponseEntity<MorningPhraseUser> save(@RequestBody MorningPhraseUserDto request) {
        var user = this.morningPhraseUserService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
