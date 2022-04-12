package pageObjectsTakeALot;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import frameworkClasses.BasePage;

public class LandingPage extends BasePage {


	public boolean checkLandingPage(String LandingURL) {
		return false;
	}

	public void selectItem(String selectItem) {

	}

	public boolean checkURL(String PageURL) {
		return false;
	}

	public void clickSearchButton() {
		clickElement(By.cssSelector("button[type='submit']"));

	}

	public void clickCartItem() {

	}

	public void clickSearchBar() {
		clickElement(By.name("search"));
	}

	public void enterTextInSearchBar(String enterTextInSearchBar) {
		enterText(By.name("search"), enterTextInSearchBar);
	}

	public String checkElementTextOfFirstItem() {
		String text1 = getElementText(By.cssSelector(
				"div:nth-of-type(2) > .grid.search-product  .product-anchor.product-card-module_product-anchor_TUCBV"));
		return text1;
	}


}
