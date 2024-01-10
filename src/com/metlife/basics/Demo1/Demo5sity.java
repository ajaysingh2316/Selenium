package com.metlife.basics.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
public class Demo5sity {


    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");

       // Choose Credit Card
        //  Enter credit card number as 4545 5656 8887 9998
        //  Enter cvv number
        //  Enter date as “14/04/2022”
        //  Click on Proceed
        //Get the text and print it “Please accept Terms and Conditions”
        driver.findElements(By.linkText("select your product type")).click;

        driver.findElement(By.linkText("Credit Card")).click();

        driver.findElement(By.name("Sity card"))






    }





}
