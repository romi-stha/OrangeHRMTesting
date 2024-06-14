package automationpackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Loginpage extends Setup_Page {
	@Test(priority=1)
	public static void login_invaliddata() throws InterruptedException {
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys("@dmin");
		driver.findElement(By.name("password")).sendKeys("admin134");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public static void blankdata() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public static void login_validdata() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	}

}
