package fr.plil.sio.persistence.jdbc;

import fr.plil.sio.persistence.api.Group;
import fr.plil.sio.persistence.api.GroupService;
import fr.plil.sio.persistence.api.Right;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Service
public class GroupServiceJdbc implements GroupService {

    private DataSource dataSource;

    private GroupRepository groupRepository;

    @Override
    public Group create(String name) {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            if (name == null) {
                throw new IllegalArgumentException("name cannot be null");
            }
            Group group = groupRepository.findByName(name, connection);
            if (group != null) {
                throw new IllegalStateException("a group with the same name already exists");
            }
            group = new Group();
            group.setName(name);
            groupRepository.save(group, connection);
            connection.commit();
            return group;
        } catch (SQLException e) {
            throw new UnsupportedOperationException("sql exception", e);
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new UnsupportedOperationException("sql exception during connection close", e);
            }
        }
    }

    @Override
    public boolean delete(String name) {
        throw new IllegalStateException("not implemented !");
    }

    @Override
    public Group findByName(String name) {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            if (name == null) {
                throw new IllegalArgumentException("name cannot be null");
            }
            return groupRepository.findByName(name, connection);
        } catch (SQLException e) {
            throw new UnsupportedOperationException("sql exception", e);
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new UnsupportedOperationException("sql exception during connection close", e);
            }
        }
    }

    @Override
    public boolean addRight(String groupName, Right right) {
        throw new IllegalStateException("not implemented !");
    }

    @Override
    public boolean removeRight(String groupName, Right right) {
        throw new IllegalStateException("not implemented !");
    }

    @Autowired
    public void setGroupRepository(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

}
