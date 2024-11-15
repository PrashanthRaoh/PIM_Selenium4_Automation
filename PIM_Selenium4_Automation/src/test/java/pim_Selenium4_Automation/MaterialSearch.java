package pim_Selenium4_Automation;
import java.util.List;
import java.util.concurrent.TimeUnit;
import pages.HomePage;
import pages.Login_Page;
import pages.SearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaterialSearch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		
        driver.get("https://timkenfs.riversand.com/home");
        
        Login_Page loginPage = new Login_Page(driver);
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);
        
        loginPage.enterEmail("raoad@timken.com");
        loginPage.clickSubmit();
        Thread.sleep(5000);
        homePage.clickSearchButton2();
        Thread.sleep(5000);
        
        searchPage.enterMaterialId("000000000100060");
        Thread.sleep(5000);
        
        int rowcount = searchPage.getRowCount() ;
//        System.out.println("There are " + rowcount + " for the rows searched");
        Thread.sleep(5000);
        
        
        List<WebElement> grid = driver.findElement(By.cssSelector("#app")).getShadowRoot()
        		  .findElement(By.cssSelector("#contentViewManager")).getShadowRoot()
        		  .findElement(By.cssSelector("[id^='currentApp_search-thing_']")).getShadowRoot()
        		  .findElement(By.cssSelector("[id^='app-entity-discovery-component-']")).getShadowRoot()
        		  .findElement(By.cssSelector("#entitySearchDiscoveryGrid")).getShadowRoot()
        		  .findElement(By.cssSelector("#entitySearchGrid")).getShadowRoot()
        		  .findElement(By.cssSelector("#entityGrid")).getShadowRoot()
        		  .findElement(By.cssSelector("#pebbleGridContainer > pebble-grid")).getShadowRoot()
        		  .findElement(By.cssSelector("#grid")).getShadowRoot()
        		  .findElements(By.cssSelector("#lit-grid > div > div.ag-root-wrapper-body.ag-layout-normal.ag-focus-managed > div.ag-root.ag-unselectable.ag-layout-normal > div.ag-body-viewport.ag-layout-normal.ag-row-no-animation > div.ag-center-cols-clipper > div > div > div > div "));
        
        System.out.println("There are "+ grid.size()+ " rows for the material search");
        
//        for (int i = 0; i < grid.size(); i++) {
//        	WebElement row = grid.get(i);
//        	 WebElement materialIdCell =  row.findElement(By.cssSelector(".col-id=\"sellablematerialid\"]"));
//        	 System.out.println("Material ID for row " + (i + 1) + ": " + materialIdCell.getText().trim());
//		}
        
		/*=======================================
		 *======Filter button on Search thing domain screen=====
		============= ==========================*/        
        
        searchPage.clickFilterbuttonOn_Search_Domain_Page();
        Thread.sleep(5000);
        
        
        
        
        
        driver.quit();
	}

}
