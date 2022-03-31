package testsTakeALot;

import org.testng.annotations.Test;

import pageObjectsTakeALot.CartPage;
import pageObjectsTakeALot.LandingPage;
import pageObjectsTakeALot.LoginPage;

public class Tests {
	
	//instantiate Landing Page
	
	LandingPage lp = new LandingPage();
	CartPage cart = new CartPage();
	LoginPage login = new LoginPage();
	
	@Test
	public void searchForPuzzle() {
		
		//ensure you are on the landing page
		
		//click search for product input box
		
		//search for product
		
		//click search button
		
		//click first item
		
		//click add to cart
		
		//click go to cart
		
		//check that item is added to cart
	}

}
