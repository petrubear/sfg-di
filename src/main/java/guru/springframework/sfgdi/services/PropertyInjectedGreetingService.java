package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingsService{
    @Override
    public String sayGreetings() {
        return "PropertyInjectedGreetingService: Hello World";
    }
}
