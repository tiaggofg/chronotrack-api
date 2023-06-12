package br.com.chronotrack.api.repositories;

import br.com.chronotrack.api.entities.User;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheMongoRepository<User> {

    public User findByName(String name) {
        return find("name", name).firstResult();
    }
}
