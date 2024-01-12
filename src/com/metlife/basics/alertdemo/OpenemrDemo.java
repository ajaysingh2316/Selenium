package com.metlife.basics.alertdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class OpenemrDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("http://demo.openemr.io/b/openemr/");

        // Update username as admin
        //  Update password as pass
        //  Select language as English (Indian)
                //  Click on the login button//Click on Patient  Click New Search
        //  Add the first name, last name
        //  Update DOB as today's datedriver.findElement(By.id("form_DOB")).sendKeys("2024-01-12");
        //  Update the gender
        //
        //
        // . . Click on the create new patient button above the form
        // . Click on confirm create new patient button.
        //. . Print the text from alert box (if any error before handling alert add 5 sec wait)
        //. . Handle alert
        //. Close the Happy Birthday popup
        //. Get the added patient name and print in the console.

        driver.findElement(By.id("authUser")).sendKeys("admin");
        driver.findElement(By.id("clearPass")).sendKeys("pass");
        Select lang =new Select(driver.findElement(By.xpath("//select[@name='languageChoice']")));
        lang.selectByVisibleText("English (Indian)");
        driver.findElement(By.id("login-button")).click();


        driver.findElement(By.xpath("//div[text()='Patient']")).click();
        driver.findElement(By.xpath("//div[text()='New/Search']")).click();


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='logoutinnerframe']")));
        driver.findElement(By.xpath("//input[@id='form_fname']")).sendKeys("jpmorgan");
        driver.findElement(By.xpath("//input[@id='form_lname']")).sendKeys("jpmorgan");
        driver.findElement(By.xpath("//input[@id='form_DOB")).sendKeys("12-12-1212");

        driver.switchTo().defaultContent();







    }
}
