package com.metlife.basics.tabs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;

public class citybank {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.online.citibank.co.in/");
        /*
       * 1.  Navigate onto https://www.online.citibank.co.in/
2.  Close if any pop up comes
3.  Click on Login
4.  Click on Forgot User ID?
5.  Choose Credit Card
6.  Enter credit card number as 4545 5656 8887 9998
7.  Enter cvv number
8.  Enter date as “14/04/2022”
9.  Click on Proceed
10.  Get the text and print it “Please accept Terms and Conditions”*/
        driver.findElement(By.xpath("//a[@class='newclose']")).click();
        //first popup
        driver.findElement(By.xpath("//a[@class='newclose2']")).click();
        //second popup
        driver.findElement(By.xpath("//span[@class='txtSign']")).click();
        //windows
        ArrayList<String> windowa = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowa.get(1));
        //credit card
        driver.findElement(By.xpath("(//div[@class='fl cup pt3'])[1]")).click();
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

        Thread.sleep(3000);
        driver.quit();
    }
}