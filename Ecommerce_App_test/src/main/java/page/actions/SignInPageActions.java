package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import page.locators.HomePageLocators;
import page.locators.SignInPageLocators;
import utils.SeleniumDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class SignInPageActions {

	SignInPageLocators signInPageLocators = new SignInPageLocators();

	public SignInPageActions() {

		this.signInPageLocators = new SignInPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), signInPageLocators);
	}

	public void verifySignInPage() {
		Assert.assertTrue(signInPageLocators.btnSignInNewuser.isDisplayed(),
				"Verified Successfully that user has navigated to SignIn Page !!!!");
	}

	public void inputUserName(String username) {
		signInPageLocators.inputEmailAlreadyRegistered.sendKeys(username);
	}

	public void inputPasword(String password) {
		signInPageLocators.inputPassword.sendKeys(password);
	}

	public void clickButtonSignIn(){
		signInPageLocators.btnSignInNewuser.click();
	}
}