package Domain_dao;

import Domain.Employee;

import java.sql.SQLException;

public class EmployeeDAO {
    //Data Access Object
    public void saveEmployee(Employee employee) throws SQLException {
//        Database.DatabaseConnectionManager connectionManager = Database.DatabaseConnectionManager.getManagerInstance();
//        connectionManager.getConnectionObject().prepareStatement("");

        System.out.println("Saved employee to the database."+ employee);
    }

    public void deleteEmployee(Employee employee) {
        System.out.println("Deleted employee from the database");
    }
}
