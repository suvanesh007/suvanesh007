package BaseClassCreation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassCreation {
	public static WebDriver driver;

	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	//1
	public static void launchUrl(String data) {
		driver.get(data);
	}
	//2
	public static void enterText(WebElement element, String data) {
		element.sendKeys(data);
	}
	//3
	public void btnClick(WebElement button) {
		button.click();
	}
	//4
	public static void moveToElement(WebElement element) {
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
	}
	//5
	public static void enterTextByJs(WebElement element, String data) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+data+"')", element);
	}
	//6 
	public static void getSize(WebElement element) {
		element.getSize();
	}
	//7
	public static  void getText(WebElement element) {
		element.getText();
	}
	//8
	public static  void getAllOptions(WebElement ref, String data) {
		Select s=new Select(ref);
		s.getOptions();
	}
	//9
	public static void getScreenshot(String string) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File f=new File("Scrennshot//scr"+string+".png");
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotAs, f);
		System.out.println(screenshotAs);
	}
	//10
	public static void getAttribute(WebElement element, String data) {
		element.getAttribute(data);
	}
	//11
	public static void dragAndDrop(WebElement element1, WebElement element2) {
		Actions ac=new Actions(driver);
		ac.dragAndDrop(element1, element2);
	}
	//12
	public static void rightClick(WebElement element) {
		Actions ac=new Actions(driver);
		ac.contextClick(element).perform();
	}
	//13
	public static void doubleClick(WebElement element) {
		Actions ac=new Actions(driver);
		ac.doubleClick(element).perform();
	}
	//14
	public static void simpleAlert() {
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	//15
	public static void confirmAlert() {
		Alert al=driver.switchTo().alert();
		al.accept();
		al.dismiss();
	}
	//16
	public static void promptAlert(String data) {
		Alert al=driver.switchTo().alert();
		al.accept();
		al.dismiss();
		al.sendKeys(data);
	}
	//17






}










