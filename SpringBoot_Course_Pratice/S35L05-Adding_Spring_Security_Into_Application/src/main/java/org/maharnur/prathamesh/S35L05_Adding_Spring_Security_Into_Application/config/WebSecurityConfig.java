package org.maharnur.prathamesh.S35L05_Adding_Spring_Security_Into_Application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled=true, securedEnabled=true)
@Configuration
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
        .authorizeHttpRequests((auth) -> {
            auth
            .requestMatchers("/","/login","/register","/db-console/**",
             "/css/**", "/fonts/**", "/images/**", "/js/**")
            .permitAll()
            .anyRequest()
            .authenticated();
        });

        // TODO: remove these after upgrading the db from H2 infile DB
        http.csrf(csrf -> csrf.disable());
        http
            .headers(headers -> 
                headers
                .frameOptions(frameOptions -> frameOptions.disable()));
        return http.build();
    }
}
