package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginTest extends BaseTest {

    
    @Test
    public void verifyLogin() {
    	
    	DriverFactory.getDriver().findElement(By.xpath("//a[text()=' Signup / Login']")).click();
    	
    	System.out.println(
    	        "Test2 -> " + Thread.currentThread().getName());

        LoginPage loginPage = new LoginPage();

        loginPage.login(
                "testuser@test.com",
                "password123"
        );
    }
}