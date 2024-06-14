package automationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PIMpage extends Loginpage {
	@Test(priority = 4)
	public static void Addemployee() throws InterruptedException {
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
		driver.findElement(By.name("firstName")).sendKeys("Ishika");
		driver.findElement(By.name("middleName")).sendKeys("Kumari");
		driver.findElement(By.name("lastName")).sendKeys("Maharjan");
        WebElement employeeIdInput = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
        employeeIdInput.clear();
        String newEmployeeId = "12345";
        employeeIdInput.sendKeys(newEmployeeId);
        
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
//        WebElement licenseExpiryDateField = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]"));
//        licenseExpiryDateField.click();
//        licenseExpiryDateField.clear();
//        licenseExpiryDateField.sendKeys("2024-06-21");
//        
	}
	
	@Test(priority = 5)
	public static void Searchemployee() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Employee List')]")).click();
		//Search By Name
		driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("Ishika Maharjan");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(3000);
	}
	
	@Test(priority = 6)
	public static void Deleteemployee() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Employee List')]")).click();
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-trash'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[3]/div[1]/div[1]/div[1]/div[3]/button[2]")).click();

	}
}


