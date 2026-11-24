package tn.supcom.traceit.api;

import jakarta.annotation.security.DenyAll;
import jakarta.annotation.security.PermitAll;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Map;

@Path("/health")
@DenyAll
public class HealthResource {

    @GET
    @PermitAll
    @Produces(MediaType.APPLICATION_JSON)
    public Response ping() {

        return Response.ok(
                Map.of("status", "up")
        ).build();
    }
}