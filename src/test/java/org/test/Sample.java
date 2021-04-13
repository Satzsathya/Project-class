package org.test;

import java.io.IOException;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample {

	public static void main(String[] args) throws InterruptedException, IOException {
		LibGlobal g = new LibGlobal();
		WebDriver d = g.getDriver();
		g.loadurl("https://www.facebook.com/");
		g.maximize();
		g.pageTitle();
		WebElement txtprint = d.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
		g.gettext(txtprint);
		WebElement btncreate = d.findElement(By.xpath("//a[text()='Create New Account']"));
		g.btnclick(btncreate);
		Thread.sleep(3000);
		WebElement txtfname = d.findElement(By.name("firstname"));
		g.sendkeys(txtfname, "Sathya");
		WebElement txtlname = d.findElement(By.name("lastname"));
		g.sendkeys(txtlname, "V");
		WebElement txtemail = d.findElement(By.xpath("//input[@name='reg_email__']"));
		g.sendkeys(txtemail, "sathya@gmail.com");
		WebElement txtpass = d.findElement(By.xpath("//input[@name='reg_passwd__']"));
		g.sendkeys(txtpass, "sathya123");
		WebElement dDnday = d.findElement(By.xpath("//select[@id='day']"));
		g.toSelect(dDnday);
		WebElement dDnmonth = d.findElement(By.xpath("//select[@id='month']"));
		g.toSelect(dDnmonth);
		WebElement dDnyear = d.findElement(By.xpath("//select[@id='year']"));
		g.toSelect(dDnyear);
		g.allOptionInDropDown(dDnday);
		g.allOptionInDropDown(dDnmonth);
		g.allOptionInDropDown(dDnyear);
		g.gettext(dDnday);
		g.gettext(dDnmonth);
		g.gettext(dDnyear);
		//g.Screenshot();
		
		WebElement scroll = d.findElement(By.xpath("//span[text()=' Facebook © 2021']"));
		g.scrolldown(scroll);
		
		
	}

}
