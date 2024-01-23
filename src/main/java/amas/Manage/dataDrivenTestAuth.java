package amas.Manage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataDrivenTestAuth {

    public void readExcel(String filePath, String fileName, String sheetName) throws InterruptedException, IOException {
        
            File file = new File(filePath + "\\" + fileName);
            FileInputStream fis = new FileInputStream(file);
            Workbook loginWorkbook = null;
            String fileExtension = fileName.substring(fileName.indexOf("."));
            if (fileExtension.equals(".xlsx")) {
                loginWorkbook = new XSSFWorkbook(fis);
            } else if (fileExtension.equals(".xls")) {
                loginWorkbook = new HSSFWorkbook(fis);
            }

            Sheet loginSheet = loginWorkbook.getSheet(sheetName);
            int rowCount = loginSheet.getLastRowNum() - loginSheet.getFirstRowNum();

            for (int i = 1; i < rowCount + 1; i++) {
                Row row = loginSheet.getRow(i);
                String username = row.getCell(0).getStringCellValue();
                String password = row.getCell(1).getStringCellValue();

                test(username,password);
        
    }
        }

    public void test(String username, String password) throws InterruptedException  {
    	ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amas-manage.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='mt-4 submitButton']")).click();    
		driver.findElement(By.xpath("(//p[text()='Logout'])[1]")).click();	
		driver.quit();
    }
	public static void main(String[] args) throws InterruptedException, IOException { 
		dataDrivenTestAuth readFile = new dataDrivenTestAuth();
		readFile.readExcel("/usr/local/", "keyvalue.xlsx", "Sheet1");

		
	}

}
