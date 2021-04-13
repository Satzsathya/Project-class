package org.test;
import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Pombookhotel extends LibGlobal {
	public Pombookhotel() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtfname;
	public WebElement getTxtfname() {
		return txtfname;
	}
	@FindBy(id="last_name")
	private WebElement txtlname;
	public WebElement getTxtlname() {
		return txtlname;
	}
	@FindBy(id="address")
	private WebElement txtaddress;
	public WebElement getTxtaddress() {
		return txtaddress;
	}
	@FindBy(id="cc_num")
	private WebElement txtccno;
	public WebElement getTxtccno() {
		return txtccno;
	}
	@FindBy(id="cc_type")
	private WebElement dDncardtype;
	public WebElement getdDncardtype() {
		return dDncardtype;
	}
	@FindBy(id="cc_exp_month")
	private WebElement dDnmonth;
	public WebElement getdDnmonth() {
		return dDnmonth;
	}
	@FindBy(id="cc_exp_year")
	private WebElement dDnyear;
	public WebElement getdDnyear() {
		return dDnyear;
	}
	@FindBy(id="cc_cvv")
	private WebElement txtcvv;
	public WebElement getTxtcvv() {
		return txtcvv;
	}
	@FindBy(id="book_now")
	private WebElement btnbook;
	public WebElement getBtnbook() {
		return btnbook;
	}
}
