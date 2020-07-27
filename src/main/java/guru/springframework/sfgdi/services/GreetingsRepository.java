package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

public interface GreetingsRepository {
    String getEnglishGreeting();

    String getSpanishGreeting();

    String getGermanGreeting();
}
