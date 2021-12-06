package com.magicbricks.api;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.magicbricks.repository.TpcndRepo;
import com.magicbricks.utils.CurrentDevice;

import io.vertx.core.http.HttpServerRequest;

@Path("/property")
public class PhotoComponentResource {
	@Context
	private HttpServerRequest request;

	@Inject
	private TpcndRepo repo;

	@Inject
	private CurrentDevice device;

	@Path("/photos")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String photoComponent() {
		System.out.println("HHHHHHHHHHH is mobile :" + device.isMobile(request));
		System.out.println("10 th city  :" + repo.getByGroup("City").get(10).getCnddesc());
		return "Photo Component";
	}
}
