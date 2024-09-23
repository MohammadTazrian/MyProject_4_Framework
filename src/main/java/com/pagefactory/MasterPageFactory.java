package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {

	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='fa fa-lock']")
	private WebElement signIn_btn;

	@FindBy(xpath = "(//*[@name='email'])[1]")
	private WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
	private WebElement login_btn;

	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	private WebElement logut_btn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

	public WebElement getLogut_btn() {
		return logut_btn;
	}

	public WebElement getSignIn_btn() {
		return signIn_btn;
	}

}
