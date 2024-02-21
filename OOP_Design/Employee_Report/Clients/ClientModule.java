package Clients;

import Domain.Employee;
import Domain_dao.EmployeeDAO;
import Reporting.EmployeeReportFormatter;
import Reporting.FormatType;

import java.sql.SQLException;
import java.util.Formatter;

public class ClientModule {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Shravni", "ML", true);
        ClientModule client = new ClientModule();
        printEmployeeReport(employee, FormatType.XML);
        try {
            client.hireNewEmploee(employee);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void hireNewEmploee(Employee e) throws SQLException {
        EmployeeDAO e1 = new EmployeeDAO();
        e1.saveEmployee(e);

    }

    public void TerminateEmployee(Employee e) {
        EmployeeDAO e1 = new EmployeeDAO();
        e1.deleteEmployee(e);
    }

    public static void printEmployeeReport(Employee e, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(e, FormatType.CSV);
        System.out.println(formatter.getFormattedEmployee());
    }
}
