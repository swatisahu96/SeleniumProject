package org.example;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class Demo1 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void setUp() {
       // System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        options.addArguments("--headless=new");

        options.addArguments("--single-process");
        options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");


        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //options.addExtensions(new File("C:\\Users\\hp\\Downloads\\extension_5_8_1_0.crx"));

        driver = new ChromeDriver(options);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //For Selenium > 4.x , no need to setProperty
        //For Selenium < 4.x need to set property
    }

    @Test(enabled = false, groups = {"Regression", "Stage"})
    @Description("#TC1 Verify that with Invalid username and valid password")
    @Severity(SeverityLevel.BLOCKER)
    public void InvalidLogin() throws InterruptedException {
        driver.get("https://app.vwo.com/");
        driver.findElement(By.id("login-username")).sendKeys("93npu2yyb0@esiix.co");
        driver.findElement(By.name("password")).sendKeys("abc@123");
        driver.findElement(By.id("js-login-btn")).click();

        //Thread.sleep(4000);- Not recommended
        WebElement invalidErrMsg = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("notification-box-description"))));
        Assert.assertEquals("Your email, password, IP address or location did not match", invalidErrMsg.getText());
    }

    @Test(groups = {"Regression", "Stage", "Prod"})
    @Description(" TC#2 Verify positive flow- User able to login ")
    public void validLogin() {
        driver.get("https://app.vwo.com/");
        driver.findElement(By.id("login-username")).sendKeys("93npu2yyb0@esiix.co");
        driver.findElement(By.name("password")).sendKeys("wingify@123");
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
