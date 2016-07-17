package fr.plil.sio.persistence.jdbc;

import fr.plil.sio.persistence.api.Group;
import fr.plil.sio.persistence.api.GroupService;
import fr.plil.sio.persistence.api.Right;
import fr.plil.sio.persistence.api.User;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceJdbc implements GroupService {
    @Override
    public Group create(String name) {
        return null;
    }

    @Override
    public boolean delete(Group group) {
        return false;
    }

    @Override
    public Group findByName(String name) {
        return null;
    }

    @Override
    public boolean addUser(Group group, User user) {
        return false;
    }

    @Override
    public boolean removeUser(Group group, User user) {
        return false;
    }

    @Override
    public boolean addRight(Group group, Right right) {
        return false;

    }

    @Override
    public boolean removeRight(Group group, Right right) {
        return false;
    }
}
