package org.acme.getting.started;

import java.io.IOException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Resource {
    @Inject
    Repo repo;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws IOException{
         repo.callBlockingCode();
         return Thread.currentThread().getName();

    }
}