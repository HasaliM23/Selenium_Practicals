package XPath_Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_XPath_Tutorial_3 {

    WebDriver driver;

    @BeforeMethod

    public void openLink(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/form/developer-signup/?d=pb");
    }

    @Test

    public void startsWithFunction () throws InterruptedException {

        WebElement lname = driver.findElement(By.xpath("//input[starts-with(@id,'UserLastName')]"));

        Thread.sleep(2000);

        lname.sendKeys("David");
    }
}
