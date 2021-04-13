package org.test;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pompurchase extends LibGlobal{
	public Pompurchase() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="inputName")
	private WebElement  txtFirstName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="city")
	private WebElement txtCity;
	
	@FindBy(id="state")
	private WebElement txtState;
	
	@FindBy(id="zipCode")
	private WebElement txtZipcode;
	
	@FindBy(id="cardType")
	private WebElement selectCardType;
	
	@FindBy(id="creditCardNumber")
	private WebElement txtCardnumber;
	
	@FindBy(id="creditCardMonth")
	private WebElement txtExpiryMonth;
	
	@FindBy(id="creditCardYear")
	private WebElement txtExpiryYear;
	
	@FindBy(id="nameOnCard")
	private WebElement txtCardname;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement clickSubmit;
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtState() {
		return txtState;
	}

	public WebElement getTxtZipcode() {
		return txtZipcode;
	}

	public WebElement getSelectCardType() {
		return selectCardType;
	}

	public WebElement getTxtCardnumber() {
		return txtCardnumber;
	}

	public WebElement getTxtExpiryMonth() {
		return txtExpiryMonth;
	}

	public WebElement getTxtExpiryYear() {
		return txtExpiryYear;
	}

	public WebElement getTxtCardname() {
		return txtCardname;
	}

	public WebElement getClickSubmit() {
		return clickSubmit;
	}
}
