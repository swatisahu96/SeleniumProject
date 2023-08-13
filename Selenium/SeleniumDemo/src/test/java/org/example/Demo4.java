package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Demo4 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void healthAppointment() {

        driver.findElement(By.id("btn-make-appointment")).click();

        //Login
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement loginButton = driver.findElement(By.id("btn-login"));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();

        //Make Appointment
        WebElement facultyDrop = driver.findElement(By.id("combo_facility"));
        Select select = new Select(facultyDrop);
        select.selectByVisibleText("Hongkong CURA Healthcare Center");

        WebElement checkBox = driver.findElement(By.id("chk_hospotal_readmission"));
        checkBox.click();

        List<WebElement> radio = driver.findElements(By.className("radio-inline"));
        for (WebElement r : radio) {
            if (r.getText().contains("None")) {
                r.click();
            }
        }

        driver.findElement(By.id("txt_visit_date")).sendKeys("02/08/2023");
        driver.findElement(By.id("txt_comment")).sendKeys("NA");
        driver.findElement(By.id("btn-book-appointment")).click();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }


}
