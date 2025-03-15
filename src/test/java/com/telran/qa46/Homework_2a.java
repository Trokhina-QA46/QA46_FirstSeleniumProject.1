package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework_2a {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementBySimpleLocator() {
        driver.findElement(By.id("dialog-notifications-success"));
        System.out.println("dialog-notifications-success");
        driver.findElement(By.id("dialog-notifications-error"));
        System.out.println("dialog-notifications-error");
        driver.findElement(By.id("bar-notification"));
        System.out.println("bar-notification");


        driver.findElement(By.className("close"));
        System.out.println("close");
        driver.findElement(By.className("master-wrapper-page"));
        System.out.println("master-wrapper-page");
        driver.findElement(By.className("header-logo"));
        System.out.println("header-logo");

        WebElement log = driver.findElement(By.linkText("Log in"));
        System.out.println(log.getText());
        WebElement s = driver.findElement(By.linkText("Shopping cart"));
        System.out.println(s.getText());

        driver.findElement(By.partialLinkText("Books"));
        System.out.println("1.partial link text ");
        driver.findElement(By.partialLinkText("Computers"));
        System.out.println("2.partial link text ");

    }

    @Test
    public void findElementByCssSelectorText() {

        // id=> css(#)
        driver.findElement(By.cssSelector("#mob-menu-button"));
        driver.findElement(By.cssSelector("#dialog-notifications-success"));

        // className => css(.)
        driver.findElement(By.cssSelector(".header-logo"));
        driver.findElement(By.cssSelector(".cart-label"));

        // tag name = css
        driver.findElement(By.cssSelector("strong"));
        driver.findElement(By.tagName("head"));

        //[attribute = 'value']
       // driver.findElement(By.cssSelector("[href='/Content/jquery-ui-themes/smoothness/jquery-ui-1.10.3.custom.min.css']"));
        driver.findElement(By.cssSelector("[href='/Themes/DefaultClean/Content/responsive.css']"));

        // contains->*
       // driver.findElement(By.cssSelector("[href*='Content']"));
        driver.findElement(By.cssSelector("[href*='Themes']"));

        //start-> ^
        driver.findElement(By.cssSelector("[href^='/Plugins']"));

        //end on-> $
        //driver.findElement(By.cssSelector("[href$='cart']"));
        driver.findElement(By.cssSelector("[href$='search']"));


    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
