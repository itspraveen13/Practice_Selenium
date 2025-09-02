package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitFunction {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


		//login with creds
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username or email address']")).sendKeys("9600307858");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Test@123");
		
		//submit function ->it should be used only for filling the form
		driver.findElement(By.xpath("//button[.='Log in']")).submit();

		Thread.sleep(3000);
		//ends the task 
		driver.quit();

	}

}
