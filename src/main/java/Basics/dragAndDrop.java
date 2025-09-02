package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/droppable");
		
		//implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//drag
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		Actions builder = new Actions(driver);
		
		builder.dragAndDrop(source, destination).build().perform();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
 