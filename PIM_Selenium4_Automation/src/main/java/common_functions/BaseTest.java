package common_functions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	protected static WebDriver driver;
	protected static Utils utils;

	public void BaseTest() {
		this.driver = driver;
	}
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.manage().window().maximize();
		utils = new Utils(driver);
	}
	
//	@AfterTest
//	public void teardown() {
//		driver.quit();
//	}
}
