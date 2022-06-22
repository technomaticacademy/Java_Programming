package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_class_001 {
	
	public static void main(String[] arg) {
		
		String driverPath = "E:\\Technomatic\\git\\Test_001\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		
	}

}
