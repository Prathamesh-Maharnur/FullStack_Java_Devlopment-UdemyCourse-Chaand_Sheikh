package org.maharnur.prathamesh.S35L07_SecurityLogin_LoadUserByUsername.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

//login: username-'user' and password-'is generated in console' not sure webpage will work

@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true, securedEnabled = true)
@Configuration
public class WebSecurityConfig {
   
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
        .authorizeHttpRequests(auth -> auth
            .requestMatchers("/","/login", "/register", "/db-console/**"
                , "/css/**", "/fonts/**", "/images/**", "/js/**"
            )
            .permitAll()
            .anyRequest()
            .authenticated()
        )
        .formLogin(formlogin -> formlogin
            .loginPage("/login")
            .loginProcessingUrl("/login")
            .usernameParameter("email")
            .passwordParameter("password")
            .defaultSuccessUrl("/", true)
            .failureUrl("/login?error")
            .permitAll()
        )
        .logout(logout -> logout
            .logoutUrl("/logout")
            .logoutSuccessUrl("/logout?success")
        )
        .httpBasic(Customizer.withDefaults());

        // TODO: remove these after upgrading the db from H2 infile DB
        http.csrf(csrf -> csrf.disable());
        http.headers(headers -> headers
            .frameOptions(frameOptions -> frameOptions.disable())
        );
    
        return http.build();
    }
}
