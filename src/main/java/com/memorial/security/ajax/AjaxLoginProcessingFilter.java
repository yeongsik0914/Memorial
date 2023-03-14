package com.memorial.security.ajax;
/*package com.memorial.security;

import static org.springframework.http.HttpMethod.POST;

import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.memorial.dto.UserCreateForm;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AjaxLoginProcessingFilter extends AbstractAuthenticationProcessingFilter {
	
	private ObjectMapper objectMapper = new ObjectMapper();
	
	public AjaxLoginProcessingFilter() {
    	// 작동 조건
		super(new AntPathRequestMatcher("/api/login", POST.name()));
	}
	
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
		
		if (!isAjax(request)) {
			throw new IllegalStateException("Authentication is not supported");
		}
		
		UserCreateForm userCreateForm = objectMapper.readValue(request.getReader(), UserCreateForm.class);
		if (!StringUtils.hasText(userCreateForm.getEmail())
			|| !StringUtils.hasText(userCreateForm.getPassword())) {
			throw new IllegalArgumentException("Email or password is empty");
		}
		
		AjaxAuthenticationToken ajaxAuthenticationToken
			= new AjaxAuthenticationToken(userCreateForm.getUsername(), userCreateForm.getPassword());
		
		return getAuthenticationManager().authenticate(ajaxAuthenticationToken);
	}
	
	private boolean isAjax(HttpServletRequest request) {
		return "XMLHttpRequest".equals(request.getHeader("X-Requested-With"));
	}
}
*/