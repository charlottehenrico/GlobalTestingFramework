package pageObjectsTakeALot;

import frameworkClasses.BasePage;
import org.openqa.selenium.By;

public class FirstItemPage extends BasePage {
	
	public String checkFirstItemBrand() {
		String textFirstItem = getElementText(By.cssSelector(".title-content-list a"));
		return textFirstItem;
	}

}
