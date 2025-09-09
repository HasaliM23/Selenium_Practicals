package Basic_Methods_in_WebDriver_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Handle_AutoSelected_DropDown {

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.global/?cmp=SEM%7CD%7CIF%7CA2A%7CG%7CBrand%7CIF_Brand_Exact-DT%7CBrand_Exact-DT%7CRSA&gad_source=1&gad_campaignid=22331238703&gbraid=0AAAAA-8w7HGm5TsEbaIOyDKhNJG69bpXV&gclid=CjwKCAjw_fnFBhB0EiwAH_MfZsl57aPu8sDQT8TeuEuFhwvY-VjPti3wy-IxrkI9l6sNXbaELL3CghoC15oQAvD_BwE&cc=lk");
        Thread.sleep(4000);

    }

    @Test
    public void autoSuggestDropDown() throws InterruptedException {
        WebElement dropDown = driver.findElement(By.xpath("//span[text()= 'From' ]"));
        dropDown.click();

        WebElement city = driver.findElement(By.xpath("//input[@placeholder='From']"));
        Thread.sleep(2000);
        city.sendKeys("Sydney");
        Thread.sleep(2000);
        city.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        city.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

    }
}
