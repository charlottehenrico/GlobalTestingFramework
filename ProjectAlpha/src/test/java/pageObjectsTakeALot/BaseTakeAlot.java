package pageObjectsTakeALot;

import frameworkClasses.BasePage;

public class BaseTakeAlot extends BasePage {
	
	//Method: Go to home page
	
	public void navigateToHome() {
		driver.get("https://www.takealot.com");
		waitForUrl(30,"takealot" );
	}

}
