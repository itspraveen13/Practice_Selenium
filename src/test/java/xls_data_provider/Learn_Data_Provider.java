package xls_data_provider;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learn_Data_Provider {

    @Test(dataProvider = "creds", dataProviderClass = Data_Utils_xls.class)
    public void LoginTest(String username, String password) throws InterruptedException {
        System.out.println("ID : " + username);
        System.out.println("Password : " + password);

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // login with credentials
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        // click login
        driver.findElement(By.xpath("//button[.='Log in']")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
