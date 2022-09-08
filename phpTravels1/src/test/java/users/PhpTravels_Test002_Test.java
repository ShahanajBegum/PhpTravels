package users;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;


import genericLibrary.BaseClass;
import genericLibrary.JavaScriptUtil;
import pomRepository.HomePage;
import pomRepository.HotelsPage;
import pomRepository.VisaPage;

public class PhpTravels_Test002_Test extends BaseClass{
	
	@Test
	public static void Test2() throws InterruptedException {
	VisaPage visa=new VisaPage(driver);
	
	visa.getVisa().click();
//	JavaScriptUtil js=new JavaScriptUtil(driver);
//	js.jsScrollBy(0,200); 
	visa.getFromcountry().click();
	 
	String value1=readFromPropertyFile.getValueProperty("fromcountry");
    visa.getFromcountry().sendKeys(value1);
    
    visa.getGoCountry().click();
    visa.getTocountry().click();
    
	String value2=readFromPropertyFile.getValueProperty("tocountry");
   
    visa.getTocountry().sendKeys(value2);

    visa.getGetCountry().click();
    
    visa.getDate().click();    
    visa.getSelectDate().click();
    visa.getSubmit().click();
    
//    JavaScriptUtil j=new JavaScriptUtil(driver);
//   // js.jsScrollTo(0,100) ;
//    JavaScriptUtil.jsScrollBy(0,100) ;
//    
//  
//   // JavaScriptUtil.jsScrollBy(0,-100); 
//    Thread.sleep(3000);
    
    HomePage.getAccount().click();
    
	
}
}