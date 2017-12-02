package practicesession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dro {
	
	public WebDriver driver;
	String baseurl;
	
	@Test
	public void dropdown() throws Exception{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		baseurl="http://letskodeit.teachable.com/pages/practice";
		
		driver.get(baseurl);
		
		WebElement element = driver.findElement(By.id("multiple-select-example"));
		Select sel = new Select(element);
		
		Thread.sleep(2000);
		System.out.println("Select Benz by value");
		sel.selectByValue("apple");

		Thread.sleep(2000);
		System.out.println("Select Honda by index");
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("Select BMW by visible text");
		sel.selectByVisibleText("Orange");
		
		Thread.sleep(2000);
		System.out.println("Print the list of all options");
		List<WebElement> selectedoptions = sel.getOptions();
		
		
		for (WebElement  options: selectedoptions) {
			
			System.out.println(options.getText());
	}

	}
}
