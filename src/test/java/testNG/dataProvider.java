package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class dataProvider {
	
	@DataProvider(name ="Creds")
	public String[][] getData(){
		String[][] data= new String[2][2];
		data[0][0]="1234567890";
		data[0][1]="pass@123";
		
		data[1][0]="9876543210";
		data[1][1]="pass@1234";
		return data;
	}
	@Test(dataProvider = "Creds")

	public void submitForm(String phoneNumber, String password) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		//login with creds
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username or email address']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
		
		//submit function ->it should be used only for filling the form
		driver.findElement(By.xpath("//button[.='Log in']")).submit();

		Thread.sleep(2000);
		//ends the task 
		driver.quit();

	}

}
