package Seminar07;

public class FinancialReport implements Report{
    private int id;
    private String type;
    private String format;
    private String body;
    private static int counter = 400;

    {
        id = ++counter;
    }


    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getReportType() {
        return type;
    }

    @Override
    public String getReportFormat() {
        return format;
    }

    @Override
    public String getReportBody() {
        return body;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public FinancialReport(String type, String format, String body) {
        this.type = type;
        this.format = format;
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("\n#%d Financial Report \n Type: %s\n Format: %s\n Main content: %s", id, type, format, body);
    }
}
