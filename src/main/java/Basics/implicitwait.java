package Basics;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {
	public static void main(String[] args) {
		
		//launch and maximize browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/button");
		
		//implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
        
        //notes
        //implicit wait is one time declaration for the driver
        //it affects only webElement and webElements
        //the duration is maximum time. if the element found before the mentioned time it will automatically move to next.
	}

}
