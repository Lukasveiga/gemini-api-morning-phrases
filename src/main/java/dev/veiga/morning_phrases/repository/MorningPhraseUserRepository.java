package dev.veiga.morning_phrases.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MorningPhraseUserRepository extends MongoRepository<MorningPhraseUser, String> {


}
