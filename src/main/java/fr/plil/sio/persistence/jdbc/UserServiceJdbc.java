package fr.plil.sio.persistence.jdbc;

import fr.plil.sio.persistence.api.Right;
import fr.plil.sio.persistence.api.User;
import fr.plil.sio.persistence.api.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceJdbc implements UserService {

    @Override
    public User create(String name, String groupName) {
        throw new IllegalStateException("not implemented !");
    }

    @Override
    public boolean delete(String name) {
        throw new IllegalStateException("not implemented !");
    }

    @Override
    public User findByName(String name) {
        throw new IllegalStateException("not implemented !");
    }

    @Override
    public boolean isUserHasRight(String userName, Right right) {
        throw new IllegalStateException("not implemented !");
    }
}
