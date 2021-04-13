package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class LibGlobal {
	public static WebDriver d;
	public static Select s1;
	
	public WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\V.Sathya\\eclipse-workspace\\Maventest\\Driver\\chromedriver.exe");
		d = new ChromeDriver();
		return d;
	}
	public void loadurl(String url) {
		d.get(url);
		
	}
	public void pageTitle() {
		System.out.println(d.getTitle());
	}
	public void maximize() {
		d.manage().window().maximize();
	}
	public static WebElement LocatorById(String idval) {
		WebElement id = d.findElement(By.id(idval));
		return id;
	}
	public WebElement LocatorByClass(String className) {
		WebElement clsname = d.findElement(By.className(className));
		return clsname;
	}
	public WebElement LocatorByName(String name) {
		WebElement nme = d.findElement(By.name(name));
		return nme;
	}
	public WebElement tagname(String tagName) {
		WebElement tname = d.findElement(By.tagName(tagName));
		return tname;
	}
	public WebElement LocatorByXpath(String xpathval) {
		WebElement xpath = d.findElement(By.xpath(xpathval));
		return xpath;
	}
	
	public void sendkeys(WebElement e,String s) {
		e.sendKeys(s);
	}
	public void btnclick(WebElement e) {
		e.click();
	}
	public String gettext(WebElement e){
		String t= e.getText();
		System.out.println(t);
		return t;
	}
	public String getattributes(WebElement e) {
		String attribute = e.getAttribute("value");
		System.out.println(attribute);
		return attribute;
	}
	public static void toSelect(WebElement e) {
		s1 = new Select(e);
	}
	
	public List<WebElement> allOptionInDropDown(WebElement e) {
		List<WebElement> options = s1.getOptions();
		return options;
	}
	public void scrolldown(WebElement e) {
		JavascriptExecutor j = (JavascriptExecutor)d;
		j.executeScript("arguments[0].scrollIntoView(true)",e);
	}
	public String Exceldata(String Path,String sheetname,int rowno,int cellno) throws IOException {
		File hotel = new File(Path);
		FileInputStream st = new FileInputStream(hotel);
		Workbook w = new XSSFWorkbook(st);
		Sheet s = w.getSheet(sheetname);
		Row r = s.getRow(rowno);
		Cell c = r.getCell(cellno);
		int Type = c.getCellType();
		String val ="";
		if(Type==1)
		{
			 val = c.getStringCellValue();
		}
		else if(DateUtil.isCellDateFormatted(c)) 
		{
			val = new SimpleDateFormat("dd/MM/yyyy").format(c.getDateCellValue());
		}
		else
		{
			val = String.valueOf((long)c.getNumericCellValue());
					
		}
		return val;
	}
	public void excelvalueInsert(String pathname,String sheetname,int rowval,int cellval,WebElement e) throws IOException {
		File f = new File(pathname);
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet(sheetname);
		Row r = s.getRow(rowval);
		Cell c = r.createCell(cellval);
		String orderno = getattributes(e);
		c.setCellValue(orderno);
		FileOutputStream os = new FileOutputStream(f);
		w.write(os);
		System.out.println("Value Inserted Successfully............");
	}
	
	public static void Screenshot(String data) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)d;
		File loc = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\V.Sathya\\eclipse-workspace\\Maventest\\BlazeScreenshot\\"+data+".png");
		FileUtils.copyFile(loc, dest);
	}
	
	
}
