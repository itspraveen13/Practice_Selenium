package Basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountWebElements {

	public static void main(String[] args) throws InterruptedException {

		//launch and maximize browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Chennai",Keys.ENTER);
		
		Thread.sleep(5000);

		//find webelements
		List<WebElement> ContainsChennai= driver.findElements(By.xpath("//*[contains(text(),'Chennai') or contains(text(),'chennai')]"));
		
		System.out.println("No. of chennai in the page : "+ContainsChennai.size() );

		driver.quit();
	}

}
