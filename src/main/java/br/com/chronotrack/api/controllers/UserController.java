package br.com.chronotrack.api.controllers;

import br.com.chronotrack.api.Dtos.AuthRequest;
import br.com.chronotrack.api.entities.Role;
import br.com.chronotrack.api.entities.User;
import br.com.chronotrack.api.services.UserService;
import io.quarkus.security.identity.AuthenticationRequestContext;
import io.quarkus.security.identity.request.AuthenticationRequest;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserController {

    @Inject
    private UserService userService;

    @GET
    @Path("{name}")
    public Response findUserByName(String name) {
        User user = userService.findByName(name);
        if (user != null) {
            return Response.ok(user).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @RolesAllowed(Role.Name.ADMIN)
    public void register(User user) {
        userService.createUser(user);
    }

    @POST
    @PermitAll
    @Path("authenticate")
    public Response authenticate(SecurityContext ctx) {
        return Response.ok("token").build();
    }

}
