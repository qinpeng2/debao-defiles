/**
 * 
 */
package com.debao.defiles.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class FailureHandler implements AuthenticationFailureHandler {

	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException exception)
			throws IOException, ServletException {
		//if error , error time +1 
		// if error > 2  add checkcode
		System.out.println("aaa");
	}

	

}
