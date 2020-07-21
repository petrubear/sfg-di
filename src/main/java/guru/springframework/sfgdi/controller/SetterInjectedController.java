package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingsService greetingsService;

    public String sayGreeting() {
        return greetingsService.sayGreetings();
    }

    public GreetingsService getGreetingsService() {
        return greetingsService;
    }

    @Autowired
    @Qualifier("setterInjectedGreetingService")
    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
}
