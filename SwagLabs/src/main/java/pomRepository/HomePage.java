package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//button[.='Open Menu']") 
	 private static  WebElement menu;
	 
	 @FindBy(xpath="//a[.='Logout']") 
	 private static  WebElement logout;

	public static  WebElement getMenu() {
		return menu;
	}

	public static  WebElement getLogout() {
		return logout;
	}
	
	public static void logout() throws InterruptedException {
		Thread.sleep(2000);
		getMenu().click();
		Thread.sleep(3000);
		getLogout().click();
	}

}
