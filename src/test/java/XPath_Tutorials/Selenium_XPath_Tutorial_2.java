package XPath_Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_XPath_Tutorial_2 {

    WebDriver driver;

    @BeforeMethod
    public void openLink(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/form/developer-signup/?d=pb");
    }

    @Test
    public void absoluteXPath(){
        WebElement fname = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[1]/div/div[1]/div/div/input"));
        fname.sendKeys("Noel");
    }

    @Test
    public void relativeXPath(){
        WebElement fname = driver.findElement(By.xpath("//input[@name='UserFirstName']"));

        fname.sendKeys("Noel");

    }
}
