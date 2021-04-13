package org.test;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.test.PomSearch;
import org.test.PomLogin;
public class AdactinHotel extends LibGlobal{

	public static void main(String[] args){
		LibGlobal g = new LibGlobal();
		g.getDriver();
		g.loadurl("http://adactinhotelapp.com/index.php");
		g.maximize();
		PomLogin pb = new PomLogin();
		WebElement txtusername = pb.getTxtusername();
		txtusername.sendKeys("satzsatiya");
		WebElement txtpassword = pb.getTxtpassword();
		txtpassword.sendKeys("sathya@123");
		WebElement btnlogin = pb.getBtnlogin();
		btnlogin.click();
		PomSearch ps = new PomSearch();
		WebElement getdDnlocation = ps.getdDnlocation();
		getdDnlocation.sendKeys("Sydney");
		WebElement getdDnhotels = ps.getdDnhotels();
		getdDnhotels.sendKeys("Hotel Creek");
		WebElement getdDnroomtype = ps.getdDnroomtype();
		getdDnroomtype.sendKeys("Super Deluxe");
		WebElement getdDnnoofrooms = ps.getdDnnoofrooms();
		getdDnnoofrooms.sendKeys("2-Two");
		WebElement getdDnadults = ps.getdDnadults();
		getdDnadults.sendKeys("2-Two");
		WebElement getdDnchildrens = ps.getdDnchildrens();
		getdDnchildrens.sendKeys("2-Two");
		WebElement btnsearch2 = ps.getBtnsearch();
		btnsearch2.click();
		PomSelectHotel psh = new PomSelectHotel();
		WebElement rdbtn = psh.getRdbtn();
		rdbtn.click();
		WebElement btncont = psh.getBtncont();
		btncont.click();
		Pombookhotel pbh = new Pombookhotel();
		WebElement txtfname = pbh.getTxtfname();
		txtfname.sendKeys("Sathya");
		WebElement txtlname = pbh.getTxtlname();
		txtlname.sendKeys("V");
		WebElement txtaddress = pbh.getTxtaddress();
		txtaddress.sendKeys("Vellore");
		WebElement txtccno = pbh.getTxtccno();
		txtccno.sendKeys("7894561230321654");
		WebElement getdDncardtype = pbh.getdDncardtype();
		getdDncardtype.sendKeys("VISA");
		WebElement getdDnmonth = pbh.getdDnmonth();
		getdDnmonth.sendKeys("August");
		WebElement getdDnyear = pbh.getdDnyear();
		getdDnyear.sendKeys("2022");
		WebElement txtcvv = pbh.getTxtcvv();
		txtcvv.sendKeys("030");
		WebElement btnbook = pbh.getBtnbook();
		btnbook.click();
		Pombookingconfirm pbc = new Pombookingconfirm();
		WebElement btnlogout = pbc.getBtnlogout();
		btnlogout.click();
	}
}
