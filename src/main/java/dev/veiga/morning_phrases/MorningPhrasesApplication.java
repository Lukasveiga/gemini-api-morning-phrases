package dev.veiga.morning_phrases;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MorningPhrasesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MorningPhrasesApplication.class, args);
	}

}
