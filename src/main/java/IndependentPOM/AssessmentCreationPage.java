package IndependentPOM;

import com.microsoft.playwright.Page;

public class AssessmentCreationPage {

	private Page page;

	private final String Burgericon = "(//button[contains(@type,\"button\")])[1]";
	private final String Assessment = "(//a[contains(@class,\"digi-side-menu-title digi-text-capitalize\")])[1]";
	private final String Assessmentcreation = "(//a[contains(@class,\"digi-side-menu-title digi-font-normal digi-text-capitalize ng-star-inserted\")])[2]";
	private final String ClickCourseDropDown = "//digi-dropdown[contains(@class,\"digi-course-list\")]";
	private final String SearchCourse = "//input[contains(@type,\"search\")]";

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



}
