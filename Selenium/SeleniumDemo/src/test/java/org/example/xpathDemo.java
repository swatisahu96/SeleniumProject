package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class xpathDemo {

    WebDriver driver;

    @Test
    public void locatorsDemo() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.navigate().to("https://awesomeqa.com");
        System.out.println(" Title: " + driver.getTitle());
        //driver.navigate().to(new URL("https://awesomeqa.com/xpath"));
        driver.navigate().to("https://awesomeqa.com/xpath");
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println("Current URL:" + driver.getCurrentUrl());
        WebElement ancestor = driver.findElement(By.xpath("//div[@class=\"Mammal\"]/ancestor::div[2]"));
        ancestor.getText();
        //Selects everything in the document after current node
        WebElement allEleAfterCurrent = driver.findElement(By.xpath("//div[@class=\"Mammal\"]/following::div"));
<<<<<<< HEAD
=======

>>>>>>> c8dc3993cc9149355b439c91b4c0bb25fba9d67d
        driver.quit();
    }

}

