package Seminar07;

import Seminar07.BusinessLogic.ReportBusinessLogic;
import Seminar07.Database.DatabaseAccess;
import Seminar07.Database.DatabaseAccessReport;
import Seminar07.Database.ReportDatabase;
import Seminar07.UI.UIReport;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UIReport uiReport = new UIReport();
        
        uiReport.createNewReport();
        uiReport.printAllFinReports();

        /**
         * *** #000 ***
         * #401 Financial Report
         *  Type: Yearly
         *  Format: PDF
         *  Main content: Something financial complex information... income/expenses
         *
         * *** #001 ***
         * #403 Financial Report
         *  Type: Yearly
         *  Format: PDF
         *  Main content: Something good long text..
         *
         * *** #002 ***
         * #401 Financial Report
         *  Type: Monthly
         *  Format: PDF
         *  Main content: Too much information... too much
         *
         */

    }
}
