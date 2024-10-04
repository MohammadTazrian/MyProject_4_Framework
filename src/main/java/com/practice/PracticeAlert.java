package com.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactory.MasterPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAlert {

	public void getAlert() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		mpf.getAlertBtn2().click();
	
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		
	}
	
	public static void main(String[] args) {
		PracticeAlert obj = new PracticeAlert();
		obj.getAlert();
	}
	
	
}
