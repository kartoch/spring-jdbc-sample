package fr.plil.sio.persistence.api;

public interface GroupService {

    Group create(String name);

    boolean delete(Group group);

    Group findByName(String name);

    boolean addUser(Group group, User user);

    boolean removeUser(Group group, User user);

    boolean addRight(Group group, Right right);

    boolean removeRight(Group group, Right right);
}
