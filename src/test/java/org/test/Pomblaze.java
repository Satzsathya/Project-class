package org.test;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomblaze extends LibGlobal{
	
	public Pomblaze() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(name="fromPort")
	private WebElement dDndeparture;
	
	
	@FindBy(name="toPort")
	private WebElement dDndestination;
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnfindflight;


	public WebElement getdDndeparture() {
		return dDndeparture;
	}


	public WebElement getdDndestination() {
		return dDndestination;
	}


	public WebElement getBtnfindflight() {
		return btnfindflight;
	}
	
}
