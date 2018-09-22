package com.septauth.custom;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;

import com.wavemaker.runtime.security.WMAuthenticationSuccessHandler;

public class CustomSuccessHandler extends WMAuthenticationSuccessHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomSuccessHandler.class);
	public CustomSuccessHandler() {
		super();
		LOGGER.debug("CustomSuccessHandlerConstructor: {}" , System.currentTimeMillis());
		
	}

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		LOGGER.info("CustomSuccessHandler onAuthenticationSuccess enter : {}" , System.currentTimeMillis());
		super.onAuthenticationSuccess(request, response, authentication);
		System.out.println("******custom-success-hander********");
		LOGGER.info("CustomSuccessHandler onAuthenticationSuccess exit : {}" , System.currentTimeMillis());
	}

	@Override
	protected String determineTargetUrl(final HttpServletRequest request, final HttpServletResponse response) {
		LOGGER.info("CustomSuccessHandler determineTargetUrl : {}" , System.currentTimeMillis());
		String targetUrl = super.determineTargetUrl(request, response);
		return targetUrl;
	}
}