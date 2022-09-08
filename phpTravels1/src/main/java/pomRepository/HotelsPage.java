package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelsPage {
	
	public  HotelsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	


	@FindBy(xpath="//a[contains(text(),'Hotels')]")
	private WebElement hotel;
	
	
	@FindBy(xpath="//span[@id='select2-hotels_city-container']")
	private WebElement search_bar;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	private WebElement search_city;
	
	@FindBy(xpath="//li[text()='Bangalore,India']")
	private WebElement city1;
	
	public WebElement getCity() {
		return city1;
	}
	
	@FindBy(xpath="//input[@id='checkin']")
	private WebElement checkin;
	
	@FindBy(xpath="(//td[text()='21'])[1]")
	private WebElement checkin_day;
	
	@FindBy(xpath="//input[@id='checkout']")
	private WebElement checkout;
	
	@FindBy(xpath="//a[@class='dropdown-toggle dropdown-btn travellers waves-effect']")
	private WebElement Travellers;
	
	@FindBy(xpath="//div[@class='roomInc']")
	private WebElement room_inc;
	
	@FindBy(xpath="//div[@class='roomDec']")
	private WebElement room_dec;
	
	@FindBy(xpath="(//div[@class='qtyInc'])[2]")
	private WebElement adult_inc;
	
	@FindBy(xpath="(//div[@class='qtyInc'])[3]")
	private WebElement child_inc;
	
	@FindBy(xpath="(//div[@class='qtyDec'])[2]")
	private WebElement adult_dec;
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement search;
	
	

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getSearch_bar() {
		return search_bar;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getTravellers() {
		return Travellers;
	}

	public WebElement getRoom_inc() {
		return room_inc;
	}

	public WebElement getRoom_dec() {
		return room_dec;
	}

	public WebElement getAdult_inc() {
		return adult_inc;
	}

	public WebElement getChild_inc() {
		return child_inc;
	}

	public WebElement getAdult_dec() {
		return adult_dec;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchCity() {
		return search_city;
	}
	
	public WebElement getCheckInDay() {
		
		return checkin_day;
	}
	
	@FindBy(xpath="(//td[text()='16'])[2]")
	private WebElement checkout_day;

	public WebElement getCheckoutDay() {
		return checkout_day;
	}
	



}
