package booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Web driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.makemytrip.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(10000);
		WebElement dep = driver.findElement(By.xpath("//p[@data-cy='departureDate']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(dep).doubleClick(dep).build().perform();
		Thread.sleep(10000);
		WebElement month =driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]/div[@class='DayPicker-Caption']"));
		System.out.println("Current Month is" + month.getText());
		
		while(!month.getText().contains("December"))
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		
		Thread.sleep(6000);
		List<WebElement> day = driver.findElements(By.xpath("//div[@class='dateInnerCell']/p[1]"));
		int count = day.size();
		
		for(int i=0;i<count;i++)
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
