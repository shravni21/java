package Reporting;

import Domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {
    public EmployeeReportFormatter(Employee e, FormatType f) {
        super(e, f);
    }
    public String getFormattedEmployee(){
        return getFormattedValue();
    }

}
