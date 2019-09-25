package sample;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TestTest {
 

 @Test
 public void login()
 {
	 System.setProperty("webdriver.chrome.driver","D:\\Testing Software\\Vishnu Sir_Selenium\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver","D:\\new Testing code\\new selenium code\\chromedriver.exe");
		
		//WebDriver driver=  new ChromeDriver();
	// System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://google.com");
	 System.out.println("open");
	 
	// driver.quit();
 }
 
}
