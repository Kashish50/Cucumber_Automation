package page.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import page.locators.MyAccountPageLocators;
import page.locators.SignInPageLocators;
import utils.SeleniumDriver;

public class MyAccountPageActions {

	MyAccountPageLocators myaccountPagelocators = null;
	private WebDriver driver = SeleniumDriver.getDriver();

	public MyAccountPageActions() {

		this.myaccountPagelocators = new MyAccountPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), myaccountPagelocators);
	}

	public void verifyAccountHolderName(String accHolderName) {
		Assert.assertEquals(myaccountPagelocators.txtUserName.getText(), accHolderName);
	}

	public void setInputSearch(String itemName) {
		myaccountPagelocators.inputSearchItem.sendKeys(itemName);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		myaccountPagelocators.inputSearchItem.sendKeys(Keys.ENTER);

	}

	public void addItemtoCart(String strName) {
		WebElement itemImg = driver
				.findElement(By.xpath("//h5[@itemprop='name']//a[@class='product-name' and @title='" + strName + "']"));
		Actions hoverAction = new Actions(driver);
		hoverAction.moveToElement(itemImg).perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		WebElement addItemToCartBtn = driver.findElement(By.xpath("//a[@class='product-name' and @title='" + strName
				+ "']/../following-sibling::div[@class='button-container']//a//span[text()='Add to cart']"));
		addItemToCartBtn.click();
	}

	public void clickButtonProceedToCheckout() {
		myaccountPagelocators.btnProceedToCheckout.click();
	}

	public void clickButtonContinueShopping() {
		myaccountPagelocators.btnContinueShopping.click();
	}
	
	public void verifyUserHasLoggedInToAccount() {
		Assert.assertTrue(myaccountPagelocators.iconMyAccount.isDisplayed(),"User Has been logged into account successfully .");
	}
	
	public void clickLogoutButton(){
		myaccountPagelocators.btnLogOut.click();
	}
}
