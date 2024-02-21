package Reporting;

import Reporting.FormatType;

public class ReportFormatter {
    String formattedOutput;
    public ReportFormatter(Object obj, FormatType f) {
        switch (f) {
            case XML:
                formattedOutput=convertObjectTOXML(obj);
                break;
            case CSV:
               formattedOutput= convertObjectTOCSV(obj);
                break;
        }
    }

    private String convertObjectTOXML(Object obj) {
        return "XML: <title>" + obj.toString() + "</title>";
    }

    private String convertObjectTOCSV(Object obj) {
        return "XML: ,,, '" + obj.toString() + ",,,,";
    }
    protected String getFormattedValue(){
        return formattedOutput;
    }
}
