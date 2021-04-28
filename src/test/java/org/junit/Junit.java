package org.junit;

import java.util.Date;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {

	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize(); 
	}
	@Test
	public void test()  {
		String title = driver.getTitle();
		boolean b = title.contains("Hotel");
		Assert.assertTrue("Verifying Title", b);


		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("qwerty");
		String name = txtUserName.getAttribute("value");
		Assert.assertEquals("verifying username", "qwerty", name);
	}

	public void test2() {
		Result result = JUnitCore.runClasses(Junit.class, Sample.class);
		int f = result.getFailureCount();
		System.out.println(f);
		int i = result.getIgnoreCount();
		System.out.println(i);
		long r = result.getRunTime();
		System.out.println(r);	
	}
}
