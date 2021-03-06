package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingsService greetingsService;

    public MyController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello() {
        System.out.println(greetingsService.sayGreetings());
        return "Hi Folks!";
    }
}
