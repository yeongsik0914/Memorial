package com.memorial.security;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class Securityconfig {
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
			//모든 구간 접근 해제 
			.authorizeHttpRequests().requestMatchers(
                new AntPathRequestMatcher("/**")).permitAll()
			
		//h2 db 설정	
		.and()
			.csrf().ignoringRequestMatchers(
					new AntPathRequestMatcher("/h2-console/**"))
		.and()
            .headers()
            .addHeaderWriter(new XFrameOptionsHeaderWriter(
                    XFrameOptionsHeaderWriter.XFrameOptionsMode.SAMEORIGIN))
        .and()
        	.formLogin()
        	.loginPage("/login")
        	.failureUrl("/")
			.defaultSuccessUrl("/")
			.permitAll()
		.and()
			.logout()
	        .logoutRequestMatcher(new AntPathRequestMatcher("/user/logout"))
	        .logoutSuccessUrl("/")
	        .invalidateHttpSession(true);
		
		return http.build();
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }
	
}
