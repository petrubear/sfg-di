package guru.springframework.sfgdi.services;

public class GreetingServiceFactory {

    private GreetingsRepository greetingsRepository;

    public GreetingServiceFactory(GreetingsRepository greetingRepository) {
        this.greetingsRepository = greetingRepository;
    }

    public GreetingsService createGreetingService(String lang) {

        switch (lang) {
            case "en":
                return new PrimaryGreetingService(greetingsRepository);
            case "de":
                return new PrimaryGermanGreetingService(greetingsRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingsRepository);
            default:
                return new PrimaryGreetingService(greetingsRepository);
        }

    }
}
