package vTEST.WMS;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LocationPage {

			public void WMSLogin(WebDriver driver) throws Exception {
			driver.get("https://sys1.dev/avuat/");
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@type='text' and @id='username' and @name='username']")).sendKeys("warehouseuser1");
			driver.findElement(By.id("password")).sendKeys("100Elephants");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(7000);
	}

			public void addLocation(WebDriver driver) throws Exception {
				Thread.sleep(7000);
				driver.findElement(By.xpath("//*[@class='dropdown-toggle ng-scope' and @data-nav-menu-state='warehouse']")).click();
				driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[10]/a")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@type='text' and @placeholder='Search...']")).sendKeys("1111111");
				driver.findElement(By.xpath("//*[@type='button' and @title='View Detail']")).click();
				driver.findElement(By.xpath("/html/body/section/div/div[2]/div[3]/div[1]/div/div/div/div[1]/div/div/div[2]/div/button")).click();
				driver.findElement(By.xpath("//*[@type='text' and @class='form-control ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys("samAuto1234");
				WebElement LOC=driver.findElement(By.xpath("/html/body/section/div/div[2]/div[3]/div[1]/div/div/div/div[2]/div/ui-wizard-form/div/div[2]/div/div[3]/div/div/select"));
                Select Loc =new Select(LOC);
                Loc.selectByVisibleText("General Stock Location");
                driver.findElement(By.xpath("/html/body/section/div/div[2]/div[3]/div[1]/div/div/div/div[2]/div/ui-wizard-form/div/div[2]/div/div[5]/div/div/div/div[1]/span/i")).click();
                Robot robot=new Robot();
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                driver.findElement(By.xpath("//*[@id='btnFinish' and @type='button'] ")).click();
                driver.findElement(By.xpath("//*[@type='text' and @placeholder='Search...']")).sendKeys("samAuto1234");
                Thread.sleep(4000);

               
                
			}
}