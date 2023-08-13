package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Demo2 {

    WebDriver driver;

    @Test
    public void locatorsDemo() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com/");

        //partialLink Text
        driver.findElement(By.partialLinkText("free trial"));

        //Link Text
        driver.findElement(By.linkText("Start a free trial"));

        // TagName
        List<WebElement> anchorTagElements = driver.findElements(By.tagName("a"));
        for (WebElement e : anchorTagElements) {
            System.out.println(e.getText());
        }

        driver.quit();

    }
}
