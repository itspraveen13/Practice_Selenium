package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//		driver.findElement(By.xpath("//div//span[.='✕']")).click();
		driver.findElement(By.xpath("//span//span[.='Electronics']")).click();
		//mouse hover
		WebElement element=driver.findElement(By.xpath("//span[.='Electronics']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(element).perform();

		driver.findElement(By.linkText("Samsung")).click();


		Thread.sleep(5000);
		driver.quit();
	}

}
