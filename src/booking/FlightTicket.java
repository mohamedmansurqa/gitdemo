package booking;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightTicket {

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Web driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		WebDriverWait wait =new WebDriverWait(driver, 60);
		 
		 driver.get("https://www.makemytrip.com/");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(10000);		
		 WebElement fromtext = driver.findElement(By.xpath("//input[@id='fromCity']"));
		 WebElement totext = driver.findElement(By.xpath("//input[@id='toCity']")); 
		 wait.until(ExpectedConditions.elementToBeClickable(fromtext));
		 Actions a = new Actions(driver);
		 a.moveToElement(fromtext).doubleClick().build().perform();
		 
		 
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("col");
		 
		 
		 Thread.sleep(10000);
		 List<WebElement> Autocomp = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
		 
		 int count = Autocomp.size();
		 
		 System.out.println(count);
		 
		 for(int i=0;i<count;i++)
		 {
			String City = Autocomp.get(i).getText();
			System.out.println(City);
			
			if(City.contains("Colombo"))
			{
				Autocomp.get(i).click();
				break;
			}
			
		 }
		 
		//WebElement tocity = driver.findElement(By.xpath("//input[@id='toCity']"));
		
		 Thread.sleep(10000);
		// action.moveToElement(tocity).doubleClick().perform();
		 
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
		
		to.sendKeys("Mumbai");

		Thread.sleep(10000);
		List<WebElement> Autocompto = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
		 
		 int count1 = Autocompto.size();
		 
		 System.out.println(count1);
		 
		 for(int i=0;i<count1;i++)
		 {
			String City2 = Autocompto.get(i).getText();
			System.out.println(City2);
			
			if(City2.contains("Mumbai"))
			{
				Autocompto.get(i).click();
				break;
			}
			
		 }
		 
		    Thread.sleep(10000);
			WebElement month =driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]/div[@class='DayPicker-Caption']"));
			System.out.println("Current Month is" + month.getText());
			
			while(!month.getText().contains("December"))
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			
			Thread.sleep(6000);
			List<WebElement> day = driver.findElements(By.xpath("//div[@class='dateInnerCell']/p[1]"));
			int count3 = day.size();
			
			for(int i=0;i<count3;i++)
			{
				String date = day.get(i).getText();
				System.out.println(date);
				if(date.equalsIgnoreCase("3"))
				{
					day.get(i).click();
					break;
				}
		 
		
		
		 

	}

}
}
