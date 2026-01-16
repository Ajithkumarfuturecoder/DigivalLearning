package IndependentPOM;

import java.nio.file.Paths;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;

public class AssessmentCreationPage {

	private Page page;

	private final String Burgericon = "(//button[contains(@type,\"button\")])[1]";
	private final String Assessment = "(//a[contains(@class,\"digi-side-menu-title digi-text-capitalize\")])[1]";
	private final String Assessmentcreation = "(//a[contains(@class,\"digi-side-menu-title digi-font-normal digi-text-capitalize ng-star-inserted\")])[2]";
	private final String ClickCourseDropDown = "//digi-dropdown[contains(@class,\"digi-course-list\")]";
	private final String SearchCourse = "//input[contains(@type,\"search\")]";
	private final String SelectCourse = "//div[contains(@class,\"digi-fw-500 digi-fs-16 digi-nested-label-container digi-subitem-text-clip\")]";
	private final String CreateAssessment = "(//button[contains(@type,\"button\")])[2]";
	private final String Clickplusicon = "(//mat-icon[contains(@class,\"mat-icon notranslate digi-action-icon material-icons mat-ligature-font mat-icon-no-color\")])[3]";
	private final String McqQuestion = "(//div[contains(@role,\"textbox\")])[1]";
	private final String McqQuestionchoiceone = "(//div[contains(@role,\"textbox\")])[2]";
	private final String McqQuestionchoicetwo = "(//div[contains(@role,\"textbox\")])[3]";
	private final String McqQuestionchoicethree = "(//div[contains(@role,\"textbox\")])[4]";
	private final String McqQuestionchoicefour = "(//div[contains(@role,\"textbox\")])[5]";
	private final String Mcqselectrightanswer = "//input[contains(@id,\"mat-radio-3-input\")]";
	private final String mcqoneimageMedia = "(//input[@name='attachment-image-selector'])[1]";
	private final String clickmapping = "(//div[contains(@style,\"margin-right: 8px;\")])[1]";
	private final String clicksessiontopicformcq = ("//mat-label[contains(text(),'Subject')]/ancestor::div[contains(@class,'mat-mdc-form-field')]//mat-select");
	private final String Selectsessiontopicformcq = "//mat-option//span[contains(text(),'Definition of the terms')]";
	private final String clickclomappingmcq = "//mat-label[contains(text(),'CLO Mapping')]/ancestor::div[contains(@class,'mat-mdc-form-field')]//mat-select";
	private final String selectclomappingonemcq = "//mat-option[.//span[contains(normalize-space(),'Define various medical terms')]]//mat-pseudo-checkbox";
	private final String clicktaxonomy = "//mat-label[contains(text(),'Taxonomy')]/ancestor::div[contains(@class,'mat-mdc-form-field')]//mat-select";
	private final String selecttaxonomyforfirstmcq = "(//mat-pseudo-checkbox[contains(@class,\"mat-pseudo-checkbox mat-mdc-option-pseudo-checkbox mat-pseudo-checkbox-full ng-star-inserted\")])[3]";
	private final String Clickplusicontwo = "(//mat-icon[contains(@class,\"mat-icon notranslate digi-action-icon material-icons mat-ligature-font mat-icon-no-color\")])[1]";
	private final String McqQuestiontwo = "(//div[contains(@class,\"ck-blurred ck ck-content ck-editor__editable ck-rounded-corners ck-editor__editable_inline\")])[1]";
	private final String McqQuestiontwochoiceone = "(//div[contains(@role,\"textbox\")])[2]";
	private final String McqQuestiontwochoicetwo = "(//div[contains(@role,\"textbox\")])[3]";
	private final String McqQuestiontwochoicethree = "(//div[contains(@role,\"textbox\")])[4]";
	private final String McqQuestiontwochoicefour = "(//div[contains(@role,\"textbox\")])[5]";
	private final String Mcqquestiontwoselectrightanswer = "(//input[contains(@type,\"radio\")])[3]";
	private final String mcqTwoAudioInput = "(//input[@type='file' and contains(@accept,'audio')])[2]";
	private final String clickmcqtwomapping = "(//div[contains(@style,\"margin-right: 8px;\")])[5]";
	private final String clicksessiontopicformcqtwo = ("//mat-label[contains(text(),'Subject')]/ancestor::div[contains(@class,'mat-mdc-form-field')]//mat-select");
	private final String Selectsessiontopicformcqtwo = "//mat-option//span[contains(text(),'Classifications of Drugs of abuse.')]";
	private final String clickclomappingmcqtwo = "//mat-label[contains(text(),'CLO Mapping')]/ancestor::div[contains(@class,'mat-mdc-form-field')]//mat-select";
	private final String selectclomappingonemcqtwo = "//mat-option[.//span[contains(normalize-space(),'Define various medical terms')]]//mat-pseudo-checkbox";
	private final String selectclomappingtwomcqtwo = "//mat-option[.//span[contains(normalize-space(),'Identify various')]]//mat-pseudo-checkbox";
	private final String clicktaxonomymcqtwo = "//mat-label[contains(text(),'Taxonomy')]/ancestor::div[contains(@class,'mat-mdc-form-field')]//mat-select";
	private final String selecttaxonomyoneforsecondmcq = "(//mat-pseudo-checkbox[contains(@class,\"mat-pseudo-checkbox mat-mdc-option-pseudo-checkbox mat-pseudo-checkbox-full ng-star-inserted\")])[1]";
	private final String selecttaxonomytwoforsecondmcq = "(//mat-pseudo-checkbox[contains(@class,\"mat-pseudo-checkbox mat-mdc-option-pseudo-checkbox mat-pseudo-checkbox-full ng-star-inserted\")])[3]";
	private final String Clickplusiconthree = "(//mat-icon[contains(@class,\"mat-icon notranslate digi-action-icon material-icons mat-ligature-font mat-icon-no-color\")])[1]";
	private final String McqQuestionthree = "(//div[contains(@class,\"ck-blurred ck ck-content ck-editor__editable ck-rounded-corners ck-editor__editable_inline\")])[1]";
	private final String McqQuestionthreechoiceone = "(//div[contains(@role,\"textbox\")])[2]";
	private final String McqQuestionthreechoicetwo = "(//div[contains(@role,\"textbox\")])[3]";
	private final String McqQuestionthreechoicethree = "(//div[contains(@role,\"textbox\")])[4]";
	private final String McqQuestionthreechoicefour = "(//div[contains(@role,\"textbox\")])[5]";
	private final String Mcqquestionthreeselectrightanswer = "(//input[contains(@type,\"radio\")])[3]";
	private final String mcqThreeVideoInput ="(//input[@type='file' and contains(@accept,'video')])[3]";
	private final String clickmcqthreemapping = "(//div[contains(@style,\"margin-right: 8px;\")])[9]";

	
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

