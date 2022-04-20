package org.test;

import org.openqa.selenium.edge.EdgeDriver;
import org.test.base.BaseClass;
import org.test.portal.Login;

public class BrowserLaunch1 extends BaseClass {

	public static void main(String[] args) {

		chromeLaunch();
		
		urlLaunch("https://www.facebook.com/");
		
		impwait(10);
		
		Login lg=new Login();
		

		
//		WebElement txtusername = driver.findElement(By.id("email"));
		sendkeys(lg.getTxtUsername(), "Dharani"); 
		
//		WebElement pwd = driver.findElement(By.id("pass"));
		sendkeys(lg.getTxtUserpwd(), "dharani@123");
		
		click(lg.getLoginbtn());
		
		driver.navigate().refresh();
		
		/*WebElement txtusername1 = driver.findElement(By.id("email"));
		sendkeys(txtusername1, "Ganesh");
		
		WebElement pwd1 = driver.findElement(By.id("pass"));
		sendkeys(pwd1, "ganesh@098");
		*/
		
	
	}

}
