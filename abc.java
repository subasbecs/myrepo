package com.example.tests;

import com.thoughtworks.selenium.Selenium;
public class abc {
	private Selenium selenium;

	//@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://184.73.212.247/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	//@Test
	public void testAbc() throws Exception {
		int val = 0;
		// selenium.while("storedVars.val<11");
		while(val<156){
		selenium.open("/jobs/apply/33");
		selenium.click("link=Click to apply now");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=applicant_first_name", "Subash");
		selenium.type("id=applicant_last_name", "Thapa");
		selenium.type("id=applicant_email", selenium.getEval("\"subas.becs.11+\"+Math.floor(Math.random()*123455)+\"@acharya.ac.in\";"));
		selenium.sendKeys("id=applicant_cell_number", selenium.getEval("2000000000+Math.floor(Math.random() * 11111111);"));
		selenium.sendKeys("id=applicant_phone_number", selenium.getEval("3000000000+Math.floor(Math.random() * 11111111);"));
		selenium.click("id=applicant_extension");
		selenium.type("id=applicant_address", "Shankhamool road");
		selenium.type("id=applicant_city", "kathmandu");
		selenium.type("id=applicant_zip_code", "97711");
		selenium.type("id=applicant_working_experience", "1 year");
		selenium.type("id=profilepicfile", "C:\\Users\\Amin1\\Desktop\\12015152_10156194037450455_8432926707096996651_o.jpg");
		selenium.click("id=file");
		selenium.type("id=file", "C:\\Users\\Amin1\\Desktop\\pendrive\\SUBAS tHAPA.docx");
		selenium.type("id=applicant_question_answers_attributes_0_properties_When you completed your bachelor", "2015");
		selenium.type("id=applicant_question_answers_attributes_0_properties_Share your experience about any IT fair", "I worked as software engineer for 1 year.");
		selenium.click("id=applicant_question_answers_attributes_0_properties_Which language you know_php");
		selenium.click("id=applicant_question_answers_attributes_0_properties_Are you interested in automation_yes");
		selenium.click("id=star-3145");
		selenium.click("name=commit");
		selenium.waitForPageToLoad("30000");
		val++;
		}
		// selenium.endWhile();
	}

	//@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
