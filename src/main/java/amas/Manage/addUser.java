package amas.Manage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class addUser {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amas-manage.com");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("allan@tracertechnologysystems.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Jseasvuess3$");
        driver.findElement(By.xpath("//input[@class='mt-4 submitButton']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[text()='User Management'])[1]")).click();
        driver.findElement(By.xpath("//*[text()='Users']")).click();
        driver.findElement(By.xpath("//*[text()='Add New User']")).click();

        // Generate random data for the new user
        String randomName = "Test Automation Admin " + new Random().nextInt(1000);
        String randomEmail = "testautomationadmin" + new Random().nextInt(1000) + "@gmail.com";
        String randomPassword = "Abcd@1234";
        String randomMobileNumber = generateRandomMobileNumber();

        // Fill out the user details in the form
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(randomName);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(randomEmail);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(randomPassword);
        driver.findElement(By.xpath("//input[@class='form-control ']")).sendKeys(randomMobileNumber);

        WebElement role = driver.findElement(By.xpath("//select[@class='registerFormSelectInput']"));
        Actions roleact = new Actions(driver);
        roleact.moveToElement(role).click();
        driver.findElement(By.xpath("//option[@value='3']")).click();
        driver.findElement(By.xpath("//input[@id='sendNotification']")).click();
        driver.findElement(By.xpath("//input[@id='sendEmail']")).click();
        driver.findElement(By.xpath("//input[@id='sendSMS']")).click();
        driver.findElement(By.xpath("//button[text()='Add User']")).click();
    }
    // Method to generate a random 11-digit mobile number
    private static String generateRandomMobileNumber() {
        Random random = new Random();
        StringBuilder mobileNumber = new StringBuilder("4"); 
        for (int i = 1; i < 11; i++) {
            mobileNumber.append(random.nextInt(10)); // Append random digits
        }
        return mobileNumber.toString();
        
    }
    
}
