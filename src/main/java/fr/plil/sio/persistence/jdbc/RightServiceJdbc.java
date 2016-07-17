package fr.plil.sio.persistence.jdbc;

import fr.plil.sio.persistence.api.Right;
import fr.plil.sio.persistence.api.RightService;
import org.springframework.stereotype.Service;

@Service
public class RightServiceJdbc implements RightService{
    @Override
    public Right create(String name) {
        return null;
    }

    @Override
    public Right create(String name, Right parent) {
        return null;
    }

    @Override
    public boolean delete(Right group) {
        return false;
    }

    @Override
    public Right findByName(String name) {
        return null;
    }
}
