package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageLocators {

	@FindBy(xpath = "//a[@title='View my customer account']//span")
	public WebElement txtUserName;

	@FindBy(xpath = "//a[@title='Log me out']")
	public WebElement btnSignOut;

	@FindBy(xpath = "//input[@class='search_query form-control ac_input']")
	public WebElement inputSearchItem;

	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	public WebElement btnProceedToCheckout;

	@FindBy(xpath = "//span[@title='Continue shopping']")
	public WebElement btnContinueShopping;

	@FindBy(xpath = "//div[@class='breadcrumb clearfix']")
	public WebElement iconMyAccount;

	@FindBy(xpath = "//a[@class='logout']")
	public WebElement btnLogOut;

}
