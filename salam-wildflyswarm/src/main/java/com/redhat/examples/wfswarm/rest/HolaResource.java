package com.redhat.examples.wfswarm.rest;

import org.apache.deltaspike.core.api.config.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/api/salam")
public class HolaResource {

	@Inject
	@ConfigProperty(name = "WF_SWARM_SAYING", defaultValue = "Salam")
	private String saying;

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok(saying + " dari WF Swarm").build();
	}
}