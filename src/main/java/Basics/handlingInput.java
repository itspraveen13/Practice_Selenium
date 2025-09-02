package Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingInput {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://letcode.in/edit");
		
		//enter name
		driver.findElement(By.id("fullName")).sendKeys("Praveen");
		
		//Append a text and press keyboard tab
		driver.findElement(By.id("join")).sendKeys(" Tester.",Keys.TAB);
		
		//read What is inside the text box
		String value = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println("value : " + value);
		
		//Clear the text
		driver.findElement(By.id("clearMe")).clear();
		
		//Confirm edit field is disabled
		boolean isEnabled = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println("IsDisabled : " + isEnabled);
		
		//Confirm text is readonly
		String isReadonly=driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println("Is Readonly : "+ isReadonly);

	}

}
