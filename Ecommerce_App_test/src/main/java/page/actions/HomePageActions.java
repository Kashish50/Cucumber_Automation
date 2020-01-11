package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import page.locators.HomePageLocators;
import utils.SeleniumDriver;

public class HomePageActions {

	HomePageLocators homePageLocators = null;

	public HomePageActions() {

		this.homePageLocators = new HomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators);
	}

	public void navigateToSignInPage() {
		homePageLocators.btnSignIn.click();

	}

	public void verifyHomePage() {
		Assert.assertEquals(homePageLocators.txtContactDetails.getText(), "0123-456-789");

	}

}
