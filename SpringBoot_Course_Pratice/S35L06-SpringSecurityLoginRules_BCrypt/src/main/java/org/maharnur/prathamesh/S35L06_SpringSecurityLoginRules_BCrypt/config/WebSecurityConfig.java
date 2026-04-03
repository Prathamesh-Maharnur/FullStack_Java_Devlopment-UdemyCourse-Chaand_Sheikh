package org.maharnur.prathamesh.S35L06_SpringSecurityLoginRules_BCrypt.config;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

// login: username-'user' and password-'password is generated in console' 

@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class WebSecurityConfig {
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
