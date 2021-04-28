package org.report.generating;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import javax.xml.stream.events.EndDocument;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseClassCreation.BaseClassCreation;

public class ReportGenerating extends BaseClassCreation{
	ExtentReports reports;
	ExtentHtmlReporter htmlReporter;
	ExtentTest test;

	@BeforeClass
	private void beforeClass() {
		reports = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\ELCOT\\eclipse-workspace\\DemomavenCode\\test-output\\Adactin.html");
		reports.attachReporter(htmlReporter);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setDocumentTitle("Automation report");
		getDriver();
		launchUrl("https://adactinhotelapp.com/");
	}
	@BeforeMethod
	private void beforeMethod() {
		Date date=new Date();
		System.out.println(date);
	}
	@AfterMethod
	private void afterMethod(Method method) throws IOException {
		getScreenshot(method.getName());
	}
	@Test
	private void testCase0() throws IOException {
		test = reports.createTest("Validating home page of Adactin");
		test.log(Status.INFO, "verrify URL of Adactin");
		if (driver.getCurrentUrl().contains("adactin")) {
			test.log(Status.PASS, "valid url");
		} else {
			test.log(Status.FAIL, "Invalid url");
		}
		WebElement logo = driver.findElement(By.className("logo"));
		if (logo.isDisplayed()) {
			test.log(Status.PASS, "Adactin logo is present");
			File screenshotAs = logo.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs, new File("logo.png"));
		} else {
			test.log(Status.FAIL, "Adactin logo is not present");
		}

	}
	@Test
	private void testCase1() {
		test = reports.createTest("Entering UserName and Password");
		WebElement txtUserName = driver.findElement(By.id("username"));
		test.log(Status.INFO, "Verifying Username field");
		if (txtUserName.isEnabled() && txtUserName.isDisplayed()) {
			test.log(Status.PASS, "UserName box is enabled");
			txtUserName.sendKeys("Karthi007");
		} else {
			test.log(Status.FAIL, "UserName is not enabled");
		}
		test.log(Status.INFO, "Verifying password field");
		WebElement txtPassword = driver.findElement(By.id("password"));
		if (txtPassword.isDisplayed() && txtPassword.isDisplayed()) {
			test.log(Status.PASS, "Password is enabled and displayed");
			txtPassword.sendKeys("Karthi@1989");
		} else {
			test.log(Status.FAIL, "Password is not enabled and displayed");
		}
		driver.findElement(By.id("login")).click();
	}
	@Test
	private void testCase2() {
		test = reports.createTest("Clicking location, hotel and room type");
		WebElement btnLocation = driver.findElement(By.id("location"));
		test.log(Status.INFO, "Verifying the location field");
	}

	@AfterClass
	public void end() {
		reports.flush();

	}
}










