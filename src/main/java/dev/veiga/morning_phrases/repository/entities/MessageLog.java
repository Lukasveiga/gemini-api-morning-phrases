package dev.veiga.morning_phrases.repository.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("MessageLog")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageLog {

    @Id
    private String id;

    @DBRef
    private MorningPhraseUser user;

    private String message;

    @CreatedDate
    private LocalDateTime createdAt;
}
