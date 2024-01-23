package amas.Manage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class eerer {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amas-manage.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("automationTestAdmin");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("automationTestAdmin@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8978987867");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abcd@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='deviceId']")).sendKeys("89148000001919240013");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='mt-4 submitButton']")).click();
		Thread.sleep(2000);
		
	}

}
