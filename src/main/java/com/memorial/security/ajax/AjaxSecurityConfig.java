package com.memorial.security.ajax;
/*package com.memorial.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity // WebSecurityConfigurerAdapter 상속한 구현체를 정의 
// + 필터 체인을 활성화 시킬 수 있음.
@Order(0) // 중요!
public class AjaxSecurityConfig {
	@Autowired
	private AuthenticationConfiguration authenticationConfiguration;
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http
		//모든 구간 접근 해제 
		.authorizeHttpRequests().requestMatchers(
            new AntPathRequestMatcher("/**")).permitAll()
		
		.and()
		.addFilterBefore(ajaxLoginProcessingFilter(authenticationConfiguration), UsernamePasswordAuthenticationFilter.class);
		
		http.csrf().disable();
		
	
		http.exceptionHandling()
			.authenticationEntryPoint(new AjaxLoginAuthenticationEntryPoint())
				.accessDeniedHandler(ajaxAccessDeniedHandler());
		
		return http.build();
	}
	
	@Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }
	
	@Bean
	public AjaxLoginProcessingFilter ajaxLoginProcessingFilter(AuthenticationConfiguration authenticationConfiguration) throws Exception {
		AjaxLoginProcessingFilter ajaxLoginProcessingFilter = new AjaxLoginProcessingFilter();
		ajaxLoginProcessingFilter.setAuthenticationManager(authenticationManager(authenticationConfiguration));
		ajaxLoginProcessingFilter.setAuthenticationSuccessHandler(ajaxAuthenticationSuccessHandler());
		ajaxLoginProcessingFilter.setAuthenticationFailureHandler(ajaxAuthenticationFailureHandler());
		return ajaxLoginProcessingFilter;
	}
	
	@Bean
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(ajaxAuthenticationProvider());
	}
	
	@Bean
	public AuthenticationProvider ajaxAuthenticationProvider() {
		return new AjaxAuthenticationProvider();
	}
	
	@Bean
	public AuthenticationSuccessHandler ajaxAuthenticationSuccessHandler() {
		return new AjaxAuthenticationSuccessHandler();
	}
	
	@Bean
	public AuthenticationFailureHandler ajaxAuthenticationFailureHandler() {
		return new AjaxAuthenticationFailureHandler();
	}
	
	@Bean
	public AccessDeniedHandler ajaxAccessDeniedHandler() {
		return new AjaxAccessDeniedHandler();
	}
	
	private void customConfigurerAjax(HttpSecurity http, AuthenticationConfiguration authenticationConfiguration) throws Exception {
		http.
			apply(new AjaxLoginConfigurer<>())
			.successHandlerAjax(ajaxAuthenticationSuccessHandler())
			.failureHandlerAjax(ajaxAuthenticationFailureHandler())
			.setAuthenticationManager(authenticationManager(authenticationConfiguration))
			.loginProcessingUrl("/api/login");
	}
}
*/