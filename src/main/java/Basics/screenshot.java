package Basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/button");
		
		//take ss of a page
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile =new File("./ScreenShots/img1.png");
		FileHandler.copy(srcFile,destFile);
		
		//take ss of a element
		srcFile = driver.findElement(By.id("home")).getScreenshotAs(OutputType.FILE);
		destFile =new File("./ScreenShots/img2.png");
		FileHandler.copy(srcFile,destFile);
		
		//take ss of a section
		srcFile = driver.findElement(By.cssSelector("div.card-content")).getScreenshotAs(OutputType.FILE);
		destFile =new File("./ScreenShots/img3.png");
		FileHandler.copy(srcFile,destFile);

		
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
