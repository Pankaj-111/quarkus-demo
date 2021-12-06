package com.magicbricks;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.magicbricks.repository.TpcndRepo;

@Path("/hello")
public class ExampleResource {
	
	@Inject
	TpcndRepo repo;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
    	System.out.println("Total tpcnd :"+repo.findCount());
        return "Hello RESTEasy";
    }
}