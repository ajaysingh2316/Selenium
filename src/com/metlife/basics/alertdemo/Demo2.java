package com.metlife.basics.alertdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;

public class Demo2 { {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.online.citibank.co.in/");

        driver.findElement(By.className("newclose")).click();
        driver.findElement(By.className("newclose2")).click();
        driver.findElement(By.xpath("//a[@class='visible-dektop overlay-login']")).click();

        ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));

        driver.findElement(By.xpath("//div[@class='fl cup pt3'")).click();

        driver.findElement(By.xpath("//a[@class='sbSelector']")).click();
        driver.findElement(By.xpath("//a[text()='Credit Card']")).click();
        driver.findElement(By.id("citiCard1")).sendKeys("4545");
        driver.findElement(By.id("citiCard2")).sendKeys("5656");
        driver.findElement(By.id("citiCard3")).sendKeys("8887");
        driver.findElement(By.id("citiCard4")).sendKeys("9998");
        driver.findElement(By.name("CCVNO")).sendKeys("123");
        driver.findElement(By.name("DOB")).click();

        Select s1 = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        s1.selectByVisibleText("2022");
        System.out.println("___");
        Select s2 = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        s2.selectByVisibleText("Apr");
        driver.findElement(By.xpath("//a[text()='4']")).click();
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//input[@class='ctaBlue minWidth']")).click();
        System.out.println(driver.findElement(By.xpath("//p[@class='err-cont']")).getText());


        driver.quit();



    }
}
