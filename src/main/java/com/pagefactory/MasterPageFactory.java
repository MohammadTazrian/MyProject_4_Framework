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

	@FindBy(xpath = "//*[@id='confirmBox']")
	private WebElement alertBtn2;

	@FindBy(xpath = "(//*[@aria-label='Services'])[1]")
	private WebElement services;
	
	@FindBy(xpath = "//*[@id='oldSelectMenu']")
	private WebElement dropdown3;

	public WebElement getDropdown3() {
		return dropdown3;
	}

	public WebElement getServices() {
		return services;
	}

	public WebElement getAlertBtn2() {
		return alertBtn2;
	}

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
