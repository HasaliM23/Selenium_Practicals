package Basic_Methods_in_WebDriver_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Handle_Dropdown_in_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void openLink() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sugarcrm.com/au/request-demo/");

    }


    @Test
    public void dropdownTest() throws InterruptedException {
        WebElement dropDown = driver.findElement(By.name("input_8"));
        Select select = new Select(dropDown);

        select.selectByValue("level1");
        Thread.sleep(1000);
        select.selectByVisibleText("51 - 100 employees");
        Thread.sleep(2000);
        select.selectByIndex(5);
    }


}
