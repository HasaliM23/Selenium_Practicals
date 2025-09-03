package Basic_Methods_in_WebDriver_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Handle_Multiple_Dropdown_in_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

        // Switch to iframe (all w3schools examples are inside iframe)
        driver.switchTo().frame("iframeResult");
    }

    @Test
    public void multipleDropdownTest() throws InterruptedException {
        // Locate the multi-select element
        WebElement carsDropdown = driver.findElement(By.id("cars"));
        Select select = new Select(carsDropdown);

        // Verify it supports multiple selection
        System.out.println("Is multiple select? " + select.isMultiple());

        // Select multiple options
        select.selectByVisibleText("Volvo");
        Thread.sleep(1000);

        select.selectByValue("opel");
        Thread.sleep(1000);

        select.selectByIndex(3); // selects Audi
        Thread.sleep(1000);

        // Get all selected options
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        System.out.println("Total selected: " + selectedOptions.size());
        for (WebElement option : selectedOptions) {
            System.out.println("Selected: " + option.getText());
        }

        // Deselect one option
        select.deselectByVisibleText("Opel");
        Thread.sleep(1000);

        // Deselect all
        select.deselectAll();
    }


}
