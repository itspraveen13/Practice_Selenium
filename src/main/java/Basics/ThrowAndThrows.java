package Basics;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThrowAndThrows {

	public void code() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}


	}

	public void test() {
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://letcode.in/edit");

		try {
			//enter name
			driver.findElement(By.id("fullName1")).sendKeys("Praveen");

			//Append a text and press keyboard tab
			driver.findElement(By.id("join")).sendKeys(" Tester.",Keys.TAB);
		}catch (NoSuchElementException e) {
			System.err.println("Element not Found!");
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		ThrowAndThrows tnt=new ThrowAndThrows();
		tnt.code();
		tnt.test();

	}

}
