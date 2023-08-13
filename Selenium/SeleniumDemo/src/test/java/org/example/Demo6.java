package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Demo6 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void alerts() throws InterruptedException {

        driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println("Alert1 text: " + text);
        alert.accept();
        String resultant = driver.findElement(By.id("result")).getText();
        System.out.println("After clicking ok on 1st Alert: " + resultant);

        WebElement alert2 = driver.findElement(By.xpath("//button[contains(@onclick, 'jsConf')]"));
        wait.until(ExpectedConditions.elementToBeClickable(alert2)).click();
        String text2 = driver.switchTo().alert().getText();
        System.out.println("Alert2 text: " + text2);
        alert.accept();
        String resultant2 = driver.findElement(By.id("result")).getText();
        System.out.println("After clicking ok on 2nd Alert: " + resultant2);

        WebElement alert3 = driver.findElement(By.xpath("//button[contains(text(), 'JS Prompt')]"));
        wait.until(ExpectedConditions.elementToBeClickable(alert3)).click();
        String text3 = driver.switchTo().alert().getText();
        System.out.println("Alert3 text: " + text);
        wait.until(ExpectedConditions.alertIsPresent()).sendKeys("Stranger things");
        alert.accept();
        String resultant3 = driver.findElement(By.id("result")).getText();
        System.out.println("After clicking ok on 3rd Alert: " + resultant3);
    }

    @Test
    public void windows() {

        driver.navigate().to("https://the-internet.herokuapp.com/windows");
        String mainWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[contains(text(), \"Click Here\")]")).click();
        Set<String> windows = driver.getWindowHandles();
        for (String s : windows) {
            driver.switchTo().window(s);
            String text = driver.findElement(By.xpath("//h3")).getText();
            System.out.println("Switched to " + text);
        }
        driver.switchTo().window(mainWindow);
        System.out.println("Moving back to parent window");
    }

    @Test
    public void iFrame() {

        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("ABC");
        driver.switchTo().defaultContent();
        String text = driver.findElement(By.xpath("//div[contains(text(), 'Powered by')]")).getText();
        System.out.println(text);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

}
