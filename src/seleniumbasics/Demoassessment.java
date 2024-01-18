package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Demoassessment {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://mockexam1cpsat.agiletestingalliance.org/");
        driver.findElement(By.xpath("(//a[@href='#'])[2]")).click();
        List<WebElement> menu=driver.findElements(By.id("menu-slideout-spacious"));
        for (WebElement name:menu)
        {
            System.out.println(name.getText());
        }

        String facebook=driver.findElement(By.xpath("(//a[@title='Facebook'])")).getAttribute("href");
        System.out.println(facebook);
        String twitter=driver.findElement(By.xpath("(//a[@title='Facebook'])")).getAttribute("href");
        System.out.println(twitter);
        String instagram=driver.findElement(By.xpath("(//a[@title='Instagram'])")).getAttribute("href");
        System.out.println(instagram);
        String mail=driver.findElement(By.xpath("(//a[@title='Contact'])")).getAttribute("href");
        System.out.println(mail);
        driver.quit();








    }
}


