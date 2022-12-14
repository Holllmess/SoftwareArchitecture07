package Seminar07.UI;

import Seminar07.BusinessLogic.ReportBusinessLogic;
import Seminar07.Database.DatabaseAccess;
import Seminar07.Database.DatabaseAccessReport;
import Seminar07.Database.ReportDatabase;
import Seminar07.FinancialReport;
import Seminar07.ProductReport;

import java.util.ArrayList;

public class UIReport implements UserInterface{
    private ReportDatabase reportDatabase = new ReportDatabase();
    private DatabaseAccessReport databaseAccessReport = new DatabaseAccessReport(reportDatabase);
    private ReportBusinessLogic reportBusinessLogic = new ReportBusinessLogic(databaseAccessReport);


    @Override
    public void createNewReport() {
        reportBusinessLogic.createReport();
    }

    @Override
    public void printAllFinReports() {
        ArrayList<FinancialReport> financialReports = (ArrayList<FinancialReport>)reportBusinessLogic.getAllFinReports();
        for (int i = 0; i < financialReports.size(); i++) {
            System.out.printf("*** #00%d ***", i);
            System.out.println(financialReports.get(i) + "\n");
        }
    }

    @Override
    public void printAllProdReports() {
        ArrayList<ProductReport> productReports = (ArrayList<ProductReport>)reportBusinessLogic.getAllProdReports();
        for (int i = 0; i < productReports.size(); i++) {
            System.out.printf("*** #00%d ***", i);
            System.out.println(productReports.get(i) + "\n");
        }
    }
}
