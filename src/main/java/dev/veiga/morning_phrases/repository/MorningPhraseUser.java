package dev.veiga.morning_phrases.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("MorningPhraseUser")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MorningPhraseUser {

    @Id
    private String id;

    private String target;

    private String phone;

    private List<String> preferences;
}
