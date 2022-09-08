package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.BaseClass;

public class LoginPage {
	
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(id="user-name")    			               			private  WebElement usernameTestField;
	@FindBy(id="password")    						             private WebElement passwordTestField;
	@FindBy(xpath="//input[@class='submit-button btn_action']")     private WebElement loginButton;
	
	

	public WebElement getUsernameTestField() {
		return usernameTestField;
	}

    public WebElement getPasswordTestField() {
		return passwordTestField;
	}

    public WebElement getLoginButton() {
		return loginButton;
	}
	
    public HomePage login(String username,String password) throws InterruptedException  {
    	usernameTestField.sendKeys(username);
    	Thread.sleep(1000);
    	
    	passwordTestField.sendKeys(password);
    	Thread.sleep(2000);
    	loginButton.click();
    	Thread.sleep(1000);
    	return new HomePage(driver);
		
    	
		
	}
}
