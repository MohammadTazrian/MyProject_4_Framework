package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactory.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLogin {
	
	MasterPageFactory mpf;
	
	public void getLoginWeb() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to(BaseConfig.getConfigValue("URL"));

		mpf = new MasterPageFactory(driver);
		
		
		
		Highlighter.addColor(driver, mpf.getSignIn_btn());
		//driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
        mpf.getSignIn_btn().click();
		
		
        Highlighter.addColor(driver, mpf.getEmail());
        //driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("rezwanislam857@gmail.com");
        mpf.getEmail().sendKeys(BaseConfig.getConfigValue("Email"));
		
     
        Highlighter.addColor(driver, mpf.getPassword());
        //driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Boston2023");
        mpf.getPassword().sendKeys(BaseConfig.getConfigValue("Password"));
        
		
        Highlighter.addColor(driver, mpf.getLogin_btn());
        //driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();
        mpf.getLogin_btn().click();
        
        
        
        //driver.findElement(By.xpath("//*[contains(text(),'Logout')]"
		if (mpf.getLogut_btn().isDisplayed()) {
			System.out.println("Login Successful!");
		} else {
			System.out.println("Login Failed!");
		}

		Screenshot.getScreenShot(driver, "HomepageLogin");
		
		driver.manage().deleteAllCookies();

		driver.quit();

	}

}
