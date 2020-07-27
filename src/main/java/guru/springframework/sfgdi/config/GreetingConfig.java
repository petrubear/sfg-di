package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.GreetingServiceFactory;
import guru.springframework.sfgdi.services.GreetingsRepository;
import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingConfig {
    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingsRepository greetingsRepository) {
        return new GreetingServiceFactory(greetingsRepository);
    }

    @Bean
    @Primary
    @Profile( {"default", "EN"})
    GreetingsService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("ES")
    GreetingsService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile("DE")
    GreetingsService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("de");
    }
}
