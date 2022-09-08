package users;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomRepository.AddToCart;

public class Tc_01_Test extends BaseClass {

        @Test
		public void Tc_01() throws InterruptedException {
		
		AddToCart t=new AddToCart(driver);
		Thread.sleep(3000);
		t.getAddToCart().click();
		Thread.sleep(3000);

	}

	

}
