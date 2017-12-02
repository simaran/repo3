package practicesession;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementdisplayed {
	 public WebDriver driver;
	 public String baseurl;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver =new ChromeDriver();
		baseurl="http://letskodeit.teachable.com/pages/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void dislpayed() throws InterruptedException{
		driver.get(baseurl);
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		System.out.println("text box is displayed"+textbox.isDisplayed());
		
		
Thread.sleep(2000);
WebElement showbutton = driver.findElement(By.id("show-textbox"));
showbutton.click();
System.out.println("text box is displayed"+textbox.isDisplayed());


Thread.sleep(2000);
WebElement hidebutton = driver.findElement(By.id("hide-textbox"));
hidebutton.click();
System.out.println("text box is displayed"+textbox.isDisplayed());

Thread.sleep(2000);


		
	}
	

}
