package org.test;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomreserve extends LibGlobal {
	public Pomreserve() {
		
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="(//input[@value='Choose This Flight'])[3]")
	private WebElement btnchoose;

	public WebElement getBtnchoose() {
		return btnchoose;
	}

	
}
