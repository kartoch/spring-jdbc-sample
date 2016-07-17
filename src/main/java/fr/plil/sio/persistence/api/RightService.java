package fr.plil.sio.persistence.api;

public interface RightService {

    Right create(String name);

    Right create(String name, Right parent);

    boolean delete(Right group);

    Right findByName(String name);
}
