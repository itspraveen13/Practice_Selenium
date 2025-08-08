package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseClick {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/selectable");

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//context click
		WebElement element=driver.findElement(By.xpath("//div[.=' Playwright ']"));
		Actions builder=new Actions(driver);
		builder.contextClick(element).perform();

		Thread.sleep(5000);
		driver.quit();
	}

}
