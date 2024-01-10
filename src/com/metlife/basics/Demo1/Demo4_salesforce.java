package com.metlife.basics.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo4_salesforce {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
        //enter first name
        //enter last name
        // selecct a job title as'' it manager"
        //select employee to 101-200 employees"
        //click on checkbox
        //country as Maldives
        //click on checkbox of agreement

        driver.findElement(By.name("UserFirstName")).sendKeys("john");
        driver.findElement(By.name("UserLastName")).sendKeys("singh");


        Select job = new Select(driver.findElement(By.name("UserTitle")));
        job.selectByVisibleText(("IT Manager"));



        Select country = new Select(driver.findElement(By.name("CompanyCountry")));
        country.selectByVisibleText("Maldives");

        Select emp=new Select(driver.findElement(By.name("CompanyEmployees")));
        emp.selectByVisibleText("101 - 200 employees");




        driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();





    }
}
