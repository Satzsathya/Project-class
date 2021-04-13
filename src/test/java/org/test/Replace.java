package org.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Replace {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\V.Sathya\\eclipse-workspace\\Maventest\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		
		WebElement dDncountry = d.findElement(By.id("countries"));
		Select s = new Select(dDncountry);
		List<WebElement> allopt = s.getOptions();
		File f = new File("C:\\Users\\V.Sathya\\eclipse-workspace\\Maventest\\Excelfile\\Country.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet sh = w.createSheet("country data");
		Row r = sh.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("COUNTRY NAME");
		for (int i = 1; i < allopt.size(); i++) 
		{
			WebElement we = allopt.get(i);
			String textvalue = we.getText();
			Row r1 = sh.createRow(i);
			Cell c1 = r1.createCell(0);
			c1.setCellValue(textvalue);
		}
		FileOutputStream st = new FileOutputStream(f);
		w.write(st);
		System.out.println("Successfully Inserted");
}
}