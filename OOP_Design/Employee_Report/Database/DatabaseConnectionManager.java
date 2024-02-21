package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();
    private Connection conn;

    private DatabaseConnectionManager() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_report");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DatabaseConnectionManager getManagerInstance() {
        return connectionInstance;
    }

    public Connection getConnectionObject() {
        return conn;
    }
}
