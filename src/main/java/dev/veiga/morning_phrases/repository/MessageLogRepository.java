package dev.veiga.morning_phrases.repository;

import dev.veiga.morning_phrases.repository.entities.MessageLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageLogRepository extends MongoRepository<MessageLog, String> {
}