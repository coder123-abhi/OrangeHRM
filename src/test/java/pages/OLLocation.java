package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class OLLocation {
	
	

	static By admin=By.xpath("//span[text()='Admin']");
	
	static By organization=By.xpath("//span[normalize-space()='Organization']");
	
	static By location=By.xpath("//a[text()='Locations']");
	
	private static WebElement element=null;
	
	public static WebElement oladmin(WebDriver driver) {
		
		element=driver.findElement(admin);
	  
		return element;
	}
	
	
	public static WebElement olorganization(WebDriver driver) {
		
	element=driver.findElement(organization);	
		
	return element;
	 }
	
	public static WebElement ollocation(WebDriver driver) {
		
		element=driver.findElement(location);
		
		return element;
	}
	
	
}
