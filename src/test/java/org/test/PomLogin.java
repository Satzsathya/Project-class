package org.test;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLogin extends LibGlobal{
	
	public PomLogin() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="username")
	private WebElement txtusername;
	public WebElement getTxtusername() {
		return txtusername;
	}
	
	@FindBy(id="password")
	private WebElement txtpassword;
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	
	@FindBy(id="login")
	private WebElement btnlogin;
	public WebElement getBtnlogin() {
		return btnlogin;
	}
}
