package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPage {
	public WebDriver driver;
	
	public FlightPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Flights")
	private WebElement ToClickonFlights;
	@FindBy(id = "autocomplete")
	private WebElement EnterfromAddress;
	@FindBy(id = "autocomplete2")
	private WebElement EnterToAddress;
	@FindBy(id = "departure")
	private WebElement ToClickDepartureDate;
	
	@FindBy(xpath="(//td[text()='27'])[1]")

	private WebElement SelectDepatureDate;
	@FindBy(xpath = "//label[text()='Passengers']/..//div[@class='dropdown dropdown-contain']")
	private WebElement Toclickonpassangers;
	@FindBy(id = "flights-search")
	private WebElement ToClickonSearchButton;
	
	
	public WebElement getToClickonFlights() {
		return ToClickonFlights;
	}
	public WebElement getEnterfromAddress() {
		return EnterfromAddress;
	}
	public WebElement getEnterToAddress() {
		return EnterToAddress;
	}
	public WebElement getToClickDepartureDate() {
		return ToClickDepartureDate;
	}
	public WebElement getSelectDepatureDate() {
		return SelectDepatureDate;
	}
	public WebElement getToclickonpassangers() {
		return Toclickonpassangers;
	}
	public WebElement getToClickonSearchButton() {
		return ToClickonSearchButton;
	}

}
