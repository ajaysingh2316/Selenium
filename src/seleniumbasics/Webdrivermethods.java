package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Webdrivermethods {

    public static void main(String[] args) {

        //todo auto generated method stub

        WebDriver driver= new ChromeDriver();

        driver.get("http://google.com");
        System.out.println(driver.getTitle());

        driver.get("http://yahoo.com");
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        driver.quit();


    }
}
