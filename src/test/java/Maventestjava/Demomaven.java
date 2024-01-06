package Maventestjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demomaven {
	@Test
	public void sampleTest() {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
}



