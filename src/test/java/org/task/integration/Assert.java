package org.task.integration;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert extends BaseClass {
	@Test
	public void test() throws IOException, Throwable {
		SoftAssert soft = new SoftAssert();
		BaseClass.getDriver();
		BaseClass.launchUrl("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement firstName = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		BaseClass.enterText(firstName, BaseClass.sheetLocation(1, 0));
		String attribute = firstName.getAttribute("value");
		soft.assertEquals(attribute, "suvanesh");
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		BaseClass.enterText(lastName, BaseClass.sheetLocation(1, 1));
		String attribute2 = lastName.getAttribute("value");
		soft.assertEquals(attribute2, "sundar");
		WebElement add = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		BaseClass.enterText(add, BaseClass.sheetLocation(1, 2));
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		BaseClass.enterText(email, BaseClass.sheetLocation(1, 3));
		WebElement phNo = driver.findElement(By.xpath("//input[@type='tel']"));
		BaseClass.enterText(phNo, BaseClass.sheetLocation(1, 4));
		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
		BaseClass.btnClick(gender);
		WebElement hobbies = driver.findElement(By.xpath("//input[@value='Cricket']"));
		BaseClass.btnClick(hobbies);
		Thread.sleep(2000);
		WebElement lan = driver.findElement(By.id("msdd"));
		BaseClass.btnClick(lan);
		WebElement l = driver.findElement(By.xpath("//a[text()='Hindi']"));
		BaseClass.btnClick(l);
		WebElement chumma = driver.findElement(By.id("basicBootstrapForm"));
		BaseClass.btnClick(chumma);
		WebElement skill = driver.findElement(By.id("Skills"));
		BaseClass.btnClick(skill);
		BaseClass.selectByVis(skill, "C++");
		WebElement country = driver.findElement(By.id("countries"));
		BaseClass.btnClick(country);
		BaseClass.selectByVis(country, "India");
		WebElement chumma1 = driver.findElement(By.id("basicBootstrapForm"));
		BaseClass.btnClick(chumma1);
		WebElement year = driver.findElement(By.id("yearbox"));
		BaseClass.selectByVis(year, "1996");
		WebElement month = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		BaseClass.selectByVis(month, "October");
		WebElement day = driver.findElement(By.id("daybox"));
		BaseClass.selectByVis(day, "31");
		WebElement pass = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		BaseClass.enterText(pass, "qwerty");
		WebElement conpass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		BaseClass.enterText(conpass, "qwerty");
		//driver.findElement(By.id("submitbtn")).click();
	}
}


