package Seminar07.BusinessLogic;

import Seminar07.Database.DatabaseAccess;
import Seminar07.FinancialReport;
import Seminar07.ProductReport;

import java.util.Collection;
import java.util.Scanner;

public class ReportBusinessLogic implements BusinessLogic{
    private final DatabaseAccess databaseAccess;
    private FinancialReport financialReport;
    private ProductReport productReport;

    public ReportBusinessLogic(DatabaseAccess databaseAccess) {
        this.databaseAccess = databaseAccess;
    }

    @Override
    public void createReport() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        //TODO: Годовой отчет всегда в PDF формате
        System.out.println("Select the report you want to create (enter the number):");
        System.out.println("1. Annual financial report");
        System.out.println("2. Annual product report");
        System.out.println("3. Monthly financial report (PDF format)");
        System.out.println("4. Monthly financial report (XML format)");
        System.out.println("5. Monthly product report (PDF format)");
        System.out.println("6. Monthly product report (XML format)");
//        int reportVariant = scanner.nextInt();
//        System.out.println("Enter the content of the report, please:");
//        String body = scanner1.nextLine();

        if (scanner.hasNextInt()){
            int reportVariant = scanner.nextInt();
            //scanner.nextLine();

            System.out.println("Enter the content of the report, please:");
            String body = scanner1.nextLine();
            //scanner1.nextLine();

            try {
                switch (reportVariant){
                    case 1:
                        financialReport = new FinancialReport("Yearly", "PDF", body);
                        databaseAccess.addReport(financialReport);
                        break;
                    case 2:
                        productReport = new ProductReport("Yearly", "PDF", body);
                        databaseAccess.addReport(productReport);
                        break;
                    case 3:
                        financialReport = new FinancialReport("Monthly", "PDF", body);
                        databaseAccess.addReport(financialReport);
                        break;
                    case 4:
                        financialReport = new FinancialReport("Monthly", "XML", body);
                        databaseAccess.addReport(financialReport);
                        break;
                    case 5:
                        productReport = new ProductReport("Monthly", "PDF", body);
                        databaseAccess.addReport(productReport);
                        break;
                    case 6:
                        productReport = new ProductReport("Monthly", "XML", body);
                        databaseAccess.addReport(productReport);
                        break;
                    default:
                        System.out.println("Enter the correct menu item, please love.");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    public Collection<FinancialReport> getAllFinReports() {
        return databaseAccess.getAllFinancials();
    }

    @Override
    public Collection<ProductReport> getAllProdReports() {
        return databaseAccess.getAllProducts();
    }
}
