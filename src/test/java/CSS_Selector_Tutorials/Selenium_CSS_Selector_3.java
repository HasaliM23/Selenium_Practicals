package CSS_Selector_Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_CSS_Selector_3 {

    WebDriver driver;

    @BeforeMethod
    public void openLink(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://support.orangehrm.com/portal/en/signin");
    }

    @Test
    public void cSSSelectorWithMultipleAttributes(){

        WebElement email = driver.findElement(By.cssSelector("input.inputBox[placeholder='Email Address']"));
        email.sendKeys("roy@gmail.com");

    }
}
