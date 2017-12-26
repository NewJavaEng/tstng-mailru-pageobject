package by.http.tstng.tstng_study;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.http.tstng.tstng_study_driver_steps.Steps;

public class MailRuTest {

	public static final String LOGIN = "user15-95";
	public static final String PASSWORD = "unibel";

	public static final String TO = "hanna.ivankina@gmail.com";
	public static final String SUBJECT = "Hanna Ivankina link to Git-Hub";
	public static final String BODY = "Hello!" + "\n" + "This is my link to Git-Hub: " + "\n"
			+ "https://github.com/NewJavaEng";

	private Steps steps;

	@BeforeMethod(description = "Init browser")
	public void setUp() {
		steps = new Steps();
		steps.initBrowser();
	}

	@Test(description = "Send Letter to Sviatlana", enabled = true)
	public void sendLetter() {
		steps.loginMailRu(LOGIN, PASSWORD);
		steps.sendLetter(TO, SUBJECT, BODY);
	}
	
    @AfterMethod
    public void stopBrowser() {
    	steps.closeDriver();
    }
}
