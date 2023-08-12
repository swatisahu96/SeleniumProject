package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class orangeHRMDemo {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void loginHRM() throws InterruptedException {

        //Login
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        //Add Employee
        driver.findElement(By.xpath("//div[@class=\"orangehrm-header-container\"]/button")).click();
        driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Tatiana");
        driver.findElement(By.xpath("//input[@name=\"middleName\"]")).sendKeys("Alexander");
        driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Metanov");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }


    @AfterSuite
    public void tearDown() {
        driver.quit();
    }


}
