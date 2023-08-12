package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.List;

public class awesomeQA {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");

    }

    @Test
    public void form() throws InterruptedException {

        driver.findElement(By.name("firstname")).sendKeys("ABC");
        driver.findElement(By.name("lastname")).sendKeys("def");

        List<WebElement> gender= driver.findElements(By.name("sex"));
        gender.get(1).click();
        List<WebElement> experience= driver.findElements(By.name("exp"));
        System.out.println("Select experience from below: ");
        for (WebElement exp: experience) {
            //System.out.println("\n"+exp.getAttribute("value"));
            if(exp.getAttribute("value").contains("3")){
                System.out.println("Selected experience: "+exp.getAttribute("value"));
            }
        }

        //Date
        driver.findElement(By.id("datepicker")).sendKeys("02/08/2023");

        List<WebElement> profession= driver.findElements(By.name("profession"));
        for (WebElement e: profession) {

           if(!e.isSelected() && e.getText().contains("Automation Tester")){
                e.click();
           }
        }

        List<WebElement> autoTools= driver.findElements(By.name("tool"));
        for (int i=0; i<autoTools.size(); i++){

            autoTools.get(i).getText().contains("Selenium Webdriver");
        }

        WebElement continent= driver.findElement(By.id("continents"));
        Select select= new Select(continent);
        select.selectByVisibleText("Europe");

        WebElement selCommands= driver.findElement(By.id("selenium_commands"));
        Select select2= new Select(selCommands);
        select2.selectByVisibleText("Wait Commands");



        driver.findElement(By.id("photo")).sendKeys("C:\\Users\\hp\\OneDrive\\Pictures\\Saved Pictures");

        driver.findElement(By.linkText("Click here to Download File")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.id("submit"));

    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }


}
