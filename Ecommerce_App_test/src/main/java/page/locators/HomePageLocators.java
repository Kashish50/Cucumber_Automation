package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {

	@FindBy(xpath = "//span[@class='shop-phone']//strong")
	public WebElement txtContactDetails;
	
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	public WebElement btnSignIn;
	
	

}
