package com.metlife.basics.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo_6 {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://nasscom.in/");
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.xpath("//*[@id=\"login-window\"]/div[1]/div[2]/ul/li[2]")).click();
        driver.findElement(By.id("edit-field-fname-reg-0-value")).sendKeys("admin");
        driver.findElement(By.id("edit-field-lname-0-value")).sendKeys("Pass");
        driver.findElement(By.id("edit-mail")).sendKeys("admin@gmail.com");
        driver.findElement(By.id("edit-field-company-name-registration-0-value")).sendKeys("Google");

        Select s1=new Select(driver.findElement(By.id("edit-field-business-focus-reg")));
        s1.selectByVisibleText("IT Consulting");


        driver.findElement(By.id("edit-submit--2")).click();


    }

    }

