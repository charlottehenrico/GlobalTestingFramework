package testsTakeALot;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import frameworkClasses.BasePage;
import pageObjectsTakeALot.BaseTakeAlot;
import pageObjectsTakeALot.CartPage;
import pageObjectsTakeALot.CheckoutPage;
import pageObjectsTakeALot.DealsPage;
import pageObjectsTakeALot.FirstItemPage;
import pageObjectsTakeALot.LandingPage;
import pageObjectsTakeALot.LoginPage;
import pageObjectsTakeALot.ResultsPage;

public class Tests extends BasePage{

	// instantiate page object classes
	LandingPage landPG = new LandingPage();
	CartPage cartPG = new CartPage();
	LoginPage loginPG = new LoginPage();
	ResultsPage resultsPG = new ResultsPage();
	DealsPage dealsPG = new DealsPage();
	CheckoutPage checkoutPG = new CheckoutPage();
	BaseTakeAlot baseTakealot = new BaseTakeAlot();
	FirstItemPage firstItemPG = new FirstItemPage();
	
	@BeforeTest
	public void setUp() {
		baseTakealot.ClickCookiesButton();
	}

	@Test
	public void GIVEN_userOnLandingPage_WHEN_userSearchesDKNYitem_AND_userClicksSearchButton_THEN_DKNYBeDelicious50mlIsDisplayed() {
		baseTakealot.navigateToHome();
		landPG.clickSearchBar();
		landPG.enterTextInSearchBar("DKNY");
		landPG.clickSearchButton();
		resultsPG.clickElementTextOfFirstItem();
		resultsPG.switchToNewTab();
		firstItemPG.checkFirstItemBrand();
		driver.close();
	}

	@Test
	public void GIVEN_userOnLandingPage_WHEN_userSearchesHandbag_AND_userClicksSearchButton_THEN_PoloClassicCrossbodyIsDisplayed() {
		baseTakealot.navigateToHome();
		landPG.clickSearchBar();
		landPG.enterTextInSearchBar("handbag");
		landPG.clickSearchButton();
		resultsPG.clickElementTextOfFirstItem();
	}
}
