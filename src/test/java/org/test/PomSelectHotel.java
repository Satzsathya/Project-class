package org.test;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomSelectHotel extends LibGlobal {
	
	public PomSelectHotel() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement rdbtn;
	public WebElement getRdbtn() {
		return rdbtn;
	}
	public WebElement getBtncont() {
		return btncont;
	}

	@FindBy(id="continue")
	private WebElement btncont;
}
