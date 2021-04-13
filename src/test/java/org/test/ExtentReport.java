package org.test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.base.LibGlobal;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport extends LibGlobal {

	LibGlobal g = new LibGlobal();
	ExtentReports reports;
	ExtentHtmlReporter htmlReporter;
	ExtentTest test;
	
	@BeforeClass
	private void beforeclass()
	{
		reports = new ExtentReports();
		htmlReporter= new ExtentHtmlReporter("Extentreport.html");
		reports.attachReporter(htmlReporter);
		getDriver();
		d.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		loadurl("https://blazedemo.com/");
		maximize();
	}
	
	@AfterClass
	private void AfterClass() {
		reports.flush();
	}

	@Parameters({"departure", "destination"})
	@Test
	private void tc0(String departure, String destination,Method m) throws IOException 
	{
		Pomblaze pb = new Pomblaze();
		reports = new ExtentReports();
		htmlReporter= new ExtentHtmlReporter("Extentreport.html");
		reports.attachReporter(htmlReporter);
		test = reports.createTest("Blaze Starting Page");
		test.log(Status.INFO,"Verifying Dropdown is enabled");
		WebElement dDndeparture = pb.getdDndeparture();
		WebElement dDndestination = pb.getdDndestination();
		WebElement btnfindflight = pb.getBtnfindflight();
		if(dDndeparture.isEnabled() && dDndeparture.isDisplayed() && dDndestination.isEnabled() && dDndestination.isDisplayed() && btnfindflight.isEnabled() && btnfindflight.isDisplayed())
		{
			test.log(Status.PASS, "Departure & Destination is selected");
			sendkeys(dDndeparture, departure);
			sendkeys(dDndestination, destination);
			Screenshot(m.getName());
			btnclick(btnfindflight);
		}
		else
		{
			test.log(Status.FAIL, "Departure & Destination is Unselected");
		}
	}
	
	@Test
	private void tc1(Method m) throws IOException{
		Pomreserve pr = new Pomreserve();
		test = reports.createTest("Blaze Reverse Page");
		test.log(Status.INFO,"Verifying Choose Button is enabled");
		WebElement btnchoose = pr.getBtnchoose();
		if(btnchoose.isEnabled() && btnchoose.isDisplayed())
		{
			test.log(Status.PASS, "Flight is Selected");
			Screenshot(m.getName());
			g.btnclick(btnchoose);
		}
		else
		{
			test.log(Status.FAIL, "Flight is UnSelected");
		}
	}
	
	@Parameters({"inputName","address","city","state","zipCode","cardType","creditCardNumber","creditCardMonth","creditCardYear","nameOnCard"})
	@Test
	private void tc2(String fname,String address,String city,String state,String zipcode,String cardtype,String cardno,String cardmonth,String cardyear,String cardname,Method m) throws IOException
	{
		Pompurchase pp = new Pompurchase();
		test = reports.createTest("Blaze Purchase Page");
		test.log(Status.INFO, "Entering values into Textbox");
		WebElement txtFirstName = pp.getTxtFirstName();
		WebElement txtAddress = pp.getTxtAddress();
		WebElement txtCity = pp.getTxtCity();
		WebElement txtState = pp.getTxtState();
		WebElement txtZipcode = pp.getTxtZipcode();
		WebElement selectCardType = pp.getSelectCardType();
		WebElement txtCardnumber = pp.getTxtCardnumber();
		WebElement txtExpiryMonth = pp.getTxtExpiryMonth();
		WebElement txtExpiryYear = pp.getTxtExpiryYear();
		WebElement txtCardname = pp.getTxtCardname();
		WebElement clickSubmit = pp.getClickSubmit();
		
		if(txtFirstName.isDisplayed() && txtFirstName.isEnabled() && txtAddress.isDisplayed() && txtAddress.isEnabled() && txtCity.isDisplayed() && txtCity.isEnabled() && txtState.isDisplayed() && txtState.isEnabled() && txtZipcode.isDisplayed() && txtZipcode.isEnabled() && selectCardType.isDisplayed() && selectCardType.isEnabled() && txtCardnumber.isDisplayed() && txtCardnumber.isEnabled() && txtExpiryMonth.isDisplayed() && txtExpiryMonth.isEnabled() && txtExpiryYear.isDisplayed() && txtExpiryYear.isEnabled() && txtCardname.isDisplayed() && txtCardname.isEnabled() && clickSubmit.isDisplayed() && clickSubmit.isEnabled())
		{
			test.log(Status.PASS, "Passenger Details Entered Successfully");
			sendkeys(txtFirstName, fname);
			sendkeys(txtAddress, address);
			sendkeys(txtCity, city);
			sendkeys(txtState, state);
			sendkeys(txtZipcode, zipcode);
			sendkeys(selectCardType, cardtype);
			sendkeys(txtCardnumber, cardno);
			sendkeys(txtExpiryMonth, cardmonth);
			sendkeys(txtExpiryYear, cardyear);
			sendkeys(txtCardname, cardname);
			Screenshot(m.getName());
			btnclick(clickSubmit);
		}
		else
		{
			test.log(Status.FAIL, "Passenger Details Failed to Entered");
		}
	}
	
	@Test
	private void tc3(Method m) throws IOException 
	{
		WebElement orderid = LocatorByXpath("//table[@class='table']//tr[1]//td[2]");
		Screenshot(m.getName());
		String text = orderid.getText();
		System.out.println("Order Id:"+text);
		File ss = orderid.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("OrderId.png"));
	}
}


