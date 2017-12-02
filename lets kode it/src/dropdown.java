import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  new FirefoxDriver();
		String baseurl="https://www.expedia.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseurl);
		
		WebElement vflight =driver.findElement(By.id("tab-flight-tab"));
		vflight.click();
		
		WebElement voneway = driver.findElement(By.id("flight-type-one-way-label"));
		voneway.click();
		
		WebElement vdeptcity = driver.findElement(By.id("flight-origin"));
		vdeptcity.clear();
		vdeptcity.sendKeys("chicago");
		
		WebElement varrcity = driver.findElement(By.id("flight-destination"));
		varrcity.clear();
		varrcity.sendKeys("orlando");
		
		WebElement vdeptdate = driver.findElement(By.id("flight-departing"));
		vdeptdate.clear();
		vdeptdate.sendKeys("03/02/2016");
		
		Select vAdult  = new Select(driver.findElement(By.id("flight-adults")));
		Select vchild  =new Select (driver.findElement(By.id("flight-children")));
		
		
		List <WebElement> vAdultcount =vAdult.getOptions();
		int vAdultsize =vAdultcount.size();
		for(int i=0; i<vAdultsize; i++){
	    String	voptionvalue =vAdult.getOptions().get(i).getText();
	    System.out.println(voptionvalue);
		}
	    vAdult.selectByValue("2");
	    int k = 4;int m = 0;
	    vchild.selectByIndex(k);
	 
	    
	   for(int j = 1; j<=k;j++){
	   //String child="//select[@id='flight-age-select-"+j+"'"+"]";
	   String child="flight-age-select-"+j;
	   Select childage = new Select(driver.findElement(By.id(child)));
	   m=m+2;
	   childage.selectByIndex(5+m);  
	   Thread.sleep(2000);
	    }
	    /*Thread.sleep(2000);
	    
	    Select child1 = new Select(driver.findElement(By.id("flight-age-select-1")));
	    child1.selectByValue("12");
	    
	    Select child2 = new Select(driver.findElement(By.id("flight-age-select-2")));
	    child2.selectByValue("14");
	    Select child3 = new Select(driver.findElement(By.id("flight-age-select-3")));
	    child3.selectByValue("16");
	    Thread.sleep(2000);
	    */
	    driver.findElement(By.id("search-button")).click();
	    
	    //driver.close();
	    
	    
	    
	    
	    
			
		}
	}


