package com.peploleum.jeecdi.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.peploleum.jeecdi.service.SomethingService;

@Path("rest")
public class RestService {

	@Inject
	private SomethingService service;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String get() {
		return this.service.getSomething();
	}
}
