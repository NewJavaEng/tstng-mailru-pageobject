package by.http.tstng.tstng_study_driver_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComposeLetterPage extends AbstractPage {

	public static final String BASE_URL_1 = "https://e.mail.ru/compose/";

	public static final String TO = "//textarea[2]";
	public static final String SUBJECT = "//input[@class='b-input']";
	public static final String EMAIL_BODY = "//div[@class='compose__editor__container']/table//td[@class='cell shell__text_cell w100']//iframe"; 
	public static final String BUTTON_SEND = "//div[@id='b-toolbar__right']/descendant::span[text()='Отправить']";

	@FindBy(xpath = TO)
	private WebElement to;

	@FindBy(xpath = SUBJECT)
	private WebElement subject;

	@FindBy(xpath = EMAIL_BODY)
	private WebElement emailBody;

	@FindBy(xpath = BUTTON_SEND)
	private WebElement buttonSubmit;

	public ComposeLetterPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get(BASE_URL_1);

		System.out.println("open page");
	}

	public void sendLetter(String email, String topic, String message) {

		to.sendKeys(email);
		subject.sendKeys(topic);

		emailBody.sendKeys(message);
		buttonSubmit.click();
	}

}
