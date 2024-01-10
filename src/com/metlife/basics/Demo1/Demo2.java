package com.metlife.basics.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://Facebook.com/");

        driver.findElement(By.id("email")).sendKeys("hroodnn12334");
        driver.findElement(By.id("pass")).sendKeys("welcome");


        //click to login

        driver.findElement(By.name("login")).click();




    }
}
