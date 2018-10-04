package fr.plil.sio.persistence.jdbc;

import fr.plil.sio.persistence.api.Group;

import java.sql.Connection;

public interface GroupRepository {

    Group findByName(String name, Connection connection);

    void delete(Long id);

    void save(Group group, Connection connection);
}
