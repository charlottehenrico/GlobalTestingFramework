package pageObjectsTakeALot;

import org.openqa.selenium.By;

import frameworkClasses.BasePage;

public class ResultsPage extends BasePage {
	
	public void clickElementTextOfFirstItem() {
		clickElement(By.cssSelector(
				"div:nth-of-type(2) > .grid.search-product  .product-anchor.product-card-module_product-anchor_TUCBV"));
	}
	
	public void checkFirstItemBrand() {
		clickElement(By.cssSelector(
				"div:nth-of-type(2) > .grid.search-product  .product-anchor.product-card-module_product-anchor_TUCBV"));
	}
	
	public void checkFirstItemDesription() {
		clickElement(By.cssSelector(
				"div:nth-of-type(2) > .grid.search-product  .product-anchor.product-card-module_product-anchor_TUCBV"));
	}

}
