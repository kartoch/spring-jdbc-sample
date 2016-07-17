package fr.plil.sio.persistence.api;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Group {

    private Long id;

    private String name;

    /**
     * Users in the group.
     */
    private Set<User> users = new TreeSet<>();

    /**
     * List of rights. The list CANNOT contains duplicate rights.
     */
    private List<Right> rights = new LinkedList<>();

    public List<Right> getRights() {
        return rights;
    }

    public void setRights(List<Right> rights) {
        this.rights = rights;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
