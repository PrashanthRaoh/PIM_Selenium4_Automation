//package pim_Selenium4_Automation;
//
//import java.time.Duration;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class Search_Material {
//
//	public static void main(String[] args) throws InterruptedException {
//
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\GPT_Automation - ASR-US-Canada\\AutomationRoleBased\\Config\\Drivers\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://timkenfs.riversand.com/home");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//		WebElement email = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("[type=\"email\"]"))));
//		email.sendKeys("raoad@timken.com");
//		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
//		
//		
//		WebElement searchbutton = driver.findElement(By.cssSelector("#app")).getShadowRoot()
//				.findElement(By.cssSelector("[id^='rs']")).getShadowRoot().findElement(By.cssSelector("#navMenu"))
//				.getShadowRoot().findElement(By.cssSelector("#pageMenuIcon_1"));
//		
//		new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(searchbutton));
//		/*
//		 * =================================Search icon  click============== ================================
//		 */
//		searchbutton.click();
//		Thread.sleep(5000);
//		
//		WebElement entermatid = driver.findElement(By.cssSelector("#app")).getShadowRoot()
//		.findElement(By.cssSelector("#contentViewManager")).getShadowRoot()
//		.findElement(By.cssSelector(("[id^='currentApp_search-thing_']"))).getShadowRoot()
//		.findElement(By.cssSelector(("[id^='app-entity-discovery-component-']"))).getShadowRoot()
//		.findElement(By.cssSelector(("#entitySearchDiscoveryGrid"))).getShadowRoot()
//		.findElement(By.cssSelector(("#searchBar"))).getShadowRoot()
//		.findElement(By.cssSelector(("#input")));
//		
//		new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(entermatid));
//		entermatid.sendKeys("000000000100060");
//		entermatid.sendKeys(Keys.ENTER);
//		
//		Thread.sleep(5000);
//		
//		/*
//		 * Wait for the rows to appear
//		 *  
//		 */
//		 List<WebElement> rows = driver.findElement(By.cssSelector("#app")).getShadowRoot()
//				.findElement(By.cssSelector("#contentViewManager")).getShadowRoot()
//				.findElement(By.cssSelector(("[id^='currentApp_search-thing_']"))).getShadowRoot()
//				.findElement(By.cssSelector(("[id^='app-entity-discovery-component-']"))).getShadowRoot()
//				.findElement(By.cssSelector(("#entitySearchDiscoveryGrid"))).getShadowRoot()
//				.findElement(By.cssSelector(("#entitySearchGrid"))).getShadowRoot()
//				.findElement(By.cssSelector(("#entityGrid"))).getShadowRoot()
//				.findElement(By.cssSelector(("#pebbleGridContainer > pebble-grid"))).getShadowRoot()
//				.findElement(By.cssSelector(("#grid"))).getShadowRoot()
//				.findElements(By.cssSelector(("[id^='lit-grid > div > div.ag-root-wrapper-body.ag-layout-normal.ag-focus-managed > div.ag-root.ag-unselectable.ag-layout-normal > div.ag-body-viewport.ag-layout-normal.ag-row-no-animation > div.ag-center-cols-clipper>div > div']")));
//		
//		System.out.println("There are " + rows.size() + " for the search criteria");
//		
//		
//		
//	}
//
//}
