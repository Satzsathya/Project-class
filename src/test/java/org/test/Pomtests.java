package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pomtests {
	public static WebDriver d;
	
	public Pomtests() {
		PageFactory.initElements(d,this);
	}
	
	@FindBy(id="email")
	private WebElement txtemail;
	@FindBy(id="pass")
	private WebElement txtpass;
	@FindBy(name="login")
	private WebElement btnlogin;
	
	public WebElement getTxtemail() {
		return txtemail;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
}
