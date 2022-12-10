package vTEST.WMS;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RR_Page {
	
	public void WMSLogin(WebDriver driver) {
		driver.get("https://sys1.dev/avuat/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@type='text' and @id='username' and @name='username']")).sendKeys("warehouseuser1");
		driver.findElement(By.id("password")).sendKeys("100Elephants");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
}
	
public void navigate_to_RR(WebDriver driver) throws Exception {
	driver.findElement(By.xpath("//*[@class='dropdown-toggle ng-scope' and @data-nav-menu-state='warehouse']")).click();
		driver.findElement(By.xpath("//*[@class='dropdown-toggle ng-scope' and @role='button' and @data-nav-menu-state='warehouse']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Receiving & Returns')]")).click();
		Thread.sleep(5000);
		
	
		//driver.findElement(By.xpath("//*[contains(text(),'Import Data')]")).click();
	}
	
	






	public void Receive_New_Stock(WebDriver driver) throws Exception {
		//Navigate to Receive
		driver.findElement(By.xpath("//*[contains(text(),'Receive New Stock')]")).click();
		//Click on 'Receive New Stock'
		driver.findElement(By.xpath("//*[@class='btn btn-default form-control ui-select-toggle' and @aria-label='Select box activate']")).click();
		Robot NCC=new Robot();
		NCC.keyPress(KeyEvent.VK_ENTER);
		//
		NCC.keyRelease(KeyEvent.VK_ENTER);
		
		//Recept Number
		driver.findElement(By.xpath("//*[@type='text' and @ng-model='receivingHeader.ReceiptNo']")).sendKeys("Zzxtewre30");
		NCC.keyPress(KeyEvent.VK_TAB);
		NCC.keyRelease(KeyEvent.VK_TAB);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
		//Press Next
		driver.findElement(By.xpath("//*[@id='btnNext' and @type='button' ]")).click();
		driver.findElement(By.xpath("//*[@id='btnNext' and @type='button' ]")).click();
		//Enter item name
		driver.findElement(By.xpath("//*[@type='text' and @placeholder='Search items']")).sendKeys("NonTracked-01");
		Thread.sleep(5000);
		Robot EnterKey=new Robot();
		//EnterKey.keyPress(KeyEvent.VK_ENTER);
		//EnterKey.keyRelease(KeyEvent.VK_ENTER);
		
		//WebElement select_item=driver.findElement(By.xpath("//*[@type='text' and @placeholder='Search items']"));
		//Select sel_item= new Select(select_item);
		//sel_item.selectByVisibleText("NonTracked-01");
		//Click on Element
		//driver.findElement(By.xpath("//*[@id=\"ex2$index\"]/div/div/div[4]/div[1]/div")).click();
		EnterKey.keyPress(KeyEvent.VK_TAB);
		EnterKey.keyRelease(KeyEvent.VK_TAB);
		//Select Qty
		driver.findElement(By.xpath("//*[@id=\"kit-content-tree-root\"]/ol/li/div/div/div[2]/input")).click();
		EnterKey.keyPress(KeyEvent.VK_BACK_SPACE);
		EnterKey.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(2000);
		//Enter Quantity
		driver.findElement(By.xpath("//*[@id=\"kit-content-tree-root\"]/ol/li/div/div/div[2]/input")).sendKeys("10");
		//Select Location
		driver.findElement(By.xpath("//*[@type='text' and @placeholder='Choose Existing Location']")).sendKeys("NonTracked-01Loc");
		Thread.sleep(5000);
		EnterKey.keyPress(KeyEvent.VK_TAB);
		EnterKey.keyRelease(KeyEvent.VK_TAB);
		//Save as Partial Receive
		driver.findElement(By.xpath("//*[@id=\"btnFinishPartial\"]")).click();
	}
	

}
