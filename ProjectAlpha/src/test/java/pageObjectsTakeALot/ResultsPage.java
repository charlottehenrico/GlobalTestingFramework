package pageObjectsTakeALot;

import org.openqa.selenium.By;

import frameworkClasses.BasePage;

public class ResultsPage extends BasePage {

	public void clickElementTextOfFirstItem() {
		clickElement(By.cssSelector(
				"div:nth-of-type(2) > .grid.search-product  .product-anchor.product-card-module_product-anchor_TUCBV"));
	}

	public void clickElementTextOfSecondItem() {
		clickElement(By.cssSelector(
				"div:nth-of-type(3) > .grid.search-product  .product-anchor.product-card-module_product-anchor_TUCBV"));
	}

	public void clickElementTextOfThirdItem() {
		clickElement(By.cssSelector(
				"div:nth-of-type(4) > .grid.search-product  .product-anchor.product-card-module_product-anchor_TUCBV"));
	}


	public void checkFirstItemDescription() {
		clickElement(By.cssSelector(
				"div:nth-of-type(2) > .grid.search-product  .product-anchor.product-card-module_product-anchor_TUCBV"));
	}

	public boolean checkItemName(String checkItemName) {
		return false;
	}

	public String verifyText() {
		String text1 = getElementText(By.cssSelector("h1"));
		return text1;
	}

}
