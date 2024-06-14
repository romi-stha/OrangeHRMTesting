package automationpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Leavepage extends PIMpage{
	@Test(priority = 7)
	public static void applyLeave() throws InterruptedException {
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("2024-06-06");
		Thread.sleep(6000);
		//driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("2024-06-06");
		driver.findElement(By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")).sendKeys("fever");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority = 8)
	public static void viewMyLeave() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}
	
	@Test(priority = 9)
	public static void cancelLeave() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        Thread.sleep(4000);           
	}
	
	@Test(priority = 10)
	public static void leaveList() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Leave List')]")).click();
		Thread.sleep(3000);
		
		//Search by leave status
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
	}

	@Test(priority = 11)
	public static void assignLeave() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Assign Leave')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Ishika Kumari Maharjan");
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("2024-01-01");
		driver.findElement(By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")).sendKeys("sick");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);	
	}
	
}
