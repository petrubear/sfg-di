package guru.springframework.sfgdi.services;

public class PrimaryGermanGreetingService implements GreetingsService {
    private GreetingsRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingsRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingRepository.getGermanGreeting();
    }
}
