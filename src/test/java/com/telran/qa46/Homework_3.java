package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework_3 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByXpath(){
        //id -> //*[@id='value']
        driver.findElement(By.xpath("//*[@id='dialog-notifications-error']"));
        driver.findElement(By.xpath("//*[@id='bar-notification']"));

        //tag -> xpath //tag
        driver.findElement(By.xpath("//head"));
        driver.findElement(By.xpath("//title"));

        //className-> //*[@class='value']
        driver.findElement(By.xpath("//div[@class='header']"));
        driver.findElement(By.xpath("//div[@class='header-logo']"));

        //contains -> //*[contains(.,'Text')]
        driver.findElement(By.xpath("//*[contains(.,'Welcome')]"));
        driver.findElement(By.xpath("//*[contains(.,'Copyright © 2025')]"));

        //equal> //*[text()='FoolText']
        driver.findElement(By.xpath("//*[text()='Popular tags']"));
        driver.findElement(By.xpath("//*[text()='Build your own expensive computer']"));

        //start -> //*[starts-with(@attr,'Text')]
        driver.findElement(By.xpath("//*[starts-with(@content,'te')]"));

        //move up -> //*[@attr='value']/..
        driver.findElement(By.xpath("//*[@rel='stylesheet']/.."));

        //parent
        driver.findElement(By.xpath("//ul/parent::*"));
        driver.findElement(By.xpath("//ul/parent::div"));
        driver.findElement(By.xpath("//ul/.."));

        //ancestor
        driver.findElement(By.xpath("//ul/ancestor::*"));
        driver.findElement(By.xpath("//ul/ancestor::div"));
        driver.findElement(By.xpath("//ul/ancestor::div[7]"));

       //folowing-sibling
        driver.findElement(By.xpath("//ul/following-sibling::div"));
        driver.findElement(By.xpath("//ul/following-sibling::*"));
        driver.findElement(By.xpath("//ul/following-sibling::div[2]"));

        //preceding-sibling
        driver.findElement(By.xpath("//ul/preceding-sibling::*"));
        driver.findElement(By.xpath("//ul/preceding-sibling::div"));
        driver.findElement(By.xpath("//ul/preceding-sibling::div[2]"));


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
