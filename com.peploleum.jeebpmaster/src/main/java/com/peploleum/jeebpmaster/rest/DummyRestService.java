package com.peploleum.jeebpmaster.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.peploleum.jeeboilerplate.com.peploleum.jeeservice.DummyDto;
import com.peploleum.jeeboilerplate.com.peploleum.jeeservice.DummyService;
import com.peploleum.jeebpmaster.service.SomethingService;

@Path("/dummy")
public class DummyRestService {

	@Inject
	private DummyService dummyService;
	
	@Inject
	private SomethingService somethingService;

	@GET
	@Path("/content")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSomething() {
		return this.somethingService.getSomething();
	}

	@GET
	@Path("/content2")
	@Produces(MediaType.APPLICATION_JSON)
	public DummyDto getDummyDto() {
		return this.dummyService.produce();
	}
}
