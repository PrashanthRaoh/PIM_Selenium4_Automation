//package pages;
//
//import java.time.Duration;
//import java.util.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class SearchPage {
//	private WebDriver driver;
//	private WebDriverWait wait;
//
//	private By searchInputField = By.cssSelector("#app");
//	private By rowsLocator = By.cssSelector("#app");
//
//	public SearchPage(WebDriver driver) {
//		this.driver = driver;
//		this.wait = new WebDriverWait(driver, Duration.ofSeconds(90));
//	}
//
//	public void enterMaterialId(String materialId) {
//		WebElement searchField = driver.findElement(searchInputField).getShadowRoot()
//				.findElement(By.cssSelector("#contentViewManager")).getShadowRoot()
//				.findElement(By.cssSelector("[id^='currentApp_search-thing_']")).getShadowRoot()
//				.findElement(By.cssSelector("[id^='app-entity-discovery-component-']")).getShadowRoot()
//				.findElement(By.cssSelector("#entitySearchDiscoveryGrid")).getShadowRoot()
//				.findElement(By.cssSelector("#searchBar")).getShadowRoot().findElement(By.cssSelector("#input"));
//
//		wait.until(ExpectedConditions.elementToBeClickable(searchField));
//		searchField.sendKeys(materialId);
//		searchField.sendKeys(Keys.ENTER);
//	}
//
//	public int getRowCount() {
//		List<WebElement> rows = driver.findElement(rowsLocator).getShadowRoot()
//				.findElement(By.cssSelector("#contentViewManager")).getShadowRoot()
//				.findElement(By.cssSelector("[id^='currentApp_search-thing_']")).getShadowRoot()
//				.findElement(By.cssSelector("[id^='app-entity-discovery-component-']")).getShadowRoot()
//				.findElement(By.cssSelector("#entitySearchDiscoveryGrid")).getShadowRoot()
//				.findElement(By.cssSelector("#entitySearchGrid")).getShadowRoot()
//				.findElement(By.cssSelector("#entityGrid")).getShadowRoot()
//				.findElement(By.cssSelector("#pebbleGridContainer > pebble-grid")).getShadowRoot()
//				.findElement(By.cssSelector("#grid")).getShadowRoot()
//				.findElements(By.cssSelector("div.ag-root-wrapper-body div.ag-center-cols-clipper > div > div > div"));
//		return rows.size();
//	}
//
//	public void clickFilterbuttonOn_Search_Domain_Page() {
//		WebElement Filterbutton = driver.findElement(searchInputField).getShadowRoot()
//				.findElement(By.cssSelector("#contentViewManager")).getShadowRoot()
//				.findElement(By.cssSelector("[id^='currentApp_search-thing_']")).getShadowRoot()
//				.findElement(By.cssSelector("[id^='app-entity-discovery-component-']")).getShadowRoot()
//				.findElement(By.cssSelector("#entitySearchDiscoveryGrid")).getShadowRoot()
//				.findElement(By.cssSelector("#entitySearchFilter")).getShadowRoot()
//				.findElement(By.cssSelector("#search-filter")).getShadowRoot().
//				findElement(By.cssSelector("#filterButton"))
//				.getShadowRoot().findElement(By.cssSelector("#buttonTextBox"));
//		
//		Filterbutton.click();
//	}
//}