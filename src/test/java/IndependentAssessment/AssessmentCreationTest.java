package IndependentAssessment;

import org.testng.annotations.Test;
import IndependentPOM.AssessmentCreationPage;
import Base.BasePage;

public class AssessmentCreationTest extends BasePage {

    @Test(priority = 1)
    public void BurgerIcon() {
        AssessmentCreationPage acp = new AssessmentCreationPage(page);
        acp.ClickBurgericon();
    }

    @Test(priority = 2)
    public void Assessment() {
        AssessmentCreationPage acp = new AssessmentCreationPage(page);
        acp.Assessment();
    }

    @Test(priority = 3)
    public void AssessmentCreation() {
        AssessmentCreationPage acp = new AssessmentCreationPage(page);
        acp.Assessmentcreations();
    }

    @Test(priority = 4)
    public void CourseDropDown() {
        AssessmentCreationPage acp = new AssessmentCreationPage(page);
        acp.ClickCourseDropDown();
    }

    @Test(priority = 5)
    public void SearchCourse() {
        AssessmentCreationPage acp = new AssessmentCreationPage(page);
        acp.SearchCourse("ABUS407");
    }
}
