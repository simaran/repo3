package practicesession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class radiobuttonlist {
	private WebDriver driver;
	private String baseurl;
	
	@BeforeTest
	public void setup(){
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Nagaveena/Documents/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
	    driver =new ChromeDriver();
		baseurl="https://letskodeit.teachable.com/p/practice";
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}
	@Test
	public void  testlistofelements() throws Exception{
		
		boolean isChecked= false;
		List<WebElement> radiobuttons=driver.findElements
				(By.xpath("//input[contains(@type, 'radio')and contains(@name,'cars')]"));
		int size = radiobuttons.size();
		for (int i=0; i<size; i++){
			isChecked =radiobuttons.get(i).isSelected();
			
			if(!isChecked){
				radiobuttons.get(i).click();
				Thread.sleep(2000);
				
				
			}
		}	
	}

	@AfterTest
	public void teardown(){
		driver.close();
		
	}
	
}
