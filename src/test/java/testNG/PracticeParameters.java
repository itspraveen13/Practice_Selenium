package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class PracticeParameters {
	
	@Parameters({"phoneNumber", "password"})
	@Test

	public void submitForm(String phoneNumber, String password) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


		//login with creds
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username or email address']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
		
		//submit function ->it should be used only for filling the form
		driver.findElement(By.xpath("//button[.='Log in']")).submit();

		Thread.sleep(2000);
		//ends the task 
		driver.quit();

	}

}
