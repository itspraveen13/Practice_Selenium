package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleFrames {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");

		//handling frame by index
		//		driver.switchTo().frame(0);

		//by id or name
		//		driver.switchTo().frame("firstFr");

		//by xpath / web element
		WebElement myframe= driver.findElement(By.xpath("//iframe[@src=\"frameui\"]"));
		driver.switchTo().frame(myframe);

		driver.findElement(By.name("fname")).sendKeys("Praveen");
		Thread.sleep(2000);
		driver.findElement(By.name("lname")).sendKeys("B");

		//switch to 2nd frame
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("praveen@gmail.com");

		//switch to parent frame/ switch back
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).sendKeys("harathi");
		
		//go to base frame
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[text()='Watch tutorial']")).click();

		Thread.sleep(4000);
		driver.quit();

		//note:
		//exception 
		//NoSuchFrameException
	}

}
