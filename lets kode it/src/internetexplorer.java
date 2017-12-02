import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;


public class internetexplorer {

	public static void main(String[] args) {
		 
		  WebDriver driver;
		 System.setProperty("webdriver.ie.driver", "C:/Users/Nagaveena/Documents/IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
		 driver.get("http://www.seleniumhq.org/download/");
		 driver.manage().window().maximize();
		 
	}

}
