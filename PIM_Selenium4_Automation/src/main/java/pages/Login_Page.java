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
    
    private By emailField = By.cssSelector("[type='email']");
    private By submitButton = By.cssSelector("[type='submit']");
    
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
	
	public void LaunchSite() {
		driver.get("https://timkenfs.riversand.com/home");
	}
	
    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }
	
	public void LogintoPIM() throws IOException {
		LaunchSite();
		enterEmail("raoad@timken.com");
		clickSubmit();
		utils.waitForElement(homePage.HomePage_SearchButton(), "clickable");
		utils.Takescreenshot();
	}
	
	
}
