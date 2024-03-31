package com.pitisha.pitoshaversity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain getSecurityFilterChain(final HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(
                authorizeHttpRequests -> authorizeHttpRequests
                        .anyRequest()
                        .permitAll()
        )
                .csrf(AbstractHttpConfigurer::disable)
                .build();
    }

}
