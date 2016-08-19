package com.peploleum.jeecdi.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.peploleum.jeecdi.service.*;

import java.util.List;

@Path("rest")
public class RestService {

    @Inject
    private UserContextService service;

    @Inject
    SearchService searchService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public UserContextDto get() {
        return this.service.getSomething();
    }

    @GET
    @Path("search")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SearchDto> getDtoList() {
        return searchService.getResult();
    }

    @GET
    @Path("search/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public SearchDto getDtoById(@PathParam("id") String id) {
        return searchService.getResultById(id);
    }

    @GET
    @Path("search/substring/{search}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SearchDto> getDtoByName(@PathParam("search") String search) {
        return searchService.getResultsByContent(search);
    }
}
