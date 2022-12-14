package Seminar07.Database;

import Seminar07.FinancialReport;
import Seminar07.ProductReport;
import Seminar07.Report;

import java.util.Collection;

public interface DatabaseAccess {
    void addReport(Report report);
    void removeReport(Report report);
    Collection<FinancialReport> getAllFinancials();
    Collection<ProductReport> getAllProducts();
}
