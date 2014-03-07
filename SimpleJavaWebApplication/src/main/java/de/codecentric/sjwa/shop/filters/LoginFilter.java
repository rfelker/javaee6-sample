package de.codecentric.sjwa.shop.filters;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		// NOP
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException,
			ServletException {

		// see https://tomcat.apache.org/tomcat-7.0-doc/realm-howto.html
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		Principal principal = httpServletRequest.getUserPrincipal();
		// String name = principal.getName();

		// check against the database
		filterChain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// NOP

	}

}
