package org.test;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomSearch extends LibGlobal {
		
	public PomSearch() {
		PageFactory.initElements(d, this);
	}
	@FindBy(id="location")
	private WebElement dDnlocation;
	@FindBy(id="hotels")
	private WebElement dDnhotels;
	@FindBy(id="room_type")
	private WebElement dDnroomtype;
	@FindBy(id="room_nos")
	private WebElement dDnnoofrooms;
	@FindBy(id="adult_room")
	private WebElement dDnadults;
	@FindBy(id="child_room")
	private WebElement dDnchildrens;
	@FindBy(id="Submit")
	private WebElement btnsearch;

	public WebElement getBtnsearch() {
		return btnsearch;
	}
	public WebElement getdDnlocation() {
		return dDnlocation;
	}
	public WebElement getdDnhotels() {
		return dDnhotels;
	}
	public WebElement getdDnroomtype() {
		return dDnroomtype;
	}
	public WebElement getdDnnoofrooms() {
		return dDnnoofrooms;
	}
	public WebElement getdDnadults() {
		return dDnadults;
	}
	public WebElement getdDnchildrens() {
		return dDnchildrens;
	}
}
