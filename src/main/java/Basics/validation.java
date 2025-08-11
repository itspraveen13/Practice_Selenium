package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validation {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in");

		//is displayed -> to check its displayed eg: button
		WebElement login =driver.findElement(By.xpath("(//a[contains(@class,'button is-link')])[2]"));
		boolean isdisplayed=login.isDisplayed();
		System.out.println("Button is displayed : " + isdisplayed );

		//is enabled -> intractable field Eg: text field
		driver.get("https://letcode.in/edit");
		WebElement textbox=driver.findElement(By.id("noEdit"));
		System.out.println("Text box is enabled :"+textbox.isEnabled());

		//is selected ->Eg: check box
		driver.get("https://letcode.in/radio");
		WebElement checkBox=driver.findElement(By.xpath("(//label[@class='checkbox']//input)[1]"));
		System.out.println("Check box is Selected :"+checkBox.isSelected());

		
		Thread.sleep(3000);
		//ends the task 
		driver.quit();
	} 

}
