

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		String baseurl= "https://www.expedia.com";
		//https://www.expedia.com/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseurl);
		driver.findElement(By.xpath("//*[@id='tab-flight-tab']/span[text()='Flights']")).click();
		boolean checked = false;
		
		//RadioButtons in check box
		List<WebElement> triptype = driver.findElements(By.xpath("//*[@class='check col']"));
		int j = triptype.size();
		System.out.println(j);
		checked=triptype.get(1).isSelected();
		System.out.println(checked);
		
		for (int i = 0 ; i <triptype.size(); i++){
			checked= triptype.get(i).isSelected();
			
			if (checked){
			triptype.get(i+1).click();
			Thread.sleep(2000);
			break;
			
	}
//driver.close();
}

	}
}
