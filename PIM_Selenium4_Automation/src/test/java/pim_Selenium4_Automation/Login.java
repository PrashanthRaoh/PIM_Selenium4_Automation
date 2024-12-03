package pim_Selenium4_Automation;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import common_functions.BaseTest;
import pages.HomePage;
import pages.Login_Page;
import pages.SearchPage2;

public class Login extends BaseTest {

	@Test
	public void login() throws IOException, InterruptedException {
		Login_Page loginPage = new Login_Page(driver);
		loginPage.LogintoPIM();
		utils.Takescreenshot();
		HomePage homePage = new HomePage(driver);
//		SearchPage2 searchPage = new SearchPage2(driver);
		/************************************************
		 * -------Enter Material ID- --------- *
		 ************************************************/
		utils.waitForElement(homePage.HomePage_SearchButton(), "clickable");
		utils.Takescreenshot();


//		Actions actions = new Actions(driver);
//		actions.moveToElement(homePage.Configuration_Home_Screen_Button()).build().perform();
//
//		List<WebElement> rightmenuitems = driver.findElement(By.cssSelector("#app")).getShadowRoot()
//				.findElement(By.cssSelector("[id^='rs']")).getShadowRoot().findElement(By.cssSelector("#navMenu"))
//				.getShadowRoot().findElement(By.cssSelector("#pebbleActionDropdown")).getShadowRoot()
//				.findElement(By.cssSelector("#actionsPopover")).getShadowRoot()
//				.findElement(By.cssSelector(".with-action-title")).getShadowRoot()
//				.findElements(By.cssSelector(".popup-title"));
//
//		for (int i = 0; i < rightmenuitems.size(); i++) {
//			System.out.println(rightmenuitems.get(i).getText());
//		}
	}

}
