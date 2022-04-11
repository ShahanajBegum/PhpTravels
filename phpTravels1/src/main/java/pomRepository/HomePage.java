package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Account')]")
	private static WebElement Account;
	
	public static WebElement  getAccount() {
		return Account;
	}
	

	@FindBy(xpath="//a[contains(text(),' Logout')][1]") private WebElement logoutButton;
	
	public WebElement getLogoutButton() {
		return logoutButton;
	}



	// Business Logic or Action methods or Behavior
	public void logout() {
		logoutButton.click();
	}

}
