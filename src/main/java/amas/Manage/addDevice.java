package amas.Manage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class addDevice {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amas-manage.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("allan@tracertechnologysystems.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Jseasvuess3$");
		driver.findElement(By.xpath("//input[@class='mt-4 submitButton']")).click();
		driver.findElement(By.xpath("(//*[text()='Device Inventory'])[1]")).click();
		driver.findElement(By.xpath("(//*[text()='Add Device'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='deviceId']")).sendKeys("89148000001919240012");
		WebElement menu = driver.findElement(By.xpath("//select[@class='registerFormSelectInput']"));
		Actions act = new Actions (driver);
		act.moveToElement(menu);
		driver.findElement(By.xpath("//option[@value='2']")).click();
		driver.findElement(By.xpath("//input[@name='subscriptionMonthly']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@name='subscriptionYearly']")).sendKeys("200");
		driver.findElement(By.xpath("//button[@class='primaryButtonFilled']")).click();
		driver.findElement(By.xpath("(//p[text()='Logout'])[1]")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("automationTestAdmin");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("automationTestAdmin@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8978987867");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abcd@1234");
		driver.findElement(By.xpath("//input[@name='deviceId']")).sendKeys("89148000001919240012");
		driver.findElement(By.xpath("//input[@class='mt-4 submitButton']")).click();
		driver.findElement(By.xpath("//p[text()='Total Devices']")).click();
		driver.findElement(By.xpath("//p[text()='89148000001919240012']")).click();
		driver.findElement(By.xpath("//p[text()='200']")).click();
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		driver.findElement(By.xpath("(//p[text()='User Management'])[1]")).click();
		driver.findElement(By.xpath("//p[text()='Users']")).click();
		driver.findElement(By.xpath("//button[text()='Add New User']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("automationTestUser");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("automationTestUser@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abcd@1234");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8978987862");
		WebElement role = driver.findElement(By.xpath("//select[@id='role']"));
		Actions roleact = new Actions(driver);
		roleact.moveToElement(role).perform();
		driver.findElement(By.xpath("//option[text()='User']")).click();
		WebElement assignDevice = driver.findElement(By.xpath("//input[@class='registerFormInput cursor-pointer']"));
	}

}
