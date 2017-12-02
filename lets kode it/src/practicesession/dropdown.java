package practicesession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public WebDriver driver;
	public String baseurl;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
	driver= new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	baseurl="http://letskodeit.teachable.com/pages/practice";
	
	}
	@Test
	public void testdropdown() throws Exception{
		driver.get(baseurl);
		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element);
		
		Thread.sleep(2000);
		System.out.println("Select Benz by value");
		sel.selectByValue("benz");

		Thread.sleep(2000);
		System.out.println("Select Honda by index");
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("Select BMW by visible text");
		sel.selectByVisibleText("BMW");
		
		Thread.sleep(2000);
		System.out.println("Print the list of all options");
		List<WebElement> options = sel.getOptions();
		int size = options.size();
		
		for (int i=0; i<size; i++) {
			String optionName = options.get(i).getText();
			System.out.println(optionName);
		}
			
}
	@After
	public void teardown(){
		driver.close();
	}

}