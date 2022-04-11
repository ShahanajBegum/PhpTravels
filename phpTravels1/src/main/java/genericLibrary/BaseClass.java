package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomRepository.HomePage;
import pomRepository.LoginPage;

public class BaseClass implements FrameWorkConstants{
	
	public static WebDriver driver;
	public WebDriverWait explicitWait;
	public static  PropertyFileReader readFromPropertyFile;
	public LoginPage login;
	public HomePage home;
	
	@BeforeClass
    public void openTheBrowser(@Optional("chrome") String browserName) {
        
		if(browserName.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		Reporter.log("Successfully Launched Chrome Browser",true);
		}else if(browserName.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			Reporter.log("Successfully Launched FireFox Browser",true);
		}else {
			Reporter.log("Enter valid Browser name");
		}
		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized successfully",true);
		driver.manage().timeouts().implicitlyWait(IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		explicitWait=new WebDriverWait(driver,EXPLICIT_TIMEOUT);
		}
	

		@BeforeMethod(alwaysRun = true)
		public void loginToApplication() throws IOException {
			readFromPropertyFile = new PropertyFileReader();
			String url = readFromPropertyFile.getValueProperty("Url");
			String username = readFromPropertyFile.getValueProperty("UserName");
			String password = readFromPropertyFile.getValueProperty("PassWord");
			
		    driver.get(url);
		    
		    login=new LoginPage(driver);
		    home=login.LoginPage(username,password);
		
			
		
	}
	
	

}
