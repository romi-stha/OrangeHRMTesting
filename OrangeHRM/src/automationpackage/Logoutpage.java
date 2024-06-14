package automationpackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Logoutpage extends MyInfopage{
	@Test(priority = 14)
	public static void logout() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		
	}
}
