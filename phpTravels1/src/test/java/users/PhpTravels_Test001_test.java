package users;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomRepository.HotelsPage;

public class PhpTravels_Test001_test extends BaseClass {
	@Test
	public static void Test01() throws IOException {
		HotelsPage hotel=new HotelsPage(driver);
		hotel.getHotel().click();
		hotel.getSearch_bar().click();
		String city=readFromPropertyFile.getValueProperty("value");
		hotel.getSearch_bar().sendKeys(city);
		hotel.getCheckin().click();
		String checkin=readFromPropertyFile.getValueProperty("value1");
		hotel.getCheckin().sendKeys(checkin);
		
		String checkout=readFromPropertyFile.getValueProperty("value2");
		hotel.getCheckin().sendKeys(checkout);
		
	
		
		
		}

}
