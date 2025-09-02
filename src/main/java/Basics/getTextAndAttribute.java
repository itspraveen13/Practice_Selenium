package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextAndAttribute {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");

		//get the visible text from a card
		String cardText=driver.findElement(By.className("card-content")).getText();
		System.out.println("Card Text : "+ cardText);

		String text = driver.findElement(By.className("label")).getText();
		System.out.println("Element text :"+text);

		//get attribute from element
		String text1 = driver.findElement(By.className("label")).getAttribute("class");
		System.out.println("Element Attribute :"+text1);
		
		//get placeholder text
		text1 = driver.findElement(By.id("fullName")).getAttribute("placeholder");
		System.out.println("Element Attribute :"+text1);

		Thread.sleep(5000);
		driver.quit();

	}

}
