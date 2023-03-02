package Project_Amazon.com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner {
	@Test
	public void browserLaunch() {
		System.out.println("Program Started");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
				
		
		
	}

}
