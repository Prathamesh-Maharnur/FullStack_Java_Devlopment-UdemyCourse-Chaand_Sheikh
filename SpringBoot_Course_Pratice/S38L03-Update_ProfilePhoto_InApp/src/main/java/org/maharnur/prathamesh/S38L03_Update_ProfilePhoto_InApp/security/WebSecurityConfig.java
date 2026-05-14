package org.maharnur.prathamesh.S38L03_Update_ProfilePhoto_InApp.security;

import org.maharnur.prathamesh.S38L03_Update_ProfilePhoto_InApp.util.constants.Privileges;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled=true, securedEnabled = true)
@Configuration
public class WebSecurityConfig {
    
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests(auth -> auth
            .requestMatchers("/","/login", "/register", "/db-console/**"
                , "/css/**", "/fonts/**", "/images/**", "/js/**", "/post/**"
                , "/posts/**", "/ckeditor5/**"
            )
            .permitAll()
            .requestMatchers("/profile/**", "/update_photo/**", "/uploads/**").authenticated()
            .requestMatchers("/admin/**").hasRole("ADMIN")
            .requestMatchers("/editor/**").hasAnyRole("ADMIN","EDITOR")
            .requestMatchers("/test/**").hasAuthority(Privileges.ACCESS_ADMIN_PANEL.getPrivilege())
        )
        .formLogin(formLogin -> formLogin
            .loginPage("/login")
            .loginProcessingUrl("/login")
            .usernameParameter("email")
            .passwordParameter("password")
            .defaultSuccessUrl("/",true)
            .failureUrl("/login?error")
            .permitAll()
        )
        .logout(logout -> logout
            .logoutUrl("/logout")
            .logoutSuccessUrl("/")
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
