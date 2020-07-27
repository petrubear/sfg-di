package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
//@Service
public class PrimaryGreetingService implements GreetingsService {
    private GreetingsRepository greetingRepository;

    public PrimaryGreetingService(GreetingsRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingRepository.getEnglishGreeting();
    }
}
