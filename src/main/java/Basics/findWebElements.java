package Basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findWebElements {

	public static void main(String[] args) {

		//launch and maximize browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//find webelements
		List<WebElement> labels= driver.findElements(By.tagName("label"));
		for (WebElement label : labels) {
			System.out.println(label.getText());

		}

		if (labels.size()==6) {
			System.out.println("Test case Passed!");
		}else {
			System.out.println("Test case Failed!");
		}
		
		System.out.println(labels.getLast().getText());
		System.out.println(labels.getFirst().getText());

		driver.quit();

	}

}
