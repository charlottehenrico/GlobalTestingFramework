package pageObjectsTakeALot;

import org.openqa.selenium.By;

import frameworkClasses.BasePage;

public class LandingPage extends BasePage{
	
	//landPG.checkLandingPage();
	//landPG.clicktab("Clearance");
	//langPG.checkURL("https://www.takealot.com/promotion/clearancesale");
	//landPG.checkBanner("Clearance");
	
	public boolean checkLandingPage(String LandingURL) {
		return false;
	}
		
	
	public void selectItem(String selectItem) {
		
	}
	
	public boolean checkURL(String PageURL) {
		return false;
	}
		

	public void clickSearchButton() {
		
	}
	
	public void clickCartItem() {
		
	}

	public void clickSearchBar() {
		clickElement(By.name("search"));
	}

}
