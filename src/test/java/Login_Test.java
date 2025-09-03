import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Test {

    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");

    }

    @Test

    public void Login_Function (){
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement psw = driver.findElement(By.id("password"));
        psw.sendKeys("secret_sauce");

       WebElement submit =  driver.findElement(By.xpath("//*[@id='login-button']"));
       submit.click();
    }
}


