package pages;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_functions.Utils;

public class Login_Page  {
	
	private WebDriver driver;
    private WebDriverWait wait;
    public Utils utils;
    public HomePage homePage;
    
    private By emailField = By.cssSelector("[id='username']");
    private By passwordfield = By.cssSelector("[id='password']");
    private By Submitbutton = By.xpath("(//button[@type=\"submit\"])[2]");
    
    public Login_Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        homePage = new HomePage(driver);
        utils = new Utils(driver);
    }

    public void enterEmail(String email) {
        WebElement emailElement = wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailElement.sendKeys(email);
    }
    public void enterPassword(String password) {
    	WebElement emailElement = wait.until(ExpectedConditions.elementToBeClickable(passwordfield));
    	emailElement.sendKeys(password);
    }
	
	public void LaunchSite() {
//		driver.get("https://timkenfs.riversand.com/home");
		driver.get("https://timkenfs.syndigo.com/?idp=timkenfs_auth0_go");
	}
	
    public void clickSubmit() {
        driver.findElement(Submitbutton).click();
    }
	
	public void LogintoPIM() throws IOException {
		LaunchSite();
//		enterEmail("raoad@timken.com");
		enterEmail("systemadmin.test1@timken.com");
		enterPassword("PivotreeTmkSys@24$");
		clickSubmit();
		utils.waitForElement(homePage.HomePage_SearchButton(), "clickable");
		utils.Takescreenshot();
	}
	
	
}
