package or.testngclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrowserLaunchTestNG {
	WebDriver driver;
	@BeforeClass
	private void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	private void afterClass() {
		driver.quit();
	}
	@Test
	public void test1() {
		driver.findElement(By.id("username")).sendKeys("qwerty");
		driver.findElement(By.id("password")).sendKeys("qwerty");
		driver.findElement(By.id("login")).click();

	}




}
