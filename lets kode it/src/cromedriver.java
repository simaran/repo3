import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class cromedriver {

	public static void main(String[] args) {
		
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Nagaveena/Documents/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://www.seleniumhq.org/download/");
		 driver.manage().window().maximize();
		 
	}

}
