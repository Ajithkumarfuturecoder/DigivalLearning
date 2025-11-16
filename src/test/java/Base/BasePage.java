package Base;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import IndependentPOM.LoginPage;
import Utils.ExtentManager;
import Utils.Screenshotutil;

public class BasePage {

    protected Playwright playwright;
    protected Browser browser;
    protected Page page;
    protected ExtentReports reports;   
    protected ExtentTest test;

    @BeforeMethod
    public void setUp(Method method) {
        reports = ExtentManager.getInstance();  
        test = reports.createTest(method.getName());

        playwright = Playwright.create();
        browser = playwright.chromium()
                 .launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
        page = browser.newPage();
        page.navigate("https://daweb-demo.gcp.digivalitsolutions.com/login");
        page.setDefaultTimeout(40000);
        
        LoginPage loginPage = new LoginPage(page);
		loginPage.login("ragulkanna1619@gmail.com", "Digival@123");

    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.fail(result.getThrowable());
            String screenshotPath = Screenshotutil.takeScreenshot(page, result.getName());
            
     
            System.out.println("*** screenshotPath : " + screenshotPath);
            String projectPath = System.getProperty("user.dir");

            String absoluteScreenshotPath = projectPath + "/" + screenshotPath;
            System.out.println(" *** absoluteScreenshotPath : " + absoluteScreenshotPath);

            test.addScreenCaptureFromPath(absoluteScreenshotPath, "screenshot");

        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Passed");
        } else {
            test.skip("Test skipped");
        }

        reports.flush();  
//        browser.close();
//        playwright.close();
    }
}
