package users;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomRepository.HomePage;
import pomRepository.HotelsPage;

public class PhpTravels_Test001_test extends BaseClass {
	@Test
	public static void Test01() throws IOException {
		HotelsPage hotel=new HotelsPage(driver);
		hotel.getHotel().click();
		hotel.getSearch_bar().click();
		
		String value=readFromPropertyFile.getValueProperty("value");
		hotel.getSearchCity().sendKeys(value);
		
		hotel.getCity().click();
		hotel.getCheckin().click();

		hotel.getCheckInDay().click();
		
		hotel.getCheckoutDay().click();
		hotel.getTravellers().click();
		hotel.getAdult_inc().click();
		
		
		hotel.getSearch().click();
		HomePage.getAccount().click();
		

		
	
		
		
		}

}
