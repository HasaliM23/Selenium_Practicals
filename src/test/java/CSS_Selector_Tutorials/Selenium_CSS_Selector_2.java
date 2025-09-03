package CSS_Selector_Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_CSS_Selector_2 {

    WebDriver driver;

    @BeforeMethod

    public void openLink(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/form/developer-signup/?d=pb");
    }

    @Test

    public void cssSelectorUsingClassAttribute(){

        WebElement signUp = driver.findElement(By.cssSelector("button.submit"));
        signUp.click();
    }
}

