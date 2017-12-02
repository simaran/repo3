import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ispresent {

	public static void main(String[] args) {
		//create a new instance of Firefox driver
		WebDriver driver = new FirefoxDriver ();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 
		//and now use this to visit to selenium site
		driver.get("http://www.seleniumhq.org/");
		
		//using the WebElement class to difine the locator
		WebElement Searchbtn = driver.findElement(By.id("q"));
		
		//clear the text if already exists
		//Searchbtn.clear();
		
		//enter some text in search box
		Searchbtn.sendKeys("Selenium Webdriver");
		
		//using the WebElement to Find Go Button
		WebElement gobtn = driver.findElement(By.id("submit"));
		
		//clicking on the go button
		gobtn.click();
		
		//check the title of the page
		 String  Title =driver.getTitle();
		 System.out.println("The page tittle is "+ "" +Title);
		 
	   //check the About Results option in the results page
		 Boolean aboutPresent = driver.findElement(By.id("reslnfo-0")).isDisplayed();
		 if (aboutPresent==true){
			 System.out.println("Test Case Passed");
			 
		 }
		 else
		 {
			 System.out.println("Test case Failed");
		 }
		 
		
		
		
		
	}

}
