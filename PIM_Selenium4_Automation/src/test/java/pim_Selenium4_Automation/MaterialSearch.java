package pim_Selenium4_Automation;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import pages.HomePage;
import pages.Login_Page;
//import pages.SearchPage;
import pages.SearchPage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common_functions.Utils;

public class MaterialSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.manage().window().maximize();
		Utils utils = new Utils(driver);

		driver.get("https://timkenfs.riversand.com/home");

		Login_Page loginPage = new Login_Page(driver);
		HomePage homePage = new HomePage(driver);
		SearchPage2 searchPage = new SearchPage2(driver);

		loginPage.enterEmail("raoad@timken.com");
		loginPage.clickSubmit();
//		Thread.sleep(10000);

		utils.waitForElement(homePage.HomePage_SearchButton(), "clickable");

		homePage.clickSearchButton2();
//		Thread.sleep(15000);

//		WebElement gridRows = driver.findElement(By.cssSelector("#app")).getShadowRoot()
//				.findElement(By.cssSelector("#contentViewManager")).getShadowRoot()
//				.findElement(By.cssSelector("[id^='currentApp_search-thing_']")).getShadowRoot()
//				.findElement(By.cssSelector("[id^='app-entity-discovery-component-']")).getShadowRoot()
//				.findElement(By.cssSelector("#entitySearchDiscoveryGrid")).getShadowRoot()
//				.findElement(By.cssSelector("#entitySearchGrid")).getShadowRoot()
//				.findElement(By.cssSelector("#entityGrid")).getShadowRoot()
//				.findElement(By.cssSelector("#pebbleGridContainer > pebble-grid")).getShadowRoot()
//				.findElement(By.cssSelector("#grid")).getShadowRoot().findElement(By.cssSelector(
//						"#lit-grid> div > div.ag-root-wrapper-body.ag-layout-normal.ag-focus-managed >div.ag-root.ag-unselectable.ag-layout-normal> div.ag-body-viewport.ag-layout-normal.ag-row-no-animation> div.ag-center-cols-clipper > div.ag-center-cols-viewport > div.ag-center-cols-container"));
//		
		
		utils.waitForElement(searchPage.getGridRoot(), "clickable");
		
		List<WebElement> rows = searchPage.getGridRoot().findElements(By.cssSelector("[role='row']"));
		System.out.println("Total row count is " + rows.size());
		
		for (int i = 1; i < rows.size(); i++) {
			WebElement RowByRow = rows.get(i);
			String SellableMaterialDescription = RowByRow.findElement(By.cssSelector("div[col-id='sellablematerialdescription']")).getText();
			String matid = RowByRow.findElement(By.cssSelector("div[col-id='sellablematerialid']")).getText();
			String marketpartnumber = RowByRow.findElement(By.cssSelector("div[col-id='marketpartnumber']")).getText();
			String pimattributetaxonomy = RowByRow.findElement(By.cssSelector("div[col-id='pimattributetaxonomy']")).getText();
			String applicationtypedescription = RowByRow.findElement(By.cssSelector("div[col-id='applicationtypedescription']")).getText();
			System.out.println(i + 
					" :- SellableMaterialDescription is " + SellableMaterialDescription +
					" - mat id is " + matid +
					" - marketpartnumber is " + marketpartnumber +
					" - pimattributetaxonomy is " + pimattributetaxonomy + 
					" - applicationtypedescription is " + applicationtypedescription);
		}
		


//		searchPage.enterMaterialId("000000000100060");
//		Thread.sleep(15000);
//
//		

		/*
		 ========= Filter button on Search thing * domain screen ===== ============= ==========================
		 */

