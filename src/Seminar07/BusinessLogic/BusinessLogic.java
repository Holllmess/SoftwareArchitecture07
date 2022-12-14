package Seminar07.BusinessLogic;

import Seminar07.FinancialReport;
import Seminar07.ProductReport;

import java.util.Collection;

public interface BusinessLogic {
    void createReport();
    Collection<FinancialReport> getAllFinReports();
    Collection<ProductReport> getAllProdReports();
}
