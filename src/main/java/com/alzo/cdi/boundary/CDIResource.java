package com.alzo.cdi.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("cdi")
public class CDIResource {

    @Path("ping")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping(){
        return String.format("%s @%s on %s", "cdi", System.currentTimeMillis(), Thread.currentThread().getName()) ;
    }
}
