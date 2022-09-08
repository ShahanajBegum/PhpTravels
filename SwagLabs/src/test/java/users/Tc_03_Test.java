package users;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomRepository.AddToCart;
import pomRepository.Cart;

public class Tc_03_Test extends BaseClass {

		
		@Test
		public void Tc03() throws InterruptedException {
			
			
			AddToCart t=new AddToCart(driver);
			Thread.sleep(2000);
			t.getAddToCart().click();
			
	        Cart c=new Cart(driver);
	        c.getCart().click();
	        Thread.sleep(2000);
	        c.getCheckOut().click();
	        Thread.sleep(2000);
	        c.getfirstName().sendKeys("Shahanaj");
	        Thread.sleep(1000);
	        c.getlastName().sendKeys("sha");
	        Thread.sleep(1000);
	        c.getPostalCode().sendKeys("518123");
	        Thread.sleep(1000);
	        c.getContinue().click();
	        Thread.sleep(2000);
		}


	}


