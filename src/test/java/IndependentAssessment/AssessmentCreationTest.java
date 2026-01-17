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
		acp.mcqoneimageMedia();

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

	@Test(priority = 25)
	public void Clickplusicontwo() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.Clickplusicontwo();
	}

	@Test(priority = 26)

	public void McqQuestiontwo() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.McqQuestiontwo("Which of the following drugs is classified as an opioid?");

	}

	@Test(priority = 27)

	public void McqQuestiontwochoiceone() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.McqQuestiontwochoiceone("Cocaine");

	}

	@Test(priority = 28)

	public void McqQuestiontwochoicetwo() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.McqQuestiontwochoicetwo("Heroin");

	}

	@Test(priority = 29)

	public void McqQuestiontwochoicethree() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.McqQuestiontwochoicethree("LSD");

	}

	@Test(priority = 30)

	public void McqQuestiontwochoicefour() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.McqQuestiontwochoicefour("Cannabis");

	}

	@Test(priority = 31)

	public void Mcqquestiontwoselectrightanswer() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.Mcqquestiontwoselectrightanswer();

	}

	@Test(priority = 32)
	public void mcqtwoaudioMedia() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.mcqtwoaudioMedia();
	}

	@Test(priority = 33)
	public void clickmcqtwomapping() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.clickmcqtwomapping();
	}

	@Test(priority = 34)
	public void clicksessiontopicformcqtwo() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.clicksessiontopicformcqtwo();
	}

	@Test(priority = 35)
	public void Selectsessiontopicformcqtwo() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.Selectsessiontopicformcqtwo();
	}

	@Test(priority = 36)
	public void clickclomappingmcqtwo() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.clickclomappingmcqtwo();
	}

	@Test(priority = 37)
	public void selectclomappingonemcqtwo() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.selectclomappingonemcqtwo();
	}

	@Test(priority = 38)
	public void selectclomappingtwomcqtwo() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.selectclomappingtwomcqtwo();
	}

	@Test(priority = 39)
	public void clicktaxonomymcqtwo() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.clicktaxonomymcqtwo();
	}

	@Test(priority = 40)
	public void selecttaxonomyoneforsecondmcq() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.selecttaxonomyoneforsecondmcq();
	}

	@Test(priority = 41)

	public void selecttaxonomytwoforsecondmcq() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.selecttaxonomytwoforsecondmcq();
	}

	@Test(priority = 42)

	public void Clickplusiconthree() {
		
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.Clickplusiconthree();
	}
	
	@Test(priority = 43)

	public void McqQuestionthree() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.McqQuestionthree("Which of the following drugs primarily acts on the central nervous system (CNS) and is classified as a hallucinogen?");
	}
	
	@Test(priority = 44)

	public void McqQuestionthreechoiceone() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.McqQuestionthreechoiceone("Morphine");
	}
	
	@Test(priority = 45)

	public void McqQuestionthreechoicetwo() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.McqQuestionthreechoicetwo("Cocaine");
	}
	
	@Test(priority = 46)

	public void McqQuestionthreechoicethree () {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.McqQuestionthreechoicethree("LSD");
	}
	

	@Test(priority = 47)

	public void McqQuestionfourchoicefour() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp. McqQuestionthreechoicefour("Heroin");
	}
	
	@Test(priority = 48)

	public void Mcqquestionthreeselectrightanswer () {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.Mcqquestionthreeselectrightanswer();
	}
	
	@Test(priority = 49)
	public void mcqthreeVideoMedia() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.mcqthreeVideoMedia();
	}
	
	
	@Test(priority = 50)
	public void clickmcqthreemapping() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.clickmcqthreemapping();
	}
	
	@Test(priority = 51)
	public void clicksessiontopicformcqthree() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.clicksessiontopicformcqthree();
	}
	
	@Test(priority = 52)
	public void  Selectsessiontopicformcqthree() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.Selectsessiontopicformcqthree();
	}
	
	@Test(priority = 53)
	public void  clickclomappingmcqthree() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.clickclomappingmcqthree();
	}
	
	@Test(priority = 54)
	public void  selectclomappingonemcqthree() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.selectclomappingonemcqthree();
	}
	
	
	@Test(priority = 55)
	public void  selectclomappingtwomcqthree() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.selectclomappingtwomcqthree();
	}
	
	@Test(priority = 56)
	public void  selectclomappingthreemcqthree() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.selectclomappingthreemcqthree();
	}
	
	@Test(priority = 57)
	public void  clicktaxonomymcqthree() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.clicktaxonomymcqthree();
	}
	
	@Test(priority = 58)
	public void  selecttaxonomyoneforthirdmcq() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.selecttaxonomyoneforthirdmcq();
	}
	@Test(priority = 59)
	public void selecttaxonomytwoforthirdmcq() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.selecttaxonomytwoforthirdmcq();
	}
	@Test(priority = 60)
	public void  selecttaxonomythreeforthirdmcq() {
		AssessmentCreationPage acp = new AssessmentCreationPage(page);
		acp.selecttaxonomythreeforthirdmcq();
	}
	
	
	

}
