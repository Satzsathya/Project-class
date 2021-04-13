package org.test;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pombookingconfirm extends LibGlobal{
	
	public Pombookingconfirm() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement btnlogout;

	public WebElement getBtnlogout() {
		return btnlogout;
	}
}
