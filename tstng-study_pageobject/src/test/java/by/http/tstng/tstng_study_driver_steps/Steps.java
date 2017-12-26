package by.http.tstng.tstng_study_driver_steps;

import org.openqa.selenium.WebDriver;

import by.http.tstng.tstng_study_driver.Driver;
import by.http.tstng.tstng_study_driver_pages.LoginPage;
import by.http.tstng.tstng_study_driver_pages.ComposeLetterPage;

public class Steps {

	private WebDriver driver;

	public void initBrowser() {
		driver = Driver.getDriver();
	}

	public void closeDriver() {
		Driver.closeDriver();
	}

	public void loginMailRu(String username, String password) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openPage();
		loginPage.login(username, password);
	}

	public void sendLetter(String email, String topic, String message) {
		ComposeLetterPage newLetterPage = new ComposeLetterPage(driver);
		newLetterPage.openPage();
		newLetterPage.sendLetter(email, topic, message);
	}

}
