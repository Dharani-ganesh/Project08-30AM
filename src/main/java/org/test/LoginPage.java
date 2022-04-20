package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.BaseClass;

public class LoginPage extends BaseClass {

	public void start() {
//		WebDriver driver = null;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
