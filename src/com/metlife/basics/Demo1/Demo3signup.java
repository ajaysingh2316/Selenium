package com.metlife.basics.Demo1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3signup {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.get("https://Facebook.com/");
// click on create account
        // enter first name as john
        driver.findElement(By.linkText("Create new account")).click();
// enter first name as john
        driver.findElement(By.name("firstname")).sendKeys("john");
        driver.findElement(By.name("last name")).sendKeys("singh");
        driver.findElement(By.id("password_step_input")).sendKeys("ajay123");

        //20 apr 2001

        Select selectDay = new Select(driver.findElement(By.id("day")));
        selectDay.selectByVisibleText("20");

        Select selectMonth=new Select(driver.findElement(By.id("day")));
        selectMonth.selectByVisibleText("Apr");



        driver.findElement(By.xpath("//input[@value='-1']")).click();
        




    }
}
