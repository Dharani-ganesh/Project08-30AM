package org.test.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver; 
	
	//chrome launch
	public static WebDriver chromeLaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;

	}
	
	//url Launch
		public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
		
	//wait
		public static void impwait(int sec) {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

		}
		
	//Name, Password
		public static void sendkeys(WebElement wb,String info) {
			wb.sendKeys(info);
			
		}
		
	//click
		public static void click(WebElement e) {
			e.click();
		}
		
		
	//getTitle
		public static String getTitle() {
			String title = driver.getTitle();
			return title;
		}
		
	//getCurrentUrl
		public static String getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
			
		}
		
	//getText
		public static String getText(WebElement text) {
			String text2 = text.getText();
			return text2;
		}
		
	//getAttribute
		public static String getAttribute(WebElement username) {
			String name = username.getAttribute("value");
			return name;
		}
	//move to element
		public static void moveToElement(WebElement movename ) {
			Actions actn=new Actions(driver);
			actn.click().perform();
		}
		
	//DragandDrop
		public static void dragandDrop(WebElement from,WebElement to) {
			Actions actn=new Actions(driver);
			actn.dragAndDrop(from, to).perform();
			
		}
		
	//Action Click
		public static void actnClick() {
		Actions act=new Actions(driver);
		act.click().perform();
		}
		
	//Select
		private void selectByName(WebElement drp, String value ) {
			Select s=new Select(drp);
			s.selectByValue(value);
		}
		
	//switch to Frame
		
		public static void switchToFrame(int index) {
		 driver.switchTo().frame(index);
		}
		
		
	//Alert1
		
		public static void simpleAlert() {
		Alert alrt = driver.switchTo().alert();
		alrt.accept();
		}
		
	//Alert 2
		public static void confirmAlert() {
			Alert alrt = driver.switchTo().alert();
			alrt.dismiss();

		}
		
	//Alert 3
		public static void promptAlert()
		{
			Alert alrt = driver.switchTo().alert();
			alrt.sendKeys("ABC");
			alrt.accept();
		}
		
	//WindowsHandling
		
		public static String windowsHandling() {
			String oneid=driver.getWindowHandle();
			return oneid;
		}
		
	//TakesScreenshot
		public static  void takesScreenshot(String snap) throws IOException {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File from = ts.getScreenshotAs(OutputType.FILE);
			File to=new 
        	File("C:\\Users\\SWATHY\\eclipse-workspace\\MavenProject\\src\\test\\java\\org\\test\\base\\Screenshot" + snap + ".png");
			FileUtils.copyFile(from, to);
			
		}
	//JavaScript Executor
		
		public static void jsSendkeys(String data,WebElement e) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("argument[0].setAttribute('value',' " + data + " ')", e);
			
		}
		
	//quit
		public static void quit() {
		driver.quit();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		

