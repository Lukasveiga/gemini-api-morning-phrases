package dev.veiga.morning_phrases.repository;

import dev.veiga.morning_phrases.repository.entities.MorningPhraseUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MorningPhraseUserRepository extends MongoRepository<MorningPhraseUser, String> {

    @Query("{active: true}")
    List<MorningPhraseUser> listAllActive();
}
