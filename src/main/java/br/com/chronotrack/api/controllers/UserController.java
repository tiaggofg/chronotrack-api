package br.com.chronotrack.api.controllers;

import br.com.chronotrack.api.dtos.AuthCredentials;
import br.com.chronotrack.api.dtos.DefaultError;
import br.com.chronotrack.api.dtos.UserToken;
import br.com.chronotrack.api.entities.Role;
import br.com.chronotrack.api.entities.User;
import br.com.chronotrack.api.services.UserService;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.core.UriInfo;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class UserController {

    @Inject
    private UserService userService;

    @GET
    @PermitAll
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
    public Response register(User user) {
        userService.createUser(user);
        return Response.ok().build();
    }

    @POST
    @PermitAll
    @Path("authenticate")
    public Response authenticate(@Context UriInfo uriInfo, AuthCredentials authCredentials) {
        UserToken userToken = userService.generateJWT(authCredentials);
        if (userToken == null) {
            Status status = Status.fromStatusCode(401);

            DefaultError error = DefaultError.builder()
                    .message("Invalid Credentials!")
                    .status(status.getReasonPhrase())
                    .path(uriInfo.getPath())
                    .build();

            return Response.status(status).entity(error).build();
        }
        return Response.ok(userToken).build();
    }
}
