package pages;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page {
	
	private WebDriver driver;
    private WebDriverWait wait;
    
    private By emailField = By.cssSelector("[type='email']");
    private By submitButton = By.cssSelector("[type='submit']");
    
    public Login_Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    public void enterEmail(String email) {
        WebElement emailElement = wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailElement.sendKeys(email);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
        
    }

}
