package vTEST.WMS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ItemPage{ 
	
	public void WMSLogin(WebDriver driver) throws Exception {
		
		driver.get("https://sys1.dev/avuat/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@type='text' and @id='username' and @name='username']")).sendKeys("warehouseuser1");
		driver.findElement(By.id("password")).sendKeys("100Elephants");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		
	}

	public void ItemsNavigation(WebDriver driver) throws Exception {
     Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class='dropdown-toggle ng-scope' and @data-nav-menu-state='warehouse']")).click();
		//driver.findElement(By.xpath("/html/body/section/div/div[1]/nav/div/ul/li[4]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Items')]")).click();
		
	//String All_Items=driver.findElement(By.xpath("//*[contains(text(),'All Items')]")).getText();
		//System.out.println(All_Items);
	//Assert.assertEquals("All Items", All_Items);
		Thread.sleep(5000);
		
	}
	
	public void NewItem(WebDriver driver,String ItemCode) throws Exception {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'openWizardModal\']")).click();// Add new item
		driver.findElement(By.xpath("//*[@id=\"steps-uid-0-p-0\"]/div/div[1]/div/div/label[1]")).click(); // Eqipment
		//driver.findElement(By.xpath("//*[@id=\"steps-uid-0-p-0\"]/div/div[1]/div/div/label[2]")).click();//conumable
		driver.findElement(By.xpath("//*[@id=\"steps-uid-0-p-0\"]/div/div[2]/div/div[2]/div[3]/label")).click();//batch
		//driver.findElement(By.xpath("//*[@id=\"steps-uid-0-p-0\"]/div/div[2]/div/div[4]/label[1]")).click();//batch
		driver.findElement(By.xpath("/html/body/section/div/div[2]/section/div[2]/div[1]/div/div/div/div[2]/div/ui-wizard-form/div/div[2]/div[1]/div/div[2]/div/div[4]/label[2]")).click();
		driver.findElement(By.xpath("/html/body/section/div/div[2]/section/div[2]/div[1]/div/div/div/div[2]/div/ui-wizard-form/div/div[2]/div[1]/div/div[2]/div/div[6]/label[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"btnNext\"]")).click();
        WebElement drpdwn=driver.findElement(By.xpath("//*[@name='itemCode']"));
		
		Select category=new Select(drpdwn);
		category.selectByVisibleText("Medical");
		//File f =new File(System.getProperty("user.dir")+"\\sama.xlsx");
		//FileInputStream fis=new FileInputStream(f);
		//XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//XSSFSheet sh=wb.getSheet("Sheet1");
		
		//String data = sh.getRow(3).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("/html/body/section/div/div[2]/section/div[2]/div[1]/div/div/div/div[2]/div/ui-wizard-form/div/div[2]/div[2]/div/form/div[2]/div/div/div[1]/input")).sendKeys(ItemCode);
		driver.findElement(By.xpath("//*[@id='btnNext' and @type='button']")).click();
		driver.findElement(By.xpath("//*[@id='btnNext' and @type='button']")).click();
		driver.findElement(By.xpath("//*[@id='btnNext' and @type='button']")).click();
		driver.findElement(By.xpath("//*[@id='btnNext' and @type='button']")).click();
		driver.findElement(By.xpath("//*[@id=\"btnFinish\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"btnFinish\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"btnFinish\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"btnFinish\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"btnFinish\"]")).click();
	}
	public void ItemSearch(WebDriver driver,String ItemCode) throws Exception {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/section/div[4]/div/div/div/div/div[1]/div/div[1]/div[2]/input")).sendKeys(ItemCode);
		Thread.sleep(4000);
	}
}
