package Seminar07.Database;

import Seminar07.FinancialReport;
import Seminar07.ProductReport;
import Seminar07.Report;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class ReportDatabase implements Database{
    private Collection<Report> reports;

    public ReportDatabase(){}

    Random random = new Random();
    @Override
    public Collection<Report> getAll() {
        if (reports == null) {
            reports = new ArrayList<>();

            int quantity = 6 - random.nextInt(4);
            for (int i = 0; i < quantity; i++) {
                int number = random.nextInt(6);
                switch (number){
                    case 0:
                        FinancialReport financialReport = new FinancialReport("Monthly", "PDF", "Something good text..");
                        reports.add(financialReport);
                        break;
                    case 1:
                        FinancialReport financialReport01 = new FinancialReport("Monthly", "XML", "Something good text..");
                        reports.add(financialReport01);
                        break;
                    case 2:
                        FinancialReport financialReport02 = new FinancialReport("Yearly", "PDF", "Something good long text..");
                        reports.add(financialReport02);
                        break;
                    case 3:
                        ProductReport productReport = new ProductReport("Monthly", "PDF", "Something good text..");
                        reports.add(productReport);
                        break;
                    case 4:
                        ProductReport productReport01 = new ProductReport("Monthly", "XML", "Something good text..");
                        reports.add(productReport01);
                        break;
                    case 5:
                        ProductReport productReport02 = new ProductReport("Yearly", "PDF", "Something good long text..");
                        reports.add(productReport02);
                        break;
                }
            }
        }
        return reports;
    }

}
