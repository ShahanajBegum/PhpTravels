package genericLibrary;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil extends BaseClass {

	//public WebDriver driver;
	public static JavascriptExecutor javaScript = (JavascriptExecutor) driver;
	
	public JavaScriptUtil(WebDriver driver) {
		driver=this.driver;
	}
	
	
	public void jsClick(WebElement element) {
		javaScript.executeScript("arguments[0].click();", element);
	}

	
	public void jsSendkeys(String data,WebElement element) {
		javaScript.executeScript("arguments[0].value='"+data+"';", element);
	}
	
	
	public static void jsScrollBy(int X,int Y) {
		javaScript.executeScript("window.scrollBy("+X+","+Y+")");
	}

	
	public static void jsScrollTo(int X,int Y) {
		javaScript.executeScript("window.scrollTo("+X+","+Y+")");
	}

	public void jsScrollIntoView(boolean bool,WebElement element) {
		javaScript.executeScript("arguments[0].scrollIntoView("+bool+")",element);
	}

	
	public void jsScrollToBottomOfThePage() {
		javaScript.executeScript("arguments[0].scrollBy(0,document.body.scrollHeight')");
	}
	
	
	public void toPutABorderOnWebElement(WebElement element) {
		javaScript.executeScript("arguments[0].style.border='3px solid red';",element);
	}
	
	
	public void toChangeTheColorOfWebElement(String color,WebElement element) {
		javaScript.executeScript("arguments[0].style.backgroundColor = '"+color+"';",element);
	}
	
	public String jsFetchVale(WebElement element) {
		return (String)javaScript.executeScript("return arguments[0].value",element);
	}	
	
	public void jsRefresh() {
		javaScript.executeScript("history.go(0)");
	}
	
	
	public void jsClear(WebElement element) {
		javaScript.executeScript("arguments[0].vlue='';",element);
	}
}



