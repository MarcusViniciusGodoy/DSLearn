package com.devsuperior.dslearn.config;

import com.devsuperior.dslearn.services.EmailService;
import com.devsuperior.dslearn.services.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    public EmailService emailService(){
        return new MockEmailService();
    }
}
