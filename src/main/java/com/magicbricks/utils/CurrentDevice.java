package com.magicbricks.utils;

import javax.enterprise.context.ApplicationScoped;

import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;
import io.vertx.core.http.HttpServerRequest;

@ApplicationScoped
public class CurrentDevice {

	private static final String USER_AGENT = "User-Agent";

	@SuppressWarnings("deprecation")
	public boolean isMobile(final HttpServerRequest request) {
		final UserAgent userAgent = getUserAgent(request);
		return userAgent.getOperatingSystem().isMobileDevice();
	}

	
	
	public OperatingSystem getOperatingSystem(final HttpServerRequest request) {
		final UserAgent userAgent = getUserAgent(request);
		return userAgent.getOperatingSystem();
	}
	
	private UserAgent getUserAgent(final HttpServerRequest request) {
		final UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader(USER_AGENT));
		return userAgent;
	}
}
