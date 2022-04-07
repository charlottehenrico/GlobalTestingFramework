package frameworkClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
	//declare the web driver
	public static WebDriver driver;
	
	public BasePage() {
	
	//constructor of the base class
	if  (driver == null) {
		//Set parameter values
		String browser = "chrome";
		String URL = "https://www.takealot.com/";
		String pdriverDIR = "C:\\Selenium\\";
		
		//Check if parameter passed as chrome
		if (browser.equalsIgnoreCase("chrome")) {
			//set path to chromedriver
			System.setProperty("webdriver.chrome.driver", pdriverDIR + "chromedriver.exe");
			//create an instance for chrome
			driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		else if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", pdriverDIR + "geckodriver.exe");
		//create an instance for firefox
		driver = new FirefoxDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", pdriverDIR + "MicrosoftWebDriver.exe");
			//create an instance for edge
			driver = new EdgeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
		}
	}
	//method to read config
	
	//wait for element
	public void waitForElement(int elementWait, By pLocator) {
		WebDriverWait wait = new WebDriverWait(driver, elementWait);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(pLocator));
		}
	
	//Method: wait for click
	public void waitforClick(int elementWait, By pLocator) {
		WebDriverWait wait = new WebDriverWait(driver, elementWait);
		wait.until(ExpectedConditions.elementToBeClickable(pLocator));
		}
	
	//Method: wait for URL
	public void waitForUrl(int elementWait, String pLocator) {
		WebDriverWait wait = new WebDriverWait(driver, elementWait);
		wait.until(ExpectedConditions.urlContains(pLocator));
		}
	
	//Method:Get text on an Element
	public String getElementText(By pLocator) {
	String elementText = getElement(pLocator).getText();
	return elementText;
	}

	//Method: Get element
	public WebElement getElement(By pLococator) {
		waitforClick(30, pLococator);
		return driver.findElement(pLococator);
		}
	

	//Method: Click on an element
	public void clickElement(By pLocator) {
		waitforClick(30, pLocator);
		getElement(pLocator);
		
	}
	
	//check if element exists
	
	//clean up
	
	//Method: Enter text
	public void enterText(By pLocator, String enterText) {
		waitforClick(30, pLocator);
		driver.findElement(pLocator).sendKeys(enterText);
	}
	
	
	//clear text
	
	//select from drop-down
	
	

}
