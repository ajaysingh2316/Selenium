package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class DemoScreenshot {

    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.selenium.dev/documentation/about/contributing/#creating-examples");

        File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(scrFile("./image.png"));
        FileHandler.copy(scrFile,new  File("./image.png"));

        scrFile=driver.findElement(By.tagName("html")).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(scrFile,new  File("./html.png"));

    }
}
