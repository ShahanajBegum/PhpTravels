package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisaPage {
	
	public VisaPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	

	@FindBy(xpath="//a[.='visa']")                              
	private WebElement visa;
	
	@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[1]") 
	private WebElement fromcountry;
	
	@FindBy(xpath="//li[.='India']")                              
	private WebElement goCountry;
	
	@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[2]")  
	private WebElement tocountry;
	
	@FindBy(xpath="//li[.='Maldives']")                           
	private WebElement getCountry;
	
    @FindBy(xpath="//input[@id='date']")                         
    private WebElement date;
    
    @FindBy(xpath="//td[.='29']")                                 
    private  WebElement selectDate;
    
    @FindBy(xpath="//button[@id='submit']")                      
    private WebElement submit;
    
    @FindBy(xpath="//h5[.='29-05-2022']")
    private  WebElement checking;
	
    
    public  WebElement getChecking() {
		return checking;
	}
	public WebElement getVisa() {
		return visa;
	}
	public WebElement getFromcountry() {
		return fromcountry;
	}
	public WebElement getGoCountry() {
		return goCountry;
	}
	public WebElement getTocountry() {
		return tocountry;
	}
	public WebElement getGetCountry() {
		return getCountry;
	}
	public WebElement getDate() {
		return date;
	}
	public  WebElement getSelectDate() {
		return selectDate;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	
	}
    
