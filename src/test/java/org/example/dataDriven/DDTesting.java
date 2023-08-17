package org.example.dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class DDTesting {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        // options.addArguments("--headless=new");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }


    @Test(dataProvider = "loginData")
    public void dataDrivenLogin(String username, String password, String expectedResult) throws InterruptedException {

        driver.get("https://app.vwo.com/");
        driver.findElement(By.id("login-username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);


        if (expectedResult.equalsIgnoreCase("inValid")) {
            driver.findElement(By.id("js-login-btn")).click();
            WebElement invalidErrMsg = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("notification-box-description"))));
            Assert.assertEquals("Your email, password, IP address or location did not match", invalidErrMsg.getText());
        } else if (expectedResult.equalsIgnoreCase("valid")) {


            Thread.sleep(15000);
            driver.findElement(By.xpath("//button[@id='js-login-btn']")).click();
            String text = driver.findElement(By.cssSelector("[data-qa='lufexuloga']")).getText();
            Assert.assertEquals(text, "Bee Stinger");

        }

    }

//    @DataProvider(name = "loginData")
//    public Object[][] testData() {
//
//        return new Object[][]{
//                {"93npu2yyb0@esiix.co", "wingify@123", "InValid"},
//                {"cb8v0lhj@qiott.com", "Wingify@123", "Valid"}};
//    }

    @DataProvider(name = "loginData")
    public String[][] testDataExcel() throws IOException {

        String filePath = "src/test/resources/CTD.xlsx";
        ExcelReader excelReader = new ExcelReader(filePath);
        String[][] data = excelReader.getDataFromSheet(filePath, "Main");
        return data;

    }


    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

}
