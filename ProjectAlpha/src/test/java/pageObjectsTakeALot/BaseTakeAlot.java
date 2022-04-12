package pageObjectsTakeALot;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import frameworkClasses.BasePage;

public class BaseTakeAlot extends BasePage {

	// Method: Go to home page

	public void navigateToHome() {
		driver.get("https://www.takealot.com");
		waitForUrl(30, "takealot");
	}
	
	public void ClickCookiesButton() {
		String cookiesButton = ".button.cookies-banner-module_dismiss-button_24Z98";
		if(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cookiesButton)) != null)
			clickElement(By.cssSelector(cookiesButton));
		}
	
	

}
