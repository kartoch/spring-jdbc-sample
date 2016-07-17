package fr.plil.sio.persistence.jdbc;

import fr.plil.sio.persistence.api.User;

public interface UserRepository {

    User findByName(String name);

    void delete(Long id);

    void save(User user);
}
