package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.DriverFactory;
//Git practice - first change
public class HomeTest extends BaseTest {

    @Test
    public void verifyHomePage() {
    	
    	System.out.println(
    	        "Test1 -> " + Thread.currentThread().getName());

        String title =
                DriverFactory.getDriver().getTitle();

        Assert.assertTrue(title.contains("Automation"));
    }
    
 // Feature branch - adding search test

}