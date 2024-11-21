package pim_Selenium4_Automation;

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

import common_functions.Utils;

public class MaterialSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.manage().window().maximize();
		Utils utils = new Utils(driver);

		driver.get("https://timkenfs.riversand.com/home");

		/***********************************************
		 *               ------- Login ---------       *
		 * This section handles user login functionality. *
		 ***********************************************/
		Login_Page loginPage = new Login_Page(driver);
		HomePage homePage = new HomePage(driver);
		SearchPage2 searchPage = new SearchPage2(driver);

		loginPage.enterEmail("raoad@timken.com");
		loginPage.clickSubmit();

		utils.waitForElement(homePage.HomePage_SearchButton(), "clickable");

		/************************************************
		 *    ------- Tab Click on Home Screen --------  *
		 * This section handles the action when a user  clicks on a tab in the home screen dashboard. *
		 ************************************************/
//		homePage.Select_Tab_By_Name("favourites");
//		Thread.sleep(5000);
//		homePage.Select_Tab_By_Name("my-searches");
//		Thread.sleep(5000);
//		homePage.Select_Tab_By_Name("shared-searches");
//		Thread.sleep(5000);

		/************************************************
		 *    -------Select dropdown menu items --------  *
		 * This section handles the action when a user  clicks on a tab in the home screen Drop down menu item. *
		 ************************************************/
//		homePage.EntityDataImports_DropDown_Object().click();
//		Thread.sleep(3000);
//				
//		List<WebElement> EntityDataImportsmenuItems = homePage.EntityDataImports_DropDown_Object().getShadowRoot().findElements(By.cssSelector(".list"));
//		for (int i = 0; i < EntityDataImportsmenuItems.size(); i++) {
//			WebElement eachmenuitem = EntityDataImportsmenuItems.get(i);
//			System.out.println(i + ":- " + eachmenuitem.getText());
//		}
//
//		String EntityDataImportsMenuItem = "Bulk Entity Delete";
//		 homePage.EntityDataImports_DropDown_Object().getShadowRoot().findElement(By.cssSelector("[title='" + EntityDataImportsMenuItem + "']")).click();
//		 Thread.sleep(3000);
		
//		 Status drop down selection
//		homePage.Status_DropDown_Object().click();
//		List<WebElement> StatusmenuItems = homePage.Status_DropDown_Object().getShadowRoot().findElements(By.cssSelector(".list"));
//		for (int i = 0; i < StatusmenuItems.size(); i++) {
//			WebElement eachmenuitem = StatusmenuItems.get(i);
//			System.out.println(i + ":- " + eachmenuitem.getText());
//		}
		
//		From_Last_DropDown selection
//		String lastdropdownvalue = "60 Days";
//		homePage.From_Last_DropDown_Object().click();
//		Thread.sleep(2000);
////		List<WebElement> FromLastmenuItems = homePage.From_Last_DropDown_Object().getShadowRoot().findElements(By.cssSelector(".list"));
////		
////		for (int i = 0; i < FromLastmenuItems.size(); i++) {
////			WebElement eachmenuitem = FromLastmenuItems.get(i);
////			System.out.println(i + ":- " + eachmenuitem.getText());
////		}
//		homePage.From_Last_DropDown_Object().getShadowRoot().findElement(By.cssSelector("[title='" + lastdropdownvalue + "']")).click();
		 
		/************************************************
		 *    ------- Search button click ---------  *
		 * This section handles the action when a user  selects drop down list. *
		 ************************************************/

//		utils.waitForElement(homePage.HomePage_SearchButton(), "clickable");
//		homePage.clickSearchButton2();
		/************************************************
		 *    -------Enter Material ID- ---------  *
		 ************************************************/
//		searchPage.enterMaterialId("000000000100060");
//		utils.waitForElement(searchPage.getgrid(), "clickable");

		/************************************************
		 *    ------- Get Row count ---------  *
		 ************************************************/
//		List<WebElement> rows = searchPage.getgrid().findElements(By.cssSelector("[role='row']"));
//		System.out.println("Total row count is " + rows.size());
//
//		Actions actions = new Actions(driver);
//
//		for (int i = 1; i < rows.size(); i++) {
//			WebElement RowByRow = rows.get(i);
//			String SellableMaterialDescription = RowByRow.findElement(By.cssSelector("div[col-id='sellablematerialdescription']")).getText();
//			String matid = RowByRow.findElement(By.cssSelector("div[col-id='sellablematerialid']")).getText();
//			Thread.sleep(1000);
//			actions.moveToElement(RowByRow).build().perform();
//			Thread.sleep(1000);
//			String marketpartnumber = RowByRow.findElement(By.cssSelector("div[col-id='marketpartnumber']")).getText();
//			String pimattributetaxonomy = RowByRow.findElement(By.cssSelector("div[col-id='pimattributetaxonomy']"))
//					.getText();
//			String applicationtypedescription = RowByRow.findElement(By.cssSelector("div[col-id='applicationtypedescription']")).getText();
//			System.out.println(i 
//					+ " :- SellableMaterialDescription is " + SellableMaterialDescription 
//					+ " - mat id is " + matid 
//					+ " - marketpartnumber is " + marketpartnumber 
//					+ " - pimattributetaxonomy is "+ pimattributetaxonomy 
//					+ " - applicationtypedescription is " + applicationtypedescription);
//		}

		/*
		 * ========= Filter button on Search thing * domain screen ===== =============
		 */
//		searchPage.getFilterButton().click();
//		utils.waitForElement(searchPage.Search_button_After_Filter(), "clickable");
//		searchPage.Search_button_After_Filter().sendKeys("PIM");
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

//		driver.quit();
	}
}

/*
 * ======== End ==============
 */

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

//WebElement gridRows = driver.findElement(By.cssSelector("#app")).getShadowRoot()
//.findElement(By.cssSelector("#contentViewManager")).getShadowRoot()
//.findElement(By.cssSelector("[id^='currentApp_search-thing_']")).getShadowRoot()
//.findElement(By.cssSelector("[id^='app-entity-discovery-component-']")).getShadowRoot()
//.findElement(By.cssSelector("#entitySearchDiscoveryGrid")).getShadowRoot()
//.findElement(By.cssSelector("#entitySearchGrid")).getShadowRoot()
//.findElement(By.cssSelector("#entityGrid")).getShadowRoot()
//.findElement(By.cssSelector("#pebbleGridContainer > pebble-grid")).getShadowRoot()
//.findElement(By.cssSelector("#grid")).getShadowRoot().findElement(By.cssSelector(
//		"#lit-grid> div > div.ag-root-wrapper-body.ag-layout-normal.ag-focus-managed >div.ag-root.ag-unselectable.ag-layout-normal> div.ag-body-viewport.ag-layout-normal.ag-row-no-animation> div.ag-center-cols-clipper > div.ag-center-cols-viewport > div.ag-center-cols-container"));