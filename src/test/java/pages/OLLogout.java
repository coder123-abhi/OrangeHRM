package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class OLLogout {
	


	static By profile=By.xpath("//p[@class='oxd-userdropdown-name']");
	
	static By logout=By.xpath("//a[text()='Logout']");
	
   private static WebElement element=null;
	
	public static WebElement olprofile(WebDriver driver) {
		
	element=driver.findElement(profile);
	  
		return element;
	}
	
	public static WebElement ollogout(WebDriver driver) {
	
		element=driver.findElement(logout);
		
		return element;
	
	}
	
	
}
