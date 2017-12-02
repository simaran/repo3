import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class radiobutton3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebElement radiobtn = driver.findElement(By.id("u_0_d"));
		driver.findElement(By.id("u_0_d")).click();
		//radiobtn.click();
		//radiobutton is selected
		System.out.println(driver.findElement(By.id("u_0_d")).isSelected());
		//System.out.println(radiobtn.isSelected());
		if (!driver.findElement(By.id("u_0_d")).isSelected())
				{
			//for the radio button male
			driver.findElement(By.id("u_d_e")).click ();
			
				}
		
		
	}

}
