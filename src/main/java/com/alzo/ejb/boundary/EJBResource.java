package com.alzo.ejb.boundary;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ejb")
@Stateless
public class EJBResource {

    @Path("ping")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping(){
        return String.format("%s @%s on %s", "ejb", System.currentTimeMillis(), Thread.currentThread().getName()) ;
    }
}
