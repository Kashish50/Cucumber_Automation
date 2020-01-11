package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPageLocators {

	@FindBy(xpath = "//span[@id='total_price']")
	public WebElement txtTotalFinalPrice;

	@FindBy(xpath = "//td[@id='total_product']")
	public WebElement txtTotalPriceProducts;

	@FindBy(xpath = "//td[@id='total_shipping']")
	public WebElement txtPriceShipping;

	@FindBy(xpath = "//td[@id='total_tax']")
	public WebElement txtTaxAmount;

}
