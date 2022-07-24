package pagination;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","D:\\Web driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		 
		//List<String> s = new ArrayList<String>();
	int count1 =0;
	do {	
		
		List<WebElement> listofnames = driver.findElements(By.xpath("//td[1]"));
		List<WebElement> Pricelist = driver.findElements(By.xpath("//td[2]"));
		int count =listofnames.size();
		System.out.println(count);
		
		for (int i = 0;i<count;i++) {
			String text =listofnames.get(i).getText();
			String n= Pricelist.get(i).getText();
			int price = Integer.parseInt(n);
	   if(text.contains("Almond")) {
		   System.out.println("The Price of "+text+" is " +price);
		   count1++;
		   
	   } 
			
		}
		if(count1<=0)
		driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
				
	}while(count1<=0);
		
		
		
		
		

	}

}
