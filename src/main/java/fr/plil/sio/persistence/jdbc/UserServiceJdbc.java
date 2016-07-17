package fr.plil.sio.persistence.jdbc;

import fr.plil.sio.persistence.api.Right;
import fr.plil.sio.persistence.api.User;
import fr.plil.sio.persistence.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceJdbc implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(String name, String groupName) {
        return null;
    }

    @Override
    public boolean delete(String name) {
        return false;
    }

    @Override
    public User findByName(String name) {
        return null;
    }

    @Override
    public boolean isUserHasRight(String userName, Right right) {
        return false;
    }
}
