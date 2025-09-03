package Basic_Methods_in_WebDriver_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Selenium_WebDriver_Tutorial_1 {

    //Basic methods of selenium webdriver

    @Test
    public void openLink() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        String title = driver.getTitle();
        System.out.println(title);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement psw = driver.findElement(By.id("password"));
        psw.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.xpath("//*[@id='login-button']"));
        login.click();

        List<WebElement> inventory = driver.findElements(By.xpath("//div[@class = 'inventory_list']/div"));
        System.out.println(inventory);

        driver.navigate().to("https://www.tutorialspoint.com/");
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);

        driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/a")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);


        driver.quit(); // closes all tabs and ends the session
        // driver.close(); // closes only the current tab/window
    }


}
