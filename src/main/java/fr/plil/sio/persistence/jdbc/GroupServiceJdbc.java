package fr.plil.sio.persistence.jdbc;

import fr.plil.sio.persistence.api.Group;
import fr.plil.sio.persistence.api.GroupService;
import fr.plil.sio.persistence.api.Right;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceJdbc implements GroupService {
    @Override
    public Group create(String name) {
        return null;
    }

    @Override
    public boolean delete(String name) {
        return false;
    }

    @Override
    public Group findByName(String name) {
        return null;
    }

    @Override
    public boolean addUser(String groupName, String userName) {
        return false;
    }

    @Override
    public boolean removeUser(String groupName, String userName) {
        return false;
    }

    @Override
    public boolean addRight(String groupName, Right right) {
        return false;
    }

    @Override
    public boolean removeRight(String groupName, Right right) {
        return false;
    }
}
