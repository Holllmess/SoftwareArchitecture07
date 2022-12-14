package Seminar07.Database;

import Seminar07.FinancialReport;
import Seminar07.ProductReport;
import Seminar07.Report;

import java.util.ArrayList;
import java.util.Collection;

public class DatabaseAccessReport implements DatabaseAccess{
    private final ReportDatabase reportDatabase;

    public DatabaseAccessReport(ReportDatabase reportDatabase) {
        this.reportDatabase = reportDatabase;
    }


    @Override
    public void addReport(Report report) {
        reportDatabase.getAll().add(report);
    }

    @Override
    public void removeReport(Report report) {
        reportDatabase.getAll().remove(report);
    }

    @Override
    public Collection<FinancialReport> getAllFinancials() {
        Collection<FinancialReport> financialReports = new ArrayList<>();
        for (Report report:reportDatabase.getAll()) {
            if (report instanceof FinancialReport){
                financialReports.add((FinancialReport)report);
            }
        }
        return financialReports;
    }

    @Override
    public Collection<ProductReport> getAllProducts() {
        Collection<ProductReport> productReports = new ArrayList<>();
        for (Report report:reportDatabase.getAll()) {
            if (report instanceof ProductReport){
                productReports.add((ProductReport)report);
            }
        }
        return productReports;
    }
}
