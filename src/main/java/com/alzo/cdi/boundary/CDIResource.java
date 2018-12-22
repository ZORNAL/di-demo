package com.alzo.cdi.boundary;

import com.alzo.ping.boundary.PingService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("cdi")
public class CDIResource {

    public static final String CDI = "cdi";

    @Inject
    private PingService pingService;

    @Path("ping")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response ping(){
        return pingService.buildPingResponse(CDI);
    }

}
