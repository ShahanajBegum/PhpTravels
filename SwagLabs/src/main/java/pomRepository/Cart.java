package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	
	public WebDriver driver;
	public Cart(WebDriver driver) {
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")        private WebElement cart;
	
    @FindBy(xpath="//div[.='Sauce Labs Backpack']")    private WebElement check;
    
    @FindBy(id="checkout")                          private WebElement checkout;
    
    
    @FindBy(id="first-name")                       private WebElement firstname;

    @FindBy(id="last-name")                        private WebElement lastname;
    
    @FindBy(id="postal-code")                      private WebElement postalcode;
    
    @FindBy(id="continue")                        private WebElement continuebutton; 
    
	public WebElement getCart() {
		return cart;
	}

	public WebElement getCheck() {
		return check;
	}
	
	public WebElement getCheckOut() {
		return checkout;
		
	}
	
	public WebElement getfirstName() {
		return firstname;
		
	}
	public WebElement getlastName() {
		return lastname;
		
	}
	public WebElement getPostalCode() {
		return postalcode;
		
	}
	public WebElement getContinue() {
		return continuebutton;
		
	}

	
    
}