	public void Clickplusicon()

	{
		page.click(Clickplusicon);
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
		page.fill(McqQuestionchoicethree, mcqQuestionchoicethree);

	}

	public void McqQuestionchoicefour(String mcqQuestionchoicefour) {
		page.fill(McqQuestionchoicefour, mcqQuestionchoicefour);

	}

	public void Mcqselectrightanswer() {
		page.click(Mcqselectrightanswer);

	}

	public void mcqoneimageMedia() {

		String filePath = System.getProperty("user.dir") + "/Media/Images/Drugs.png";

		System.out.println("Uploading file: " + filePath);

		page.locator(mcqoneimageMedia).setInputFiles(Paths.get(filePath));
	}

	public void Mcqsessiontopic() {
		page.click(clickmapping);

	}

	public void clicksessiontopicformcq() {

		Locator topic = page.locator(clicksessiontopicformcq).first();

		topic.waitFor(new Locator.WaitForOptions().setTimeout(15000));

		topic.scrollIntoViewIfNeeded();

		page.waitForTimeout(500);

		topic.click(new Locator.ClickOptions().setTimeout(5000));

	}

	public void Selectsessiontopicformcq() {
		page.click(Selectsessiontopicformcq);

	}

	public void clickclomappingmcq() {
		page.click(clickclomappingmcq);

	}

	public void selectclomappingonemcq() {
		page.click(selectclomappingonemcq);
		page.keyboard().press("Escape");

	}

	public void clicktaxonomy() {
		page.click(clicktaxonomy);

	}

	public void selecttaxonomyforfirstmcq() {
		page.click(selecttaxonomyforfirstmcq);
		page.keyboard().press("Escape");

	}

	public void Clickplusicontwo()

	{
		page.click(Clickplusicontwo);
	}

	public void McqQuestiontwo(String mcqquestiontwo) {
		page.fill(McqQuestiontwo, mcqquestiontwo);

	}

	public void McqQuestiontwochoiceone(String mcqquestiontwochoiceone) {
		page.fill(McqQuestiontwochoiceone, mcqquestiontwochoiceone);
	}

	public void McqQuestiontwochoicetwo(String mcqquestiontwochoicetwo) {
		page.fill(McqQuestiontwochoicetwo, mcqquestiontwochoicetwo);
	}

	public void McqQuestiontwochoicethree(String mcqquestiontwochoicethree) {
		page.fill(McqQuestiontwochoicethree, mcqquestiontwochoicethree);
	}

