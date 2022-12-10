package vTEST.WMS;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
	
	public static void main(String[] args) throws Exception {
		
		File f =new File(System.getProperty("user.dir")+"\\sama.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		String data = sh.getRow(1).getCell(0).getStringCellValue();
		//System.out.println(data);
		
		
}

}
