package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.actions.HomePageActions;
import page.actions.MyAccountPageActions;
import page.actions.ShoppingCartPageActions;
import page.actions.SignInPageActions;
import page.locators.HomePageLocators;
import utils.SeleniumDriver;

public class SignInSteps {

	HomePageActions homePageActions = new HomePageActions();
	SignInPageActions signinPageActions = new SignInPageActions();
	MyAccountPageActions myaccPageActions = new MyAccountPageActions();
	ShoppingCartPageActions shoppingCartPage = new ShoppingCartPageActions();

	@Given("^I Navigate to \"([^\"]*)\" My Shopping Website$")
	public void i_Navigate_to_My_Shopping_Website(String webSiteURL) throws Throwable {
		SeleniumDriver.openPage(webSiteURL);
	}

	@Then("^Home Page Renders Successfully$")
	public void home_Page_Renders_Successfully() throws Throwable {
		homePageActions.verifyHomePage();

	}

	@When("^click on Sign In link$")
	public void click_on_Sign_In_link() throws Throwable {
		homePageActions.navigateToSignInPage();
	}

	@Then("^I should be Navigated to SignIn Page Successfully$")
	public void i_should_be_Navigated_to_SignIn_Page_Successfully() throws Throwable {
		signinPageActions.verifySignInPage();
	}

	@Then("^I Login With \"([^\"]*)\" as UserName and \"([^\"]*)\" as Password$")
	public void i_Login_With_as_UserName_and_as_Password(String username, String password) throws Throwable {
		Thread.sleep(2000);
		signinPageActions.inputUserName(username);
		Thread.sleep(2000);
		signinPageActions.inputPasword(password);
		Thread.sleep(2000);
		signinPageActions.clickButtonSignIn();
	}

	@Then("^I search \"([^\"]*)\" item$")
	public void i_search_item(String itemName) throws Throwable {
		myaccPageActions.setInputSearch(itemName);
	}

	@Then("^I add item \"([^\"]*)\" to the cart$")
	public void i_add_item_to_the_cart(String strName) throws Throwable {
		myaccPageActions.addItemtoCart(strName);
	}

	@Then("^I proceed to Checkout Cart$")
	public void i_proceed_to_Checkout_Cart() throws Throwable {
		myaccPageActions.clickButtonProceedToCheckout();

	}
	
	@Then("^I should be logged In Successfully$")
	public void i_should_be_logged_In_Successfully() throws Throwable {
		myaccPageActions.verifyUserHasLoggedInToAccount();
	}

	@Then("^I increase quantity of \"([^\"]*)\" item$")
	public void i_increase_quantity_of_item(String itemName) throws Throwable {
		shoppingCartPage.increaseItemQuantity(itemName);

	}

	@Then("^I Verify the Total Final Amount of Cart is \"([^\"]*)\"$")
	public void i_Verify_the_Total_Final_Amount_of_Cart_is(String strFinalPrice) throws Throwable {
		shoppingCartPage.verifyFinalTotalPrice(strFinalPrice);
	}

	@Then("^I decrease quantity of \"([^\"]*)\" item$")
	public void i_decrease_quantity_of_item(String itemName) throws Throwable {
		shoppingCartPage.decreaseItemQuantity(itemName);
	}
	
	@Then("^I logOut of MyAccount$")
	public void i_logOut_of_MyAccount() throws Throwable {
		myaccPageActions.clickLogoutButton();
	}

	@Then("^I am Logged Out Successfully$")
	public void i_am_Logged_Out_Successfully() throws Throwable {
		myaccPageActions.verifyUserHasLoggedOutOfAccount();
	}

}
