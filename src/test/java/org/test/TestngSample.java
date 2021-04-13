package org.test;

import java.io.IOException;
import java.lang.reflect.Method;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngSample extends LibGlobal{
	
	
	@BeforeClass
	private void beforeclass() {
		getDriver();
		loadurl("http://adactinhotelapp.com/index.php");
		maximize();
	}
	
	@Parameters({"username","password"})
	@Test(priority=1)
	private void login(String user,String Password) {
		
		WebElement txtusername = LocatorById("username");
		sendkeys(txtusername, user);
		WebElement txtpass = LocatorById("password");
		sendkeys(txtpass, Password);
		WebElement btncli = LocatorById("login");
		btnclick(btncli);
	}
	
	@Parameters({"location","hotels","room_type","room_nos","adult_room","child_room"})
	@Test
	private void searchhotel(String location,String hotelname,String roomtype,String noofrooms,String adultroom,String childroom) {
		WebElement dDnlocation = LocatorById("location");
		sendkeys(dDnlocation, location);
		WebElement dDnhotels = LocatorById("hotels");
		sendkeys(dDnhotels, hotelname);
		WebElement dDnroomtype = LocatorById("room_type");
		sendkeys(dDnroomtype, roomtype);
		WebElement dDnnoofrooms = LocatorById("room_nos");
		sendkeys(dDnnoofrooms, noofrooms);
		WebElement dDnadults = LocatorById("adult_room");
		sendkeys(dDnadults, adultroom);
		WebElement dDnchildrens = LocatorById("child_room");
		sendkeys(dDnchildrens, childroom);
		WebElement btnsearch2 = LocatorById("Submit");
		btnclick(btnsearch2);
	}
	
	@Test
	private void selecthotel() {
		WebElement btnradio = LocatorById("radiobutton_0");
		btnclick(btnradio);
		WebElement btncontinue = LocatorById("continue");
		btnclick(btncontinue);
	}
	
	@Parameters({"first_name","last_name","address","cc_num","cc_type","cc_exp_month","cc_exp_year","cc_cvv"})
	@Test
	private void tbookhotel(String fname,String lname,String address,String ccno,String cardtype,String month,String year,String cvvno) throws InterruptedException {
		WebElement txtfname = LocatorById("first_name");
		sendkeys(txtfname, fname);
		WebElement txtlname = LocatorById("last_name");
		sendkeys(txtlname, lname);
		WebElement txtaddress = LocatorById("address");
		sendkeys(txtaddress, address);
		WebElement txtccno = LocatorById("cc_num");
		sendkeys(txtccno, ccno);
		WebElement dDncardtype = LocatorById("cc_type");
		sendkeys(dDncardtype, cardtype);
		WebElement dDnmonth = LocatorById("cc_exp_month");
		sendkeys(dDnmonth, month);
		WebElement dDnyear = LocatorById("cc_exp_year");
		sendkeys(dDnyear, year);
		WebElement txtcvv = LocatorById("cc_cvv");
		sendkeys(txtcvv, cvvno);
		WebElement btnbook = LocatorById("book_now");
		btnclick(btnbook);
	}
	
	@Test
	private void ulogout() {
		WebElement btnlogout = LocatorByXpath("//a[text()='Logout']");
		btnclick(btnlogout);
	}
	
	@BeforeMethod
	private void beforemethod(Method m) throws IOException {
		Screenshot(m.getName());
	}
	@AfterMethod
	private void after(Method m) throws IOException {
		Screenshot(m.getName());
	}
	
}
 