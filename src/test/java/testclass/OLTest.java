package testclass;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.OLLocation;
import pages.OLLogin;
import pages.OLLogout;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class OLTest {

	public static WebDriver driver;
	
	
	@Given("the user is on the login page of the website")
	public void the_user_is_on_the_login_page_of_the_website() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BrowserDriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
	    
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("the user provides valid username Admin and valid password admin123")
	public void the_user_provides_valid_username_admin_and_valid_password_admin123() throws InterruptedException {

        OLLogin.username(driver).sendKeys("Admin");
        
        Thread.sleep(3000);
        
        OLLogin.password(driver).sendKeys("admin123");
        
        Thread.sleep(3000);
		
		
		
	}

	@When("the user clicks on login button")
	public void the_user_clicks_on_login_button() throws InterruptedException {
		
		OLLogin.submit(driver).click();
		
		Thread.sleep(3000);
	}

	@Then("the user gain access to the landing page of the website")
	public void the_user_gain_access_to_the_landing_page_of_the_website() {
	    
		 
		System.out.println("Landing page of the website accessed!");
		
		
	}

	@Given("the user is on the landing page of the website")
	public void the_user_is_on_the_landing_apge_of_the_website() {
	 
		System.out.println("The user is on the landing page of the website");
		
	}

	@When("the user clicks admin tab and clicks on organization")
	public void the_user_clicks_admin_tab_and_clicks_on_organization() throws InterruptedException {
		
           OLLocation.oladmin(driver).click();
           
           Thread.sleep(3000);
           
           OLLocation.olorganization(driver).click();
           
           Thread.sleep(3000);
           
		
	   
	}

	@When("the user clicks on locations button")
	public void the_user_clicks_on_locations_button() throws InterruptedException {
		
		 OLLocation.ollocation(driver).click();
		
		Thread.sleep(3000);
	
	}

	@Then("the location is accessed")
	public void the_location_is_accessed() throws IOException, InterruptedException {
		
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("Users/TIRTHANKAR KHAUND/Pictures/Saved Pictures/ol.png"));
		
		Thread.sleep(3000);
	  
	}

	@Given("the user is on the location of the website")
	public void the_user_is_on_the_location_of_the_website() throws InterruptedException {
	   
		System.out.println("\n\nThe user is on the location of the website");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		
		Thread.sleep(3000);
		
	}

	@When("the user clicks on the upper right profile icon")
	public void the_user_clicks_on_the_upper_right_profile_icon() throws InterruptedException {
	 
		OLLogout.olprofile(driver).click();
		Thread.sleep(3000);
	}

	@When("clicks on logout button")
	public void clicks_on_logout_button() throws InterruptedException {
		
		OLLogout.ollogout(driver).click();
		
		Thread.sleep(3000);
	   
	}

	@Then("the user logs out of the website")
	public void the_user_logs_out_of_the_website() throws InterruptedException {
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(3000);
		
		driver.close();
	    
	}
	
	
}
