package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndMove {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/draggable");
		
		//implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//drag
		WebElement source = driver.findElement(By.id("sample-box"));
		Actions builder = new Actions(driver);
		int x=source.getLocation().getX();
		int y=source.getLocation().getY();
		builder.dragAndDropBy(source, x+50, y-50).perform();
		
		Thread.sleep(5000);
		driver.quit();
		
		//note
	}

}
