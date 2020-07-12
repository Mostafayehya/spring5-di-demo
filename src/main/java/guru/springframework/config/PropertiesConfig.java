package guru.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertiesConfig {

    @Value("${guru.firstname}")
    String firstName;

    @Value("${guru.password}")
    String password;

    @Value("${guru.url}")
    String url;

    @Bean
    DataSourceConfiguration dataSourceConfiguration() {
        return new DataSourceConfiguration(firstName, password, url);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
