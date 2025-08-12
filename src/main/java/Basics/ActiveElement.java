package Basics;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {

	public static void main(String[] args) throws InterruptedException {
		//launch and maximize browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//active element
		driver.switchTo().activeElement().sendKeys("praveen@gmail.com", Keys.TAB, "Test@123", Keys.ENTER);


		//Quit browser
		Thread.sleep(3000);
		driver.quit();
	}

}
