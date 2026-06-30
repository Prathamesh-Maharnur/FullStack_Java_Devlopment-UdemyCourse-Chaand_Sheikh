package org.maharnur.prathamesh.S47L08_Download_PhotoAPI.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

        private RSAKey rsaKey;

        @Bean
        public JWKSource<SecurityContext> jwkSource() {
                rsaKey = Jwks.generateRsa();
                JWKSet jwkSet = new JWKSet(rsaKey);
                return (jwkSelector, securityContext) -> jwkSelector.select(jwkSet);
        }

        @Bean
        public static PasswordEncoder passwordEncoder() {
                return new BCryptPasswordEncoder();
        }

        // @Bean
        // public InMemoryUserDetailsManager users() {
        // return new InMemoryUserDetailsManager(
        // User.withUsername("prathamesh")
        // .password("{noop}password")
        // .authorities("read")
        // .build());
        // }

        @Bean
        public AuthenticationManager authManager(UserDetailsService userDetailService) {
                var authProvider = new DaoAuthenticationProvider(userDetailService);
                authProvider.setPasswordEncoder(passwordEncoder());
                return new ProviderManager(authProvider);
        }

        @Bean
        JwtEncoder jwtEncoder(JWKSource<SecurityContext> jwks) {
                return new NimbusJwtEncoder(jwks);
        }

        @Bean
        JwtDecoder jwtDecoder() throws JOSEException {
                return NimbusJwtDecoder.withPublicKey(rsaKey.toRSAPublicKey()).build();
        }

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                http.csrf(csrf -> csrf.ignoringRequestMatchers("/db-console/**"))
                                .headers(headers -> headers
                                                .frameOptions(frameOptions -> frameOptions
                                                                .sameOrigin()))
                                .authorizeHttpRequests(auth -> auth
                                                .requestMatchers("/", "/api/v1/auth/token", "/api/v1/auth/users/add",
                                                                "/swagger-ui/**", "/swagger-ui.html/**",
                                                                "/v3/api-docs/**", "/db-console/**", "/error", "/uploads/**")
                                                .permitAll()
                                                .requestMatchers("/api/v1/auth/profile",
                                                                "/api/v1/auth/profile/update-password",
                                                                "/api/v1/auth/profile/delete",
                                                                "/api/v1/albums/add",
                                                                "/api/v1/albums",
                                                                "/api/v1/albums/{album_id}/upload-photos",
                                                                "/api/v1/albums/{album_id}/photos/{photo_id}/download-photo"
                                                        )
                                                .authenticated()
                                                .requestMatchers("/api/v1/auth/users",
                                                                "/api/v1/auth/users/{user_id}/update-authorities")
                                                .hasAuthority("SCOPE_ADMIN"))
                                .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()))
                                .sessionManagement(session -> session
                                                .sessionCreationPolicy(SessionCreationPolicy.STATELESS));

                // TODO: remove these after upgrading the DB from H2 infile DB
                http.csrf(csrf -> csrf.disable())
                                .headers(headers -> headers
                                                .frameOptions(frameOptions -> frameOptions.disable()));

                return http.build();
        }
}
