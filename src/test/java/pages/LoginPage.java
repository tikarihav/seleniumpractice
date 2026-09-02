package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage() {
        this.driver = DriverFactory.getDriver();
    }

    // Locators (keep private = best practice)
    private By email = By.xpath("//input[@data-qa='login-email']");
    private By password = By.xpath("//input[@data-qa='login-password']");
    private By loginBtn = By.xpath("//button[@data-qa='login-button']");
    
    // Actions

    public void enterEmail(String userEmail) {
        //driver.findElement(email).sendKeys(userEmail);
    	WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));

        WebElement emailfield = wait.until(
            ExpectedConditions.visibilityOfElementLocated(email));

        emailfield.sendKeys(userEmail);
    }

    public void enterPassword(String userPassword) {
        //driver.findElement(password).sendKeys(userPassword);
    	
    	WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));

        WebElement passwordfield = wait.until(
            ExpectedConditions.visibilityOfElementLocated(password));

        passwordfield.sendKeys(userPassword);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    // Business method (VERY IMPORTANT for interviews)
    public void login(String userEmail, String userPassword) {
        enterEmail(userEmail);
        enterPassword(userPassword);
        clickLogin();
    }
}