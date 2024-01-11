package com.metlife.basics.alertdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo1hdfc {
    public static void main(String[] args) {

            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");

            //click on Go
            driver.findElement(By.xpath("//img[@alt='Go']")).click();

            //when alert is present wait for the alert
        System.out.println( driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();


    }
}
