package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import common_functions.Utils;

public class HomePage {

	private WebDriver driver;
	private WebDriverWait wait;
	Utils utils = new Utils(driver);
	private By RootElement = By.cssSelector("#app");
	private WebElement tablist_Homescreen;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	}

	public WebElement waitForElementToBeClickable(WebElement elementtobewaited) {
		return wait.until(ExpectedConditions.elementToBeClickable(elementtobewaited));
	}

	public WebElement HomePage_SearchButton() {
		WebElement searchBtn = driver.findElement(RootElement).getShadowRoot().findElement(By.cssSelector("[id^='rs']"))
				.getShadowRoot().findElement(By.cssSelector("#navMenu")).getShadowRoot()
				.findElement(By.cssSelector("#pageMenuIcon_1"));
		return searchBtn;
	}

	public void clickSearchButton2() throws InterruptedException {
		WebElement searchBtn = driver.findElement(RootElement).getShadowRoot().findElement(By.cssSelector("[id^='rs']"))
				.getShadowRoot().findElement(By.cssSelector("#navMenu")).getShadowRoot()
				.findElement(By.cssSelector("#pageMenuIcon_2 > a.menu-icon.page-title-icon"));

		waitForElementToBeClickable(searchBtn);
		Thread.sleep(3000);
		searchBtn.click();
	}

	public void Select_Tab_By_Name(String tabName) throws InterruptedException {
		tablist_Homescreen = driver.findElement(By.cssSelector("#app")).getShadowRoot()
				.findElement(By.cssSelector("#contentViewManager")).getShadowRoot()
				.findElement(By.cssSelector("[id^='currentApp_home_']")).getShadowRoot()
				.findElement(By.cssSelector("[id^='app-dashboard-component-']")).getShadowRoot()
				.findElement(By.cssSelector("rock-layout > rock-dashboard-widgets")).getShadowRoot()
				.findElement(By.cssSelector("[id^='rs']")).getShadowRoot()
				.findElement(By.cssSelector("#rock-saved-searches")).getShadowRoot()
				.findElement(By.cssSelector("[id^='rock-saved-searches-component-']")).getShadowRoot()
				.findElement(By.cssSelector("#rock-saved-searches-tabs"));

		utils.waitForElement(tablist_Homescreen, "clickable");

		WebElement TabtobeSelected = tablist_Homescreen.getShadowRoot().findElement(By.cssSelector("#tab-" + tabName));
		TabtobeSelected.click();
		Thread.sleep(3000);
	}

	public WebElement EntityDataImports_DropDown_Object() throws InterruptedException {
		WebElement EntityDataImports_Dropdown = driver.findElement(By.cssSelector("#app")).getShadowRoot()
				.findElement(By.cssSelector("#contentViewManager")).getShadowRoot()
				.findElement(By.cssSelector("[id^='currentApp_home_']")).getShadowRoot()
				.findElement(By.cssSelector("[id^='app-dashboard-component-']")).getShadowRoot()
				.findElement(By.cssSelector("rock-layout > rock-dashboard-widgets")).getShadowRoot()
				.findElement(By.cssSelector("[id^='rs']")).getShadowRoot()
				.findElement(By.cssSelector("#rock-task-list")).getShadowRoot()
				.findElement(By.cssSelector("[id^='rock-task-list-component-']")).getShadowRoot()
				.findElement(By.cssSelector("div > div.base-grid-structure-child-1 > div > div.row-1.flex-container-row-1 > div.item.task-type > pebble-dropdown"));
		
				return EntityDataImports_Dropdown;
	}
	
//	public WebElement ClickOnEntityDataimports_Dropdown() throws InterruptedException {
//		WebElement EntityDataImports_Dropdown_TextBox = EntityDataImports_DropDown_Object().getShadowRoot()
//				.findElement(By.cssSelector("#dropdown")).getShadowRoot()
//				.findElement(By.cssSelector("#input")).getShadowRoot()
//				.findElement(By.cssSelector("#pebble__textbox"));
//		return EntityDataImports_Dropdown_TextBox;
//	}
//	
//	public List<WebElement> SelectMenuitem_From_EntityDataImports_Dropdown() throws InterruptedException {
//		List<WebElement> allmenuItems = EntityDataImports_DropDown_Object().findElements(By.cssSelector(".list"));
//		return allmenuItems;
//
//	}

	public WebElement EntityDataimports_Dropdown() {
		WebElement EntityDataImports_Dropdown_Root = driver.findElement(By.cssSelector("#app")).getShadowRoot()
				.findElement(By.cssSelector("#contentViewManager")).getShadowRoot()
				.findElement(By.cssSelector("[id^='currentApp_home_']")).getShadowRoot()
				.findElement(By.cssSelector("[id^='app-dashboard-component-']")).getShadowRoot()
				.findElement(By.cssSelector("rock-layout > rock-dashboard-widgets")).getShadowRoot()
				.findElement(By.cssSelector("[id^='rs']")).getShadowRoot()
				.findElement(By.cssSelector("#rock-task-list")).getShadowRoot()
				.findElement(By.cssSelector("[id^='rock-task-list-component-']")).getShadowRoot()
				.findElement(By.cssSelector(
						"div > div.base-grid-structure-child-1 > div > div.row-1.flex-container-row-1 > div.item.task-type > pebble-dropdown"));
		return EntityDataImports_Dropdown_Root;
	}
}

//public void clickSearchButton() {
//	WebElement searchBtn = driver.findElement(RootElement).getShadowRoot().
//			findElement(By.cssSelector("[id^='rs']")).getShadowRoot().
//			findElement(By.cssSelector("#navMenu")).getShadowRoot().
//			findElement(By.cssSelector("#pageMenuIcon_1"));
//
//	waitForElementToBeClickable(searchBtn);
//	searchBtn.click();
//}