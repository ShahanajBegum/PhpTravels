package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']/../../..//button[.='Add to cart']")
	private WebElement addToCart;
	
	public WebElement getAddToCart() {
		return addToCart;
	}
	}
