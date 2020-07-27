package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default", "DE"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "Hola Mundo - ES";
    }
}
