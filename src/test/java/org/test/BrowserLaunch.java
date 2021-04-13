package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\V.Sathya\\eclipse-workspace\\Maventest\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		
		WebElement txtuser = d.findElement(By.id("email"));
		txtuser.sendKeys("satzsatiya@gmail.com");
		
		WebElement txtpass = d.findElement(By.id("pass"));
		txtpass.sendKeys("sathya@123");
		
		WebElement btnlogin = d.findElement(By.name("login"));
		btnlogin.click();
	}

}
