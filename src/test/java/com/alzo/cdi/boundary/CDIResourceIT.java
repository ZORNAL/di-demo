package com.alzo.cdi.boundary;

import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class CDIResourceIT {

    @Test
    public void pingTest(){
        WebTarget path = ClientBuilder.newClient().target("http://localhost:8080").path("di-demo").path("resources").path("ping");
        Invocation.Builder request = path.request();
        Response response = request.get();
        System.out.print("Thread: " + response.getHeaderString("thread"));
        System.out.print("Resource: " + response.getHeaderString("resource"));
        System.out.print("Response: " + response.getEntity());
    }
}