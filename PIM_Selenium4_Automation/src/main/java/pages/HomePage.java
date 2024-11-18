package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;
	private WebDriverWait wait;

	private By RootElement = By.cssSelector("#app");

	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	}

	public WebElement waitForElementToBeClickable(WebElement elementtobewaited) {
		return wait.until(ExpectedConditions.elementToBeClickable(elementtobewaited));
	}

	public WebElement HomePage_SearchButton() {
		WebElement searchBtn = driver.findElement(RootElement).getShadowRoot().
				findElement(By.cssSelector("[id^='rs']")).getShadowRoot().
				findElement(By.cssSelector("#navMenu")).getShadowRoot().
				findElement(By.cssSelector("#pageMenuIcon_1"));
		return searchBtn;
	}


	public void clickSearchButton2() throws InterruptedException {
		WebElement searchBtn = driver.findElement(RootElement).getShadowRoot().
				findElement(By.cssSelector("[id^='rs']")).getShadowRoot().
				findElement(By.cssSelector("#navMenu")).getShadowRoot().
				findElement(By.cssSelector("#pageMenuIcon_2 > a.menu-icon.page-title-icon"));

		waitForElementToBeClickable(searchBtn);
		Thread.sleep(3000);
		searchBtn.click();
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