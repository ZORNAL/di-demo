package com.alzo.ping.boundary;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;

@RequestScoped
public class PingService {


    public static final String PING_TEMPLATE = "%s @%s on %s";
    public static final String RESOURCE = "resource";
    public static final String THREAD = "thread";


    public Response buildPingResponse(final String resourceName) {
        long now = System.currentTimeMillis();
        final String threadName = Thread.currentThread().getName();
        final String text = String.format(PING_TEMPLATE, resourceName, now, threadName);
        return Response.ok(text).header(RESOURCE, resourceName).header(THREAD, threadName).build();
    }
}
