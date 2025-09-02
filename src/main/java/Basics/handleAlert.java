package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		//simple alert -accept
		driver.findElement(By.id("accept")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		//simple alert -dismiss
		driver.findElement(By.id("accept")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
				
		//simple alert -get text
		driver.findElement(By.id("accept")).click();
		String msg =driver.switchTo().alert().getText();
		System.out.println("Alert Msg : " + msg);
		
		//check the alert msg
		if(msg.equals("Hey! Welcome to LetCode") ) {
			driver.switchTo().alert().accept();
			System.out.println("Alert msg is correct");
		} else {
		    System.out.println("Alert msg is incorrect");
		}
		
		//confirm alert -accept
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//confirm alert -cancel
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		//prompt alert
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Im a QA");
		driver.switchTo().alert().accept();

		 
		Thread.sleep(4000);
		driver.quit();
		
		
		//notes:
		//exceptions
		//1.unhandledAlertException - need to handle the alert
		//2.NoAlertPresentException - alert not present


	} 

}
 