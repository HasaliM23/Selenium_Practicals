package XPath_Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_XPath_Tutorial_6 {

    WebDriver driver;

    @BeforeMethod
    public void openLink(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/form/developer-signup/?d=pb");

    }

    @Test
    public void XPathANDOperatorOR(){

        WebElement fname = driver.findElement(By.xpath("//input[@type = 'text' and @name = 'UserFirstName'] "));
        fname.sendKeys("Noel");

        WebElement lname = driver.findElement(By.xpath("//input[@name = 'UserLastName' or @id = 'UserLastName-mhL3'] "));
        lname.sendKeys("Bernard");

    }
}
