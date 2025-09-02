package Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChrome {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://preprod.homefoodglobal.com");
		Thread.sleep(10000);
		driver.findElement(By.linkText("Order Now")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("flt-semantic-node-36")).sendKeys("9600307858");


		//driver.quit();
		
	}

} 