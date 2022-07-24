package Mvn.prop;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class anttest {
	@Parameters({"URL"})
	@Test(groups="smoke")
	public void method1(String urlname) {
		
		System.out.println("A");
		System.out.println(urlname);
		
	}
	
	@Test
	public void method6() {
		
		System.out.println("S");
		
	}
	
	@BeforeTest	
	public void method2() {
		System.out.println("B");
	}
	@BeforeClass
	public void cls() {
		
		System.out.println("Printed Before Class");
		
	}

}
