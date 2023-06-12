package br.com.chronotrack.api.services;

import br.com.chronotrack.api.entities.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import br.com.chronotrack.api.repositories.UserRepository;

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
}
