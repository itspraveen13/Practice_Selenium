package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class closeAndQuit {

	public static void main(String[] args)throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		Thread.sleep(3000);
		//closes the tab
		driver.close();
		
		driver.get("https://letcode.in/edit");
		Thread.sleep(3000);
		//ends the task 
		driver.quit();

		
	}

}