//		utils.waitForElement(searchPage.getSearchField(), "clickable");
//
//		searchPage.getFilterButton().click();
////		utils.waitForElement(searchPage.Search_button_After_Filter(), "clickable");
////		searchPage.Search_button_After_Filter().sendKeys("PIM");
//
////		Thread.sleep(5000);
////		
//		WebElement afterfilter = driver.findElement(By.cssSelector("#app")).getShadowRoot()
//				.findElement(By.cssSelector("#contentViewManager")).getShadowRoot()
//				.findElement(By.cssSelector("[id^='currentApp_search-thing_']")).getShadowRoot()
//				.findElement(By.cssSelector("[id^='app-entity-discovery-component-']")).getShadowRoot()
//				.findElement(By.cssSelector("#entitySearchDiscoveryGrid")).getShadowRoot()
//				.findElement(By.cssSelector("#entitySearchFilter")).getShadowRoot()
//				.findElement(By.cssSelector("#search-filter")).getShadowRoot()
//				.findElement(By.cssSelector("#refineMoreSearchbox")).getShadowRoot()
//				.findElement(By.cssSelector("#input"));
//		
//		utils.waitForElement(afterfilter, "clickable");
////
////		afterfilter.sendKeys("PIM");
////
////		utils.waitForElement(searchPage.getGridRoot(), "visible");
////
////		List<WebElement> filterallresults = searchPage.Filter_Results().findElements(By.cssSelector("div > div > div"));
////
////		System.out.println("Elements visible" + filterallresults.size());
////
//////        System.out.println("There are " + filterallresults.size() + " elements when searched with PIM");
//////        Thread.sleep(4000);

		driver.quit();
	}

}

//WebElement gridContainer = driver.findElement(By.cssSelector("#app")).getShadowRoot()
//.findElement(By.cssSelector("#contentViewManager")).getShadowRoot()
//.findElement(By.cssSelector("[id^='currentApp_search-thing_']")).getShadowRoot()
//.findElement(By.cssSelector("[id^='app-entity-discovery-component-']")).getShadowRoot()
//.findElement(By.cssSelector("#entitySearchDiscoveryGrid")).getShadowRoot()
//.findElement(By.cssSelector("#entitySearchGrid")).getShadowRoot()
//.findElement(By.cssSelector("#entityGrid")).getShadowRoot()
//.findElement(By.cssSelector("#pebbleGridContainer > pebble-grid")).getShadowRoot()
//.findElement(By.cssSelector("#grid")).getShadowRoot().findElement(By.cssSelector(
//		"#lit-grid> div > div.ag-root-wrapper-body.ag-layout-normal.ag-focus-managed> div.ag-root.ag-unselectable.ag-layout-normal> div.ag-body-viewport.ag-layout-normal.ag-row-no-animation> div.ag-center-cols-clipper > div.ag-center-cols-viewport > div.ag-center-cols-container> div[role] > div[col-id='sellablematerialid']"));


//int rowcount = searchPage.getRowCount();
//System.out.println("There are " + rowcount + " for the rows searched");
//Thread.sleep(2000);

//List<WebElement> grid = driver.findElement(By.cssSelector("#app")).getShadowRoot()
//		.findElement(By.cssSelector("#contentViewManager")).getShadowRoot()
//		.findElement(By.cssSelector("[id^='currentApp_search-thing_']")).getShadowRoot()
//		.findElement(By.cssSelector("[id^='app-entity-discovery-component-']")).getShadowRoot()
//		.findElement(By.cssSelector("#entitySearchDiscoveryGrid")).getShadowRoot()
//		.findElement(By.cssSelector("#entitySearchGrid")).getShadowRoot()
//		.findElement(By.cssSelector("#entityGrid")).getShadowRoot()
//		.findElement(By.cssSelector("#pebbleGridContainer > pebble-grid")).getShadowRoot()
//		.findElement(By.cssSelector("#grid")).getShadowRoot().
//		findElements(By.cssSelector(
//				"#lit-grid > div > div.ag-root-wrapper-body.ag-layout-normal.ag-focus-managed > div.ag-root.ag-unselectable.ag-layout-normal > div.ag-body-viewport.ag-layout-normal.ag-row-no-animation > div.ag-center-cols-clipper > div > div"));
////
//System.out.println("There are " + grid.size() + " rows for the material search");
////
//for (int i = 0; i < grid.size(); i++) {
//	WebElement row = grid.get(i);
////	 WebElement materialIdCell =  row.findElement(By.cssSelector(".col-id=\"sellablematerialid\"]"));
//	 WebElement materialIdCell =  row.findElement(By.cssSelector(".ag-row .ag-cell.div:nth-child('+ i +')"));
//	 System.out.println("Material ID for row " + (i + 1) + ": " + materialIdCell.getText().trim());
//}