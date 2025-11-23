package IndependentAssessment;

import org.testng.annotations.Test;

import Base.BasePage;
import IndependentPOM.LoginPage;

public class LoginTest extends BasePage {

    @Test
    public void loginSuccessTest() {
    	
    	LoginPage loginPage = new LoginPage(page);
        loginPage.login("ragulkanna1619@gmail.com", "Digival@123");
    
        test.info("All test completed");
    }
}
