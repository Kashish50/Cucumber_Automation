package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageLocators {

	@FindBy(xpath = "//input[contains(@class,'is_required')and (@id='email')]")
	public WebElement inputEmailAlreadyRegistered;
	
	@FindBy(xpath = "//input[contains(@class,'is_required')and (@id='passwd')]")
	public WebElement inputPassword;
	
	@FindBy(xpath = "//i[@class='icon-lock left']")
	public WebElement btnSignInNewuser;
	
	

	

}
