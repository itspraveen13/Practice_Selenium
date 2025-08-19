package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class CrossBrowser {


	@Parameters({"phoneNumber", "password", "browser"})
	@Test

	public void submitForm(String phoneNumber, String password, String browser) throws InterruptedException{
		RemoteWebDriver driver = null;

		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.err.println("Browser is not defined!");
			break;
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//		//login with creds
//		driver.findElement(By.xpath("//input[@aria-label='Phone number, username or email address']")).sendKeys(phoneNumber);
//		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
		driver.findElement(By.name("username")).sendKeys(phoneNumber);
		driver.findElement(By.name("password")).sendKeys(password);

		//submit function ->it should be used only for filling the form
		driver.findElement(By.xpath("//button[.='Log in']")).submit();

		Thread.sleep(2000);
		//ends the task 
		driver.quit();

	}

}
