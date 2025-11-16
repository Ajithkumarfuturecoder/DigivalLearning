package IndependentAssessment;

import org.testng.annotations.Test;
import IndependentPOM.AssessmentCreationPage;
import IndependentPOM.LoginPage;
import Base.BasePage;

public class AssessmentCreationTest extends BasePage {

	@Test(priority = 1)
	public void Assessments() {


		AssessmentCreationPage Assessmentcreation = new AssessmentCreationPage(page);

		Assessmentcreation.ClickBurgericon();
		
	    Assessmentcreation.Assessment();
	    
	    Assessmentcreation.Assessmentcreations();
	    
	    Assessmentcreation.ClickCourseDropDown();
	    
	    Assessmentcreation.SearchCourse("ABUS407");
	    
	    

		}

	}
	
	

	


