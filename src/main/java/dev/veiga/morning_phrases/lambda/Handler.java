package dev.veiga.morning_phrases.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import dev.veiga.morning_phrases.MorningPhrasesApplication;
import dev.veiga.morning_phrases.services.SendMessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class Handler implements RequestHandler {

    private static ConfigurableApplicationContext applicationContext;

    @Override
    public Object handleRequest(Object o, Context context) {

        if (applicationContext == null) {
            applicationContext = SpringApplication.run(MorningPhrasesApplication.class);
        }

        var sendMessageService = applicationContext.getBean(SendMessageService.class);

        try {
            sendMessageService.send();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
