package Basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenshot {
	
	//write a function to take screenshot
	public static void takeSS(ChromeDriver driver, String fileName, WebElement element) throws IOException {
				 File srcFile;
				 
				 if(element != null) {
					 srcFile =element.getScreenshotAs(OutputType.FILE);
				 }else {
					 srcFile = driver.getScreenshotAs(OutputType.FILE);
				 }
				 
				 //create dest folder
				 File destFolder = new File("./Screenshots");
				 destFolder.mkdir();
				 
				 //save screenshot
				 File destFile = new File(destFolder, fileName+".png");
				 FileHandler.copy(srcFile,destFile);
				 
				 System.out.println("Screenshot saved : "+ destFile.getAbsolutePath());
			}

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/button");
		
		 // Full page screenshot
        takeSS(driver, "full_page", null);

        // Screenshot of a button element
        WebElement homeBtn = driver.findElement(By.id("home"));
        takeSS(driver, "home_button", homeBtn);

        // Screenshot of a section
        WebElement section = driver.findElement(By.className("card-content"));
        takeSS(driver, "section_card", section);

        Thread.sleep(2000);
        driver.quit();
		

	}

}
