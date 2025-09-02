package Basics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		//launch and maximize browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/window");

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//window handling
		driver.findElement(By.xpath("//button[contains(text(),'Open')]")).click();
		
		Set<String> window= driver.getWindowHandles();
		System.out.println(window);
		
		List<String> currentWindow = new ArrayList<String>(window);
		driver.switchTo().window(currentWindow.get(1));
		System.out.println("Current url : "+driver.getCurrentUrl());
		
		driver.switchTo().window(currentWindow.get(0));
		System.out.println(driver.getTitle());

		driver.close();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
