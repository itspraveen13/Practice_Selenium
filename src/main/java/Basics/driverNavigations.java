package Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverNavigations {

	public static void main(String[] args) throws InterruptedException {
		
		//launch chrome
		ChromeDriver driver = new ChromeDriver();
		
		//go to the website
		driver.get("https://letcode.in/button");
		
		//get current url
		String url = driver.getCurrentUrl();
		System.out.println("Button page url : " + url);
		Thread.sleep(3000);
		
		//Goto Home and come back here using driver commands
		driver.findElement(By.id("home")).click();
		url = driver.getCurrentUrl();
		System.out.println("Home page url : " + url);
		Thread.sleep(3000);

		// navigate back
		driver.navigate().back();
		url = driver.getCurrentUrl();
		System.out.println("returns to Button page url : " + url);
		
		//refresh the page
		driver.navigate().refresh();
		System.out.println("Page refreshed");
		
		//navigate forward
		driver.navigate().forward();
		url = driver.getCurrentUrl();
		System.out.println("Forward to homepage page url : " + url);
		
		//navigate to url
		driver.navigate().to("https://instagram.com");
	}

}
