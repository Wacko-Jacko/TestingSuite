package crm.auto.utils;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
    private static ExtentReports extent;

    //Method to initiate ExtentReporter
    public synchronized static ExtentReports getReporter(){
        extent = new ExtentReports(System.getProperty("user.dir")+"\\target\\ExtentReport\\CRMTestResults.html", false);
        extent.addSystemInfo("reportHeadline", "CRM Report");
        return extent;
    }
}
