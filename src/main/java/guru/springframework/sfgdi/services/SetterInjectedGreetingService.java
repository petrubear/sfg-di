package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "SetterInjectedGreetingService: Hello - World";
    }
}
