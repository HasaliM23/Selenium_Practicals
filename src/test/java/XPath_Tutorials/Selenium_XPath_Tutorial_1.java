package XPath_Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_XPath_Tutorial_1 {

    WebDriver driver;

    @BeforeMethod
    public void openLink() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/form/developer-signup/?d=pb");
    }

    @Test
    public void signUp_form() throws InterruptedException {
        Thread.sleep(3000); // wait for field to load

        WebElement fName = driver.findElement(By.xpath("//input[@name='UserFirstName']"));
        fName.sendKeys("Noel");
    }
}
