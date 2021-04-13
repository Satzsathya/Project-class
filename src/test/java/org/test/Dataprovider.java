package org.test;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dataprovider extends LibGlobal {
	@Test(dataProvider="testdata", dataProviderClass=Sample1.class)
	private void tc0(String username,String Password) {
		getDriver();
		loadurl("https://www.facebook.com/");
		WebElement txtuser = LocatorById("email");
		sendkeys(txtuser, username);
		WebElement txtpass = LocatorById("pass");
		sendkeys(txtpass, Password);
	}
	
	
}
