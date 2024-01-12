package OrangehrmDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.linkText("Admin")).click();
        driver.findElement(By.xpath(" //button[@class='oxd-button oxd-button--medium oxd-button--secondary'] ")).click();
        driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
        driver.findElement(By.xpath("(//*[text()='Admin'])[3]")).click();


        driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();

        driver.findElement(By.xpath("(//*[text()='Enabled'])")).click();

        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("abc abcd");


        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]")).sendKeys("testuser");

        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Welcome@123");
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("Welcome@123");

        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();


        driver.close();







    }
}
