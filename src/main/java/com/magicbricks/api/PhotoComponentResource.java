package com.magicbricks.api;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.magicbricks.service.PhotoComponentService;
import com.magicbricks.utils.CurrentDevice;

import io.vertx.core.http.HttpServerRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Path("/property")
public class PhotoComponentResource {
	@Context
	private HttpServerRequest request;

	@Inject
	private PhotoComponentService service;

	@Inject
	private CurrentDevice device;

	@Path("/photos")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String photoComponent() {
		log.info("Is mobile :{}" , device.isMobile(request));
		return service.getPotoComponent();
	}
}
