package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingsRepositoryImpl implements GreetingsRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "Primärer Grußdienst";

    }
}
