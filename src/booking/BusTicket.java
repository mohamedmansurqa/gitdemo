package booking;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusTicket {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Web driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 


		 driver.get("https://www.redbus.in/");
		 WebElement from =driver.findElement(By.id("src"));
		 WebElement to = driver.findElement(By.id("dest"));
		 from.sendKeys("Madurai");
		 WebDriverWait wait=new WebDriverWait(driver, 40);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.autoFill.homeSearch")));
		 
		 List<WebElement> option = driver.findElements(By.xpath("//ul/li"));
		 
		 for (WebElement options :option)
		 {
			 if (options.getText().equalsIgnoreCase("Thirumangalam, Madurai"))
			 {
				 options.click();
			 }
			 break;
		 }
		// to.sendKeys("Chennai");
//List<WebElement> option1 = driver.findElements(By.cssSelector("li.sub-city"));
		 
		// for (WebElement options1 :option1)
		 //{
			// if (options1.getText().equalsIgnoreCase("Tambaram, Chennai"))
			 //{
			//	 options1.click();
			// }
			// break;
			
		// }
		// driver.findElement(By.xpath("@id= onward_cal")).click();
		// while(!driver.findElement(By.cssSelector("td#monthTitle")).getText().contains("Apr"))
		// {
		//	 driver.findElement(By.cssSelector("td.next")).click();
		// }

	}

	private static WebElement findElements(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
