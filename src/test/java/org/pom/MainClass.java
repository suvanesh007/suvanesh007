package org.pom;

import org.openqa.selenium.WebElement;

import BaseClassCreation.BaseClassCreation;

public class MainClass extends BaseClassCreation {
	public static void main(String[] args) {
		getDriver();
		launchUrl("https://adactinhotelapp.com/");
		LoginPage lp=new LoginPage();
		WebElement txtUserName = lp.getTxtUserName();
		enterText(txtUserName, "karthi007");
		driver.navigate().refresh();
		WebElement txtUserName1 = lp.getTxtUserName();
		enterText(txtUserName1, "karthi007");
		WebElement txtPassword = lp.getTxtPassword();
		enterText(txtPassword, "Karthi@1989");
	}
}
