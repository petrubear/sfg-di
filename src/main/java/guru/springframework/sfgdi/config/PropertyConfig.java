package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.beans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${guru.username}")
    String username;
    @Value("${guru.password}")
    String password;
    @Value("${guru.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource(){
        var fakeDs = new FakeDataSource();
        fakeDs.setUsername(username);
        fakeDs.setPassword(password);
        fakeDs.setUrl(url);
        return fakeDs;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        return configurer;
    }
}
