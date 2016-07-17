package fr.plil.sio.persistence.api;

public interface UserService {

    User create(String name);

    boolean delete(User user);

    User findByName(String name);

    boolean isUserHasRight(User user, Right right);
}
