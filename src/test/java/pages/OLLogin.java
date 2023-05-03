package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class OLLogin {

	

	
   static By uname=By.xpath("//input[@name='username']");
	
   static	By pass=By.xpath("//input[@name='password']");
	
   static By login=By.xpath("//button[@type='submit']");
	
	private static WebElement element=null;
	
	
	

	public static WebElement username(WebDriver driver) {
	
		element=driver.findElement(uname);
    
		
	return element;
		
	}
	
	
	public  static WebElement password(WebDriver driver) {
	
	   element=driver.findElement(pass);
	   
	   return element;
	}
	
	public static WebElement submit(WebDriver driver) {
		
		element=driver.findElement(login);
	    
		return element;
		
	}
	
	
	
	
	
	
	
}
