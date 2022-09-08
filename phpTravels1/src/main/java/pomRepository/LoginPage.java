package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.JavaScriptUtil;

public class LoginPage {


    public WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
 
	@FindBy(name="email")
    private WebElement username_TextField;
    
    @FindBy(name="password")
    private WebElement password_TextField; 
    
	@FindBy(xpath="//button[text()='Got It']")
	private WebElement gotit;
	
	public WebElement getGotit() {
       return gotit;
	}
	
    
    @FindBy(xpath="(//button[contains(@type,'submit')])[1]")
    private WebElement loginbutton;
    
     public WebDriver getDriver() {
		return driver;
	}

     public WebElement getUsername_TextField() {
		return username_TextField;
	}

     public WebElement getPassword_TextField() {
		return password_TextField;
	}

      public WebElement getLoginbutton() {
    	
		return loginbutton;
		
	}

      public HomePage LoginPage(String username,String password) throws InterruptedException {
    	username_TextField.sendKeys(username);
    	password_TextField.sendKeys(password);
    	gotit.click();
    	JavaScriptUtil js=new JavaScriptUtil(driver);
    	js.jsScrollBy(0,300); 
    	Thread.sleep(2000);
    	
    	loginbutton.click();
    	 return new HomePage(driver);
	}

}