	public void McqQuestiontwochoicefour(String mcqquestiontwochoicefour) {
		page.fill(McqQuestiontwochoicefour, mcqquestiontwochoicefour);
	}

	public void Mcqquestiontwoselectrightanswer() {
		page.click(Mcqquestiontwoselectrightanswer);
	}

	public void mcqtwoaudioMedia() {

		String filePath = System.getProperty("user.dir") + "/Media/Audio/Audioone.wav";

		System.out.println("Uploading file: " + filePath);

		// Upload to hidden input
		Locator audioInput = page.locator(mcqTwoAudioInput);
		audioInput.setInputFiles(Paths.get(filePath));

		// Wait until audio element is attached
		page.waitForSelector("audio", new Page.WaitForSelectorOptions().setState(WaitForSelectorState.ATTACHED));

		// STEP 1: Click audio player (counts as user gesture)
		Locator audio = page.locator("audio");
		audio.scrollIntoViewIfNeeded();
		audio.click();

		// STEP 2: Wait until audio playback finishes
		page.evaluate("""
				    async () => {
				        const audio = document.querySelector('audio');
				        audio.muted = false;
				        await audio.play();
				        await new Promise(resolve => audio.onended = resolve);
				    }
				""");

	}

	public void clickmcqtwomapping() {
		page.click(clickmcqtwomapping);
	}

	public void clicksessiontopicformcqtwo() {
		page.click(clicksessiontopicformcqtwo);
	}

	public void Selectsessiontopicformcqtwo() {
		page.click(Selectsessiontopicformcqtwo);
	}

	public void clickclomappingmcqtwo()

	{
		page.click(clickclomappingmcqtwo);
	}

	public void selectclomappingonemcqtwo() {
		page.click(selectclomappingonemcqtwo);
	}

	public void selectclomappingtwomcqtwo() {
		page.click(selectclomappingtwomcqtwo);
		page.keyboard().press("Escape");
	}

	public void clicktaxonomymcqtwo() {
		page.click(clicktaxonomymcqtwo);
	}

	public void selecttaxonomyoneforsecondmcq() {
		page.click(selecttaxonomyoneforsecondmcq);

	}
	
	public void selecttaxonomytwoforsecondmcq()
	{
		page.click(selecttaxonomytwoforsecondmcq);
		page.keyboard().press("Escape");
	}
	
	public void Clickplusiconthree()

	{
		page.click(Clickplusiconthree);
	}
	
	public void McqQuestionthree (String mcqquestionthree)

	{
		page.fill(McqQuestionthree,mcqquestionthree);
	}
	
	public void McqQuestionthreechoiceone(String mcqquestionthreechoiceone) {
		page.fill(McqQuestionthreechoiceone, mcqquestionthreechoiceone);
	}
	
	public void McqQuestionthreechoicetwo(String mcqquestionthreechoicetwo) {
		page.fill(McqQuestionthreechoicetwo, mcqquestionthreechoicetwo);
	}
	
	public void McqQuestionthreechoicethree(String mcqquestionthreechoicethree) {
		page.fill(McqQuestionthreechoicethree, mcqquestionthreechoicethree);
	}
	
	public void  McqQuestionthreechoicefour(String mcqquestionthreechoicefour) {
		page.fill(McqQuestionthreechoicefour, mcqquestionthreechoicefour);
	}
	
	public void  Mcqquestionthreeselectrightanswer() {
		page.click(Mcqquestionthreeselectrightanswer);
	}
	
	public void mcqthreeVideoMedia() {

	    String filePath = System.getProperty("user.dir") + "/Media/Video/Videoone.webm";

	    System.out.println("Uploading video: " + filePath);

	    // Upload to hidden input
	    Locator videoInput = page.locator(mcqThreeVideoInput);
	    videoInput.setInputFiles(Paths.get(filePath));

	    // Wait until video element is attached
	    page.waitForSelector(
	        "video",
	        new Page.WaitForSelectorOptions()
	            .setState(WaitForSelectorState.ATTACHED)
	    );

	    // STEP 1: Click video player (user gesture)
	    Locator video = page.locator("video");
	    video.scrollIntoViewIfNeeded();
	    video.click();

	    // STEP 2: Play video and wait till end
	    page.evaluate("""
	        async () => {
	            const video = document.querySelector('video');
	            video.muted = false;
	            await video.play();
	            await new Promise(resolve => video.onended = resolve);
	        }
	    """);
	}

	
	public void clickmcqthreemapping()
	{
		
		page.click(clickmcqthreemapping);
	}
	
	

}
