package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class DemoNewwindow {
    public static void main(String[] args) {

            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_grid");
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("http://google.com");
            Set<String> winid=driver.getWindowHandles();
            driver.switchTo().window(winid.toArray()[0].toString());
        System.out.println(driver.switchTo().window(winid.toArray()[0].toString()));
        System.out.println(driver.switchTo().window(winid.toArray()[1].toString()));
    }
}
