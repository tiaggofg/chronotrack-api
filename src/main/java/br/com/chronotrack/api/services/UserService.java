package br.com.chronotrack.api.services;

import br.com.chronotrack.api.dtos.AuthCredentials;
import br.com.chronotrack.api.dtos.UserToken;
import br.com.chronotrack.api.entities.User;
import br.com.chronotrack.api.repositories.UserRepository;
import io.smallrye.jwt.build.Jwt;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.time.Instant;

@ApplicationScoped
public class UserService {

    @Inject
    private UserRepository userRepository;

    public UserService() {
    }

    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    public void createUser(User user) {
        userRepository.persist(user);
    }

    public UserToken generateJWT(AuthCredentials authCredentials) {
        User user = userRepository.find("username", authCredentials.getUsername()).firstResult();
        if (user == null || !user.getPassword().equals(authCredentials.getPassword())) {
            return null;
        }
        return userToken(user);
    }

    private UserToken userToken(User user) {
        Instant issueTime = Instant.now();

        String jwt = Jwt.upn(user.getEmail())
                .groups(user.getRoles())
                .issuedAt(issueTime)
                .expiresIn(3600)
                .sign();

        return new UserToken(jwt, issueTime.plusSeconds(3600));
    }
}
