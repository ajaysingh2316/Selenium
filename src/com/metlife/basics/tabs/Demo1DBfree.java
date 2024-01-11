package com.metlife.basics.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Demo1DBfree {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.db4free.net/");
        driver.findElement(By.linkText("phpMyAdmin »")).click();

        //switch to second tab
        //set<string>


        ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        // enter password as admin
        //click login
        driver.findElement(By.name("input_username")).sendKeys("admin");
        driver.findElement(By.name("input_password")).sendKeys("admin123");
        driver.findElement(By.id("input_go")).click();

        driver.close();
        //switch to first tab
        driver.switchTo().window(windows.get(0));

        //get the title and prit
        System.out.println(driver.getTitle());






    }
}
