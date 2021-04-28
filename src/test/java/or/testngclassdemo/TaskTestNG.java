package or.testngclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TaskTestNG {
	WebDriver driver;
	@Test
	@Parameters({"Firstname","Lastname","Address","Email","Phno","Language","Password","FPassword"})
	private void test(String Firstname, String Lastname, String Address, String Email, String Phno, String Language, String Password, String FPassword) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(Firstname);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Lastname);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(Address);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(Phno);
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("msdd"));
		WebElement skills = driver.findElement(By.id("Skills"));
		Select se=new Select(skills);
		se.selectByVisibleText("C++");
		WebElement country = driver.findElement(By.id("countries"));
		Select s=new Select(country);
		s.selectByIndex(10);
		WebElement year = driver.findElement(By.id("yearbox"));
		Select ye=new Select(year);
		ye.selectByVisibleText("1996");
		WebElement month = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		Select mon=new Select(month);
		mon.selectByValue("October");
		WebElement day = driver.findElement(By.id("daybox"));
		Select d=new Select(day);
		d.selectByValue("31");
		driver.findElement(By.id("firstpassword")).sendKeys(Password);
		driver.findElement(By.id("secondpassword")).sendKeys(FPassword);
		//driver.findElement(By.id("submitbtn")).click();

	}
}
