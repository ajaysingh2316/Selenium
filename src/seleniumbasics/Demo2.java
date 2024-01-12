package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        ////todo auto generated methods

              WebDriver driver= new ChromeDriver();

                driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");

                int count= driver.findElement(By.xpath("//*[@id='example']/tbody")).findElements(By.tagName("tr")).size();
                System.out.println(count);
        for(int i=1;i<=count;i++) {
            WebElement name = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[" + i + "]/td[2]"));
            WebElement sal = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr["+i+"]/td[6]"));
            System.out.println(name.getText() + " \t " + sal.getText());

                }










    }
}
