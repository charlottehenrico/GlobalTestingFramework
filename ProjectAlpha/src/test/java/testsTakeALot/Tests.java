package testsTakeALot;

import org.testng.annotations.Test;

import pageObjectsTakeALot.BaseTakeAlot;
import pageObjectsTakeALot.CartPage;
import pageObjectsTakeALot.CheckoutPage;
import pageObjectsTakeALot.DealsPage;
import pageObjectsTakeALot.LandingPage;
import pageObjectsTakeALot.LoginPage;
import pageObjectsTakeALot.ResultsPage;

public class Tests {
	
	//instantiate page object classes
	LandingPage landPG = new LandingPage();
	CartPage cartPG = new CartPage();
	LoginPage loginPG = new LoginPage();
	ResultsPage resultsPG = new ResultsPage();
	DealsPage dealsPG = new DealsPage();
	CheckoutPage checkoutPG = new CheckoutPage();
	BaseTakeAlot baseTakealot = new BaseTakeAlot();
	
	@Test
	public void GIVEN_userOnLandingPage_WHEN_userSearchesDKNYitem_AND_userClicksSearchButton_THEN_DKNYBeDelicious50mlIsDisplayed(){
		baseTakealot.navigateToHome();
		landPG.clickSearchBar();
		/*2
		* GIVEN the shopper is on the landing page
		* WHEN he enters "DKNY" as the search string
		* WHEN clicks the search button
		* THEN "DKNY" is displayed as the first item in the grid
		*/
	
		
	
		
	}
	}
