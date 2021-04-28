package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BaseClassCreation.BaseClassCreation;

public class LoginPage extends BaseClassCreation{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(id="username"),@FindBy(xpath="//input[@name='username']")})
	private WebElement txtUserName;
	@FindAll({@FindBy(id="password"),@FindBy(xpath="//input[@name='password']")})
	private WebElement txtPassword;
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
}
