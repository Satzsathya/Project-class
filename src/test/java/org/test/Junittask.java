package org.test;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class Junittask {
	static WebDriver d;
	@BeforeClass
	public static void beforclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\V.Sathya\\eclipse-workspace\\Maventest\\Driver\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.redbus.in/");
		d.manage().window().maximize();
	}
	@AfterClass
	public static void afterclass() {
		d.quit();
	}
	@Before
	public void beforemethod() {
		Date date = new Date();
		System.out.println(date);
	}
	@After
	public void aftermethod() {
		Date date = new Date();
		System.out.println(date);
	}
	
	@Test
	public void test() {
		WebElement btn = d.findElement(By.id("select_box_sign"));
		btn.click();
		WebElement btnsignin = d.findElement(By.id("signInLink"));
		btnsignin.click();
		WebElement txtuser = d.findElement(By.id("select_box_sign"));
		txtuser.sendKeys("satzsatiya");
		Assert.assertEquals("satzsatiya", txtuser.getAttribute("value"));
		WebElement txtpass = d.findElement(By.id("pass"));
		txtpass.sendKeys("sathya@123");
		Assert.assertEquals("sathya@123", txtpass.getAttribute("value"));
		WebElement btnlogin = d.findElement(By.name("login"));
		btnlogin.click();
	}
}
