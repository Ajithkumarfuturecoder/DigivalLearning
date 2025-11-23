package IndependentPOM;

import java.nio.file.Paths;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class AssessmentCreationPage {

	private Page page;

	private final String Burgericon = "(//button[contains(@type,\"button\")])[1]";
	private final String Assessment = "(//a[contains(@class,\"digi-side-menu-title digi-text-capitalize\")])[1]";
	private final String Assessmentcreation = "(//a[contains(@class,\"digi-side-menu-title digi-font-normal digi-text-capitalize ng-star-inserted\")])[2]";
	private final String ClickCourseDropDown = "//digi-dropdown[contains(@class,\"digi-course-list\")]";
	private final String SearchCourse = "//input[contains(@type,\"search\")]";
	private final String SelectCourse = "//div[contains(@class,\"digi-fw-500 digi-fs-16 digi-nested-label-container digi-subitem-text-clip\")]";
	private final String CreateAssessment = "(//button[contains(@type,\"button\")])[2]";
	private final String McqQuestion = "(//div[contains(@role,\"textbox\")])[1]";
	private final String McqQuestionchoiceone = "(//div[contains(@role,\"textbox\")])[2]";
	private final String McqQuestionchoicetwo = "(//div[contains(@role,\"textbox\")])[3]";
	private final String McqQuestionchoicethree = "(//div[contains(@role,\"textbox\")])[4]";
	private final String McqQuestionchoicefour = "(//div[contains(@role,\"textbox\")])[5]";
	private final String Mcqselectrightanswer = "//input[contains(@id,\"mat-radio-3-input\")]";

	private final String mcqMedia = "(//input[@name='attachment-image-selector'])[1]";

	public AssessmentCreationPage(Page page) {
		this.page = page;

	}

	public void ClickBurgericon() {

		page.click(Burgericon);

	}

	public void Assessment() {
		page.click(Assessment);

	}

	public void Assessmentcreations() {
		page.click(Assessmentcreation);

	}

	public void ClickCourseDropDown() {
		page.click(ClickCourseDropDown);

	}

	public void SearchCourse(String coursename) {
		page.fill(SearchCourse, coursename);

	}

	public void SelectCourse() {
		page.click(SelectCourse);

	}

	public void CreateAssessment() {
		page.click(CreateAssessment);
		page.setDefaultTimeout(40000);

	}

	public void EntermarksInput(String entermark) {
		Locator inputField = page.locator("#mat-input-3");
		inputField.click();
		inputField.press("Control+A");
		inputField.press("Backspace");
		inputField.pressSequentially(entermark);
	}

	public void EnterDurationInput(String Duration) {
		Locator inputField = page.locator("#mat-input-4");
		inputField.click();
		inputField.press("Control+A");
		inputField.press("Backspace");
		inputField.pressSequentially(Duration);
	}

	public void McqQuestion(String mcqQuestion) {
		page.fill(McqQuestion, mcqQuestion);

	}

	public void McqQuestionchoiceone(String mcqQuestionchoiceone) {
		page.fill(McqQuestionchoiceone, mcqQuestionchoiceone);

	}

	public void McqQuestionchoicetwo(String mcqQuestionchoicetwo) {
		page.fill(McqQuestionchoicetwo, mcqQuestionchoicetwo);

	}
	
	public void McqQuestionchoicethree(String mcqQuestionchoicethree) {
		page.fill( McqQuestionchoicethree, mcqQuestionchoicethree);

	}
	
	public void McqQuestionchoicefour(String mcqQuestionchoicefour) {
		page.fill( McqQuestionchoicefour, mcqQuestionchoicefour);

	}
	
	public void Mcqselectrightanswer() {
		page.click(Mcqselectrightanswer);

	}

	public void McqMedia() {

	    String filePath = System.getProperty("user.dir") + "/Media/Images/Drugs.png";
	    
	    System.out.println("Uploading file: " + filePath);

	    page.locator(mcqMedia).setInputFiles(Paths.get(filePath));
	}

}
