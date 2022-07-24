package booking;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import graphql.Assert;

public class RadioCheck {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Web driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement Radio2 = driver.findElement(By.xpath("//input[@value='radio2']"));
		System.out.println("The radio btn is selected--" +Radio2.isSelected());
		
		
		Radio2.click();
		System.out.println("The radio btn is selected--" +Radio2.isSelected());
		
		Assert.assertTrue(Radio2.isSelected());
		
		WebElement autocomplete = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		autocomplete.sendKeys("Fr");
		
		List<WebElement> city = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		int count = city.size();
		
		
		for (int i =0;i<count;i++) 
		{
			String option = city.get(i).getText();
			System.out.println(option);
			
			if (option.equalsIgnoreCase("French Guiana"))
					{
				
				city.get(i).click();
				break;
				
			}
		}
		
		WebElement staticdrop = driver.findElement(By.cssSelector("select#dropdown-class-example"));
		
		Select drop =new Select( staticdrop);
		
		drop.selectByIndex(2);
		
		WebElement checkbox = driver.findElement(By.cssSelector("input#checkBoxOption3"));
		
		System.out.println("The Checkbox is selected--" +checkbox.isSelected());
		
		checkbox.click();
		
		System.out.println("The Checkbox is selected--" +checkbox.isSelected());
		
		
		
		
		
		

	}

}
