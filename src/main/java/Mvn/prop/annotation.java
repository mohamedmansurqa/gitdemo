package Mvn.prop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class annotation {
	@Test
	public void property() throws IOException {
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		
		System.out.println("AB");
		System.out.println("BC");
		System.out.println("CD");
		System.out.println("EF");
		
		Properties fis = new Properties();
		FileInputStream prop = new FileInputStream("C:\\Users\\ELCOT\\eclipse-workspace\\prop\\src\\main\\java\\Mvn\\prop\\123.properties");
		
		fis.load(prop);
		System.out.println(fis.getProperty("browser"));
		
		fis.setProperty("browser", "firefox");

		System.out.println(fis.getProperty("browser"));
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ELCOT\\eclipse-workspace\\prop\\src\\main\\java\\Mvn\\prop\\123.properties");
		fis.store(fos, null);
	}

}
