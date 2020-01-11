package page.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import page.locators.ShoppingCartPageLocators;
import utils.SeleniumDriver;

public class ShoppingCartPageActions {

	ShoppingCartPageLocators shoppingCartPageLocators = null;
	private WebDriver driver = SeleniumDriver.getDriver();

	public ShoppingCartPageActions() {
		this.shoppingCartPageLocators = new ShoppingCartPageLocators();
		PageFactory.initElements(driver, shoppingCartPageLocators);
	}

	public void increaseItemQuantity(String strItemname) {
		driver.findElement(By.xpath("//a[text()='" + strItemname
				+ "']/../../following-sibling::td[@class='cart_quantity text-center']//a[@title='Add']")).click();

	}

	public void decreaseItemQuantity(String strItemname) {
		driver.findElement(By.xpath("//a[text()='" + strItemname
				+ "']/../../following-sibling::td[@class='cart_quantity text-center']//a[@title='Subtract']")).click();

	}

	public void deleteItemFromcart(String strItemname) {
		driver.findElement(By.xpath("//a[text()='" + strItemname
				+ "']/../../following-sibling::td[@class='cart_delete text-center']//div//a//i"));
	}

	public void verifyFinalTotalPrice(String strFinalPrice) {
		driver.navigate().refresh();
		Assert.assertEquals(shoppingCartPageLocators.txtTotalFinalPrice.getText(), strFinalPrice);
	}

	public void verifyShippingCharges(String strShippingCharges) {
		Assert.assertEquals(shoppingCartPageLocators.txtPriceShipping.getText(), strShippingCharges);
	}

	public void verifyPriceOfitemInCart(String itemName, String itemPrice) {
		driver.findElement(
				By.xpath("//a[text()='" + itemName + "']/../../following-sibling::td[@class='cart_total']//span"));
	}

}
