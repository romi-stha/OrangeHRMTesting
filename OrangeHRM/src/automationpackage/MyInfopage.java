package automationpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class MyInfopage extends Leavepage {
	@Test(priority = 12)
	public static void viewDetails() throws InterruptedException {
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]")).click();
		Thread.sleep(4000);
	}
	
	@Test(priority = 13)
	public static void updatePersonalDetails() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("956");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("20567");
		driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]")).click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
        Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        js.executeScript("window.scrollBy(0,-350)");

	}
}
