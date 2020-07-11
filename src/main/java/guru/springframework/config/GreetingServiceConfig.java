package guru.springframework.config;


import guru.services.GreetingRepository;
import guru.services.GreetingService;
import guru.services.GreetingServiceFactory;
import guru.services.PrimaryGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"en", "default"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("en");
    }
    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("de");
    }
    @Bean
    @Profile("es")
    @Primary
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("es");
    }

}
