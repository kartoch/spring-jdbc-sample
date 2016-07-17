package fr.plil.sio.persistence.api;

import java.util.Set;

public class Right {

    private Long id;

    private String name;

    private Right parent;

    private Set<Right> siblings;

    public Set<Right> getSiblings() {
        return siblings;
    }

    public void setSiblings(Set<Right> siblings) {
        this.siblings = siblings;
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

    public Right getParent() {
        return parent;
    }

    public void setParent(Right parent) {
        this.parent = parent;
    }
}
