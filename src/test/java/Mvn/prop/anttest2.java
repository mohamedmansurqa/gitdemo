package Mvn.prop;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class anttest2 {
	
@Test(groups="smoke")
public void method3() {
		
		System.out.println("C");
		
	}
	
	@AfterTest	
	public void method4() {
		System.out.println("D");
	}
	
	@Test(dataProvider="O")
	public void method5(String u,String p) {
		System.out.println("E");
		System.out.println(u);
		System.out.println(p);
	}
	
	
	@AfterMethod
	public void mthd() {
		
		System.out.println("Printed after Method");
		
	}
	
	@AfterClass
	public void method9() {
		
		System.out.println("Printed after Class");
		
	}
	@DataProvider (name="O")
	public Object[][] getdata() {
		
		Object[][] O=new Object[3][2];
		
		O[0][0]="1";
		O[0][1]="2";
		O[1][0]="3";
		O[1][1]="4";
		O[2][0]="5";
		O[2][1]="6";
		
		return O;
		
		
	}
}
