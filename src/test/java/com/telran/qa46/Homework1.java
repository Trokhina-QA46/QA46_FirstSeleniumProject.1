package com.telran.qa46;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework1{
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://ticket-service-69443.firebaseapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    @Test
    public void openTicketService(){
        System.out.println("Ticket-service was opened");
    }
    @AfterMethod(enabled = true)
    public void tearDown(){
        driver.quit();
    }

}