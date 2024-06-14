package automationpackage;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup_Page {
	public static WebDriver driver;
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static WebDriver Setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
		
	}
	
	@BeforeSuite
	public static void OpenBrowser() {
		driver = Setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	}

}

