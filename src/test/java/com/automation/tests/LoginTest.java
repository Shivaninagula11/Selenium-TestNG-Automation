package com.automation.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.automation.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String successMsg = driver.findElement(By.id("flash")).getText();
        Assert.assertTrue(successMsg.contains("You logged into a secure area!"));
    }
}
