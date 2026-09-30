package com.amplify.identity;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import org.keycloak.services.resource.RealmResourceProvider;

public class HelloResourceProvider implements RealmResourceProvider {

    @Override
    public Object getResource() {
        return this;
    }

    @Override
    public void close() {
    }

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public Response get() {
        return Response.ok("Hello Amplify").build();
    }

}
