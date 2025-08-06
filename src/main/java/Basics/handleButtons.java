package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class handleButtons {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/button");
		
		//Get the X & Y co-ordinates
		WebElement element1 = driver.findElement(By.id("position"));
		Point p = element1.getLocation();
		int x=p.getX();
		int y=p.getY();
		
		System.out.println("Co-ordinates : X => "+ x +", Y =>" + y);
		
		//Find the color of the button 
		WebElement btnColor= driver.findElement(By.id("color"));
		String color= btnColor.getCssValue("background-color");
		System.out.println("Button color : "+color);
		
		//Find the height & width of the button
		WebElement containerDimensions = driver.findElement(By.id("property"));
		int height = containerDimensions.getRect().height;
		int width = containerDimensions.getRect().width;
		System.out.println("Height : "+height +", Width : "+width);

		//check if Confirm button is disabled
		boolean isDisabled = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println("Button is enabled : "+ isDisabled );
		
//		//Click and Hold Button
//		WebElement btn = driver.findElement(By.id("isDisabled"));
//		new Actions(driver).clickAndHold(btn).perform();
		
		Thread.sleep(10000);
		driver.quit();
	} 

}
