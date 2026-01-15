package Base;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import IndependentPOM.LoginPage;
import Utils.ExtentManager;
import Utils.Screenshotutil;

public class BasePage {

    public  Playwright playwright;
    protected Browser browser;
    protected Page page;
    protected ExtentReports reports;   
    protected ExtentTest test; 

    @BeforeClass
    public void setUpClass() {
        reports = ExtentManager.getInstance();

        playwright = Playwright.create();
        
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000).setArgs(List.of("--start-maximized")));
        BrowserContext context = browser.newContext(
        	    new Browser.NewContextOptions()
        	        .setViewportSize(null)   
        	);
        page = context.newPage(); 
        page.navigate("https://daweb-demo.gcp.digivalitsolutions.com/login");
        page.setDefaultTimeout(40000);

        LoginPage loginPage = new LoginPage(page);
        loginPage.login("ragulkanna1619@gmail.com", "Digival@123");
    }

    @BeforeMethod
    public void startTest(Method method) {
        test = reports.createTest(method.getName());
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.fail(result.getThrowable());
            String screenshotPath = Screenshotutil.takeScreenshot(page, result.getName());
            String absolutePath = System.getProperty("user.dir") + "/" + screenshotPath;
            test.addScreenCaptureFromPath(absolutePath, "screenshot");
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Passed");
        } else {
            test.skip("Skipped");
        }
        reports.flush();
    }

    @AfterClass
    public void tearDownClass() throws InterruptedException {
    	Thread.sleep(5000);
//        browser.close();
        playwright.close();
    }
}
