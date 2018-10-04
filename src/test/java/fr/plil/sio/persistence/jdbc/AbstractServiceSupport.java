package fr.plil.sio.persistence.jdbc;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AbstractServiceSupport {

    private static final String create_table_group = "CREATE TABLE GROUP_T (GROUP_ID INT NOT NULL AUTO_INCREMENT, " +
            "NAME_C VARCHAR(50) UNIQUE NOT NULL, PRIMARY KEY(GROUP_ID))";

    private static final String drop_table_group = "DROP TABLE GROUP_T";

    @Autowired
    private DataSource dataSource;

    @Before
    public void createTables() throws SQLException {
        run(new String[]{create_table_group});
    }

    @After
    public void cleanupDatabase() throws SQLException {
        run(new String[]{drop_table_group});
    }

    private void run(String[] requests) throws SQLException {
        Connection connection = dataSource.getConnection();
        connection.setAutoCommit(false);
        for (String request : requests) {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(request);
            stmt.close();
        }
        connection.commit();
        connection.close();
    }
}
