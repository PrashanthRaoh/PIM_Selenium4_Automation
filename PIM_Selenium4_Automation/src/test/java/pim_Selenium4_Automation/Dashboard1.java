package pim_Selenium4_Automation;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import pages.HomePage;
import pages.Login_Page;
//import pages.SearchPage;
import pages.SearchPage2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common_functions.BaseTest;
import common_functions.Utils;

public class Dashboard_Click extends BaseTest {

	/***********************************************
	 * ------- Login --------- * This section handles user login functionality.
	 * 
	 * @throws IOException
	 * @throws InterruptedException *
	 ***********************************************/

	@Test
	public void Click_Dashboard() throws IOException, InterruptedException {
		System.out.println(this.getClass().getSimpleName());
		Login_Page loginPage = new Login_Page(driver);
		loginPage.LogintoPIM();
		HomePage homePage = new HomePage(driver);
		SearchPage2 searchPage = new SearchPage2(driver);
		/************************************************
		 * -------Enter Material ID- --------- *
		 ************************************************/
		utils.waitForElement(homePage.HomePage_SearchButton(), "clickable");
		utils.Takescreenshot();
		homePage.clickSearch_Products_Button();
		searchPage.enterMaterialId("000000000100126481");
		utils.Takescreenshot();
		/************************************************
		 * ------- Get Row count --------- *
		 ************************************************/
		utils.waitForElement(searchPage.getgrid(), "clickable");
		List<WebElement> rows = searchPage.getgrid().findElements(By.cssSelector("[role='row']"));
		utils.Takescreenshot();
		System.out.println("Total row count is " + rows.size());
		Actions actions = new Actions(driver);

		/************************************************
		 * ------- Material Details tab to click on drop down --------- *
		 ************************************************/

		WebElement RowByRow = rows.get(0);
		WebElement matid = RowByRow.findElement(By.cssSelector("div[col-id='sellablematerialid']"));

		actions.moveToElement(RowByRow).build().perform();
		Thread.sleep(2000);
		matid.click();

		WebElement Matdetailstab = driver.findElement(By.cssSelector("#app")).getShadowRoot()
				.findElement(By.cssSelector("#contentViewManager")).getShadowRoot()
				.findElement(By.cssSelector("[id^='currentApp_entity-manage_']")).getShadowRoot()
				.findElement(By.cssSelector("[id^='app-entity-manage-component-']")).getShadowRoot()
				.findElement(By.cssSelector("#rockDetailTabs")).getShadowRoot()
				.findElement(By.cssSelector("#rockTabs")).getShadowRoot()
				.findElement(By.cssSelector("#rockTabs")).getShadowRoot()
				.findElement(By.cssSelector("#tabsContainer"));

		utils.waitForElement(Matdetailstab, "clickable");
		utils.Takescreenshot();
	}
}

/*
 * ======== End ==============
 */
