package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.Pomtests;

public class Facebook extends Pomtests{
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\V.Sathya\\eclipse-workspace\\Maventest\\Driver\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		Pomtests pt = new Pomtests();
		
		WebElement txtemail = pt.getTxtemail();
		txtemail.sendKeys("welcome");
		
		WebElement txtpass = pt.getTxtpass();
		txtpass.sendKeys("password");
		
		WebElement btnlogin = pt.getBtnlogin();
		btnlogin.click();
	}

}
