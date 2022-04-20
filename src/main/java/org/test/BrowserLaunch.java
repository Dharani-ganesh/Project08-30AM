package org.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.test.base.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends BaseClass {
	
	public static void main(String[] args) {
		
		chromeLaunch();
		
		urlLaunch("https://www.facebook.com/");
		impwait(10);
		
//		WebElement Username=driver.findElement(By.id("email"));
//		sendkeys(Username,"Dharani");
//		String attrname = Username.getAttribute("value");
		
		LoginPage ln=new LoginPage();
		ln.start();
		
		sendkeys(ln.getTextUsername(), "Dharani");
		
		WebElement Password = driver.findElement(By.id("pass"));
		sendkeys(Password,"Dharani123$");
		
	
		//quit();
		
	}

	

}

