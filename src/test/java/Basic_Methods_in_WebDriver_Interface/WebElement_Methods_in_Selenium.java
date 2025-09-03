package Basic_Methods_in_WebDriver_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElement_Methods_in_Selenium {


    @Test
    public void openLink() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        driver.findElement(By.name("input_3.3")).sendKeys("QA Testing");
        driver.findElement(By.name("input_3.3")).clear();
        System.out.println(driver.findElement(By.name("input_3.3")).getAttribute("type"));
        System.out.println(driver.findElement(By.xpath("//*[@id='gform_submit_button_1']")).getCssValue("font-family"));



        System.out.println(driver.findElement(By.xpath("//*[@id='gform_submit_button_1']")).getSize());
        System.out.println(driver.findElement(By.xpath("//*[@id='gform_submit_button_1']")).getLocation());
        System.out.println(driver.findElement(By.xpath("//*[@id='field_1_87']/div")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id='gform_submit_button_1']")).getTagName());
        System.out.println(driver.findElement(By.xpath("//*[@id='gform_submit_button_1']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id='gform_submit_button_1']")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//*[@id='gform_submit_button_1']")).isSelected());

    }



}
