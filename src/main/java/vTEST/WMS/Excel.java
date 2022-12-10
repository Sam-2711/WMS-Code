package vTEST.WMS;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws Exception {
		
		File f =new File(System.getProperty("user.dir")+"\\TestData.xlsx"); 
		FileInputStream fis=new FileInputStream(f); 
		XSSFWorkbook wb=new XSSFWorkbook(fis); 
		
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		String data = sh.getRow(10).getCell(0).getStringCellValue();
        System.out.println(data);	
        Add();
        }
	
	public static int Add() {
		
		int a,b,c;
		a=3;b=3;
		c=a+b;
		return c;
		//System.out.println(c);
	}
	
}
