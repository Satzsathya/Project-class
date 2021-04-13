package org.test;

import java.io.IOException;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;

public class Excelinsert extends LibGlobal {

	public static void main(String[] args) throws InterruptedException, IOException {
		LibGlobal g = new LibGlobal();
		g.getDriver();
		g.loadurl("http://adactinhotelapp.com/index.php");
		g.maximize();
		WebElement txtusername = LocatorById("username");
		g.sendkeys(txtusername, "satzsatiya");
		WebElement txtpassword = LocatorById("password");
		g.sendkeys(txtpassword, "sathya@123");
		WebElement btnlogin = LocatorById("login");
		g.btnclick(btnlogin);
		
		WebElement dDnlocation = LocatorById("location");
		g.sendkeys(dDnlocation, g.Exceldata("C:\\Users\\V.Sathya\\eclipse-workspace\\Maventest\\Excelfile\\Hotel.xlsx", "HotelDetails", 3, 0));
		WebElement dDnhotelname = LocatorById("hotels");
		g.sendkeys(dDnhotelname, g.Exceldata("C:\\Users\\V.Sathya\\eclipse-workspace\\Maventest\\Excelfile\\Hotel.xlsx", "HotelDetails", 3, 1));
		WebElement dDnroomtype = LocatorById("room_type");
		g.sendkeys(dDnroomtype, g.Exceldata("C:\\Users\\V.Sathya\\eclipse-workspace\\Maventest\\Excelfile\\Hotel.xlsx", "HotelDetails", 3, 2));
		WebElement dDnnoofrooms = LocatorById("room_nos");
		g.sendkeys(dDnnoofrooms, g.Exceldata("C:\\Users\\V.Sathya\\eclipse-workspace\\Maventest\\Excelfile\\Hotel.xlsx", "HotelDetails", 3, 3));
		WebElement txtdatein = LocatorById("datepick_in");
		g.sendkeys(txtdatein, g.Exceldata("C:\\Users\\V.Sathya\\eclipse-workspace\\Maventest\\Excelfile\\Hotel.xlsx", "HotelDetails", 1, 4));
		WebElement txtdateout = LocatorById("datepick_out");
		g.sendkeys(txtdateout, g.Exceldata("C:\\Users\\V.Sathya\\eclipse-workspace\\Maventest\\Excelfile\\Hotel.xlsx", "HotelDetails", 1, 5));
		WebElement dDnadults = LocatorById("adult_room");
		g.sendkeys(dDnadults, g.Exceldata("C:\\Users\\V.Sathya\\eclipse-workspace\\Maventest\\Excelfile\\Hotel.xlsx", "HotelDetails", 2, 6));
		WebElement dDnchildrens = LocatorById("child_room");
		g.sendkeys(dDnchildrens, g.Exceldata("C:\\Users\\V.Sathya\\eclipse-workspace\\Maventest\\Excelfile\\Hotel.xlsx", "HotelDetails", 3, 7));
		WebElement btnsearch = LocatorById("Submit");
		g.btnclick(btnsearch);
		Thread.sleep(300);
		WebElement btnradio = LocatorById("radiobutton_0");
		g.btnclick(btnradio);
		WebElement btncontinue = LocatorById("continue");
		g.btnclick(btncontinue);
		Thread.sleep(300);
		WebElement txtfname = LocatorById("first_name");
		g.sendkeys(txtfname, "Sathya");
		WebElement txtlname = LocatorById("last_name");
		g.sendkeys(txtlname, "V");
		WebElement txtaddress = LocatorById("address");
		g.sendkeys(txtaddress, "Vellore");
		WebElement txtccno = LocatorById("cc_num");
		g.sendkeys(txtccno, "7894561230123654");
		WebElement dDncardtype = LocatorById("cc_type");
		g.sendkeys(dDncardtype, "VISA");
		WebElement dDnmonth = LocatorById("cc_exp_month");
		g.sendkeys(dDnmonth, "August");
		WebElement dDnyear = LocatorById("cc_exp_year");
		g.sendkeys(dDnyear, "2022");
		WebElement txtcvv = LocatorById("cc_cvv");
		g.sendkeys(txtcvv, "363");
		WebElement btnbook = LocatorById("book_now");
		g.btnclick(btnbook);
		Thread.sleep(5000);
		WebElement txtorderno = g.LocatorByXpath("//input[@id='order_no']");
		g.excelvalueInsert("C:\\Users\\V.Sathya\\eclipse-workspace\\Maventest\\Excelfile\\Hotel.xlsx", "HotelDetails", 2, 8, txtorderno);
	}

}
