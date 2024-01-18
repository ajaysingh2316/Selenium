package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Actionclass_mouseover {

    public static void main(String[] args) {

        ChromeOptions opt=new ChromeOptions();
        opt.setAcceptInsecureCerts(true);

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.tutorialspoint.com/javascript/index.htm");
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(50,500)");
        jse.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//a[@title='Contact us']")));




    }

}
