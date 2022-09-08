package users;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomRepository.FlightPage;
import pomRepository.HomePage;

public class PhpTravels_Test003_Test extends BaseClass {
@Test
    public void FlightModule() throws InterruptedException {
	FlightPage flight =new FlightPage(driver);
   flight.getToClickonFlights().click();
   
//    JavascriptExecutor excutescipt = (JavascriptExecutor) driver;
//  excutescipt.executeScript("window.scrollTo(0,100);");
//   Thread.sleep(3000);
    String value=readFromPropertyFile.getValueProperty("from");
    flight.getEnterfromAddress().sendKeys(value);
    
    String value1=readFromPropertyFile.getValueProperty("To");
    flight.getEnterToAddress().sendKeys(value1);
    
    flight.getToClickDepartureDate().click();
    Thread.sleep(1000);
       //flight.getSelectDepatureDate().click();
       // flight.getToclickonpassangers().click();
     flight.getToClickonSearchButton().click();
     HomePage.getAccount().click();




}
}


