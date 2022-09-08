package users;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.PropertyFileReader;
import pomRepository.AddToCart;
import pomRepository.Cart;

public class Tc_02_Test extends BaseClass {

	@Test
	public void Tc02() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		AddToCart t=new AddToCart(driver);
		t.getAddToCart().click();
		Thread.sleep(3000);
         Cart c=new Cart(driver);
         Thread.sleep(3000);
         c.getCart().click();
        String expected= c.getCheck().getText();
        System.out.println(expected);
        String actual=PropertyFileReader.readDataFromProperty("Title");
        Assert.assertEquals("Done", expected, actual);
        System.out.println("SUCCESSFULLY_DONE");
        Thread.sleep(3000);
         
         
	}

}
