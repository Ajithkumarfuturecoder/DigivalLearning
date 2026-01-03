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

	@Test(priority = 6)
	public void SelectCourse() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.SelectCourse();
	}

	@Test(priority = 7)
	public void CreateAssessment() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.CreateAssessment();
	}

	@Test(priority = 8)
	public void EntermarksInput() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.EntermarksInput("100");
	}

	@Test(priority = 9)
	public void EnterDurationInput() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.EnterDurationInput("30");
	}

	@Test(priority = 10)
	public void Clickplusicon() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.Clickplusicon();
	}

	@Test(priority = 11)
	public void McqQuestion() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.McqQuestion("Which of the following drugs is classified as a central nervous system stimulant?");
	}

	@Test(priority = 12)
	public void McqQuestionchoiceone() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.McqQuestionchoiceone("Heroin");
	}

	@Test(priority = 13)
	public void McqQuestionchoicetwo() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.McqQuestionchoicetwo("Cocaine");
	}

	@Test(priority = 14)
	public void McqQuestionchoicethree() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.McqQuestionchoicethree("LSD");
	}

	@Test(priority = 15)
	public void McqQuestionchoicefour() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.McqQuestionchoicefour("Alcohol");
	}

	@Test(priority = 16)
	public void Mcqselectrightanswer() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.Mcqselectrightanswer();
	}

	@Test(priority = 17)
	public void Mcqmedia() {
	    AssessmentCreationPage acp = new AssessmentCreationPage(page);
	    acp.McqMedia();

	    // Assertion with retry and timeout (Playwright built-in)
//	    assertThat(page.locator("text=Invalid URL")).isVisible();
	}

	@Test(priority = 18)
	public void Mcqsessiontopic() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.Mcqsessiontopic();

	}

	@Test(priority = 19)
	public void clicksessiontopicformcq() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.clicksessiontopicformcq();

	}

	@Test(priority = 20)
	public void Selectsessiontopicformcq() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.Selectsessiontopicformcq();

	}

	@Test(priority = 21)
	public void clickclomappingmcq() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.clickclomappingmcq();

	}

	@Test(priority = 22)
	public void selectclomappingonemcq() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.selectclomappingonemcq();
	}

	@Test(priority = 23)
	public void clicktaxonomy() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.clicktaxonomy();

	}
	
	@Test(priority = 24)
	public void selecttaxonomyforfirstmcq() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.selecttaxonomyforfirstmcq();

	}
}
