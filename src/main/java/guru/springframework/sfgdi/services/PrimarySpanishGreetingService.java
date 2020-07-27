package guru.springframework.sfgdi.services;

public class PrimarySpanishGreetingService implements GreetingsService {
    private GreetingsRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingsRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingRepository.getSpanishGreeting();
    }
}
