package Basic_Methods_in_WebDriver_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Handle_Checkbox {

    WebDriver driver;

    @BeforeMethod
    public void openLink() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
    }

    @Test
    public void checkBoxEX() throws InterruptedException {

        WebElement checkBox = driver.findElement(By.id("c_bs_1"));
        Thread.sleep(2000);
        checkBox.click();
    }


}
