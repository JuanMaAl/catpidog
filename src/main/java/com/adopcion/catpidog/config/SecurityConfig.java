package com.adopcion.catpidog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws
	Exception {
		http
			.authorizeHttpRequests(authz -> authz
					.requestMatchers("/api/**").authenticated()
					.anyRequest().permitAll()
					)
			.httpBasic(Customizer.withDefaults())
			.csrf(csrf -> csrf.disable());
		return http.build();
	}
	
	@Bean
	@Order(2)
	public UserDetailsService userDetailsService() {
		UserDetails user = User.builder()
				.username("usuario")
				.password(passwordEncoder().encode("user12345z"))
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(user);
	}
	
	@Bean
	@Order(1)
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}