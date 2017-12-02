package homedepot;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class search {
	public WebDriver driver;
	 public String baseurl;
		
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		baseurl="https://www.homedepot.com/";
	
	}
	
	@Test
	public void searchautocomplete() throws Exception{
		driver.get(baseurl);
		 //String expectedtitle="Search Results for water heater stand  at The Home Depot";
		 String searchtext = "water heater";
	  String expectedresult="water heater repair";

		WebElement ele = driver.findElement(By.id("headerSearch"));
		
		ele.sendKeys(searchtext);
		//ele.click();
		
		 WebElement heater =driver.findElement(By.xpath("//*[@id='typeAheadFlyOut']/div[1]/ul"));
		 List<WebElement> results=heater.findElements(By.tagName("li"));
		 int size = results.size();
		 System.out.println(size);
		 for(int i=0; i<size; i++){
			 System.out.println(results.get(i).getText());
		 }
		 Thread.sleep(3000);
		 for(WebElement result: results){
			 if (result.getText().equals(expectedresult)){
				 result.click();
				 
				 
			 }
			 
			 
			 }
		 }
		 
		 
		}


