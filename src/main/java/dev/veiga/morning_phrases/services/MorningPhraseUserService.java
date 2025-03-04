package dev.veiga.morning_phrases.services;

import dev.veiga.morning_phrases.dto.MorningPhraseUserDto;
import dev.veiga.morning_phrases.repository.entities.MorningPhraseUser;
import dev.veiga.morning_phrases.repository.MorningPhraseUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MorningPhraseUserService {

    private final MorningPhraseUserRepository morningPhraseUserRepository;

    public MorningPhraseUserService(MorningPhraseUserRepository morningPhraseUserRepository) {
        this.morningPhraseUserRepository = morningPhraseUserRepository;
    }

    public MorningPhraseUser save(MorningPhraseUserDto input) {
        return this.morningPhraseUserRepository.save(
                new MorningPhraseUser(
                        null,
                        input.target(),
                        input.phone(),
                        input.preferences(),
                        true
                )
        );
    }

    public List<MorningPhraseUser> listAll() {
        return this.morningPhraseUserRepository.findAll();
    }

    public List<MorningPhraseUser> listAllActive() {
        return this.morningPhraseUserRepository.listAllActive();
    }
}
