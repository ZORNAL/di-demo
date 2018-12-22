package com.alzo.ejb.boundary;

import com.alzo.ping.boundary.PingService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("ejb")
@Stateless
public class EJBResource {

    public static final String EJB = "ejb";
    @Inject
    private PingService pingService;

    @Path("ping")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response ping(){
        return pingService.buildPingResponse(EJB);
    }
}
