package Basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {

		// launch and maximize browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/waits");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// click button that triggers alert
		driver.findElement(By.cssSelector("button#accept")).click(); 

		// explicit wait -> webDriverwait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		//print alert message text
		System.out.println(alert.getText());
		
		// accept alert
		alert.accept();
		
		//another eg:
		driver.get("https://letcode.in/signin");
		
		driver.findElement(By.name("email")).sendKeys("eg@gmail.com");
		driver.findElement(By.name("password")).sendKeys("pass@123");

		// click button that triggers toaster
		driver.findElement(By.xpath("//button[.='LOGIN']")).click(); 
		WebElement toast=driver.findElement(By.xpath("//div[role='alertdialog']"));
		// explicit wait -> webDriverwait
		wait.until(ExpectedConditions.visibilityOf(toast));
		System.out.println(toast.getText());
		wait.until(ExpectedConditions.invisibilityOf(toast));
		
		driver.findElement(By.linkText("Sign out"));
		
		 

		driver.quit();
		
	}
}
