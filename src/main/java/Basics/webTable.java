package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/table");

		//get table
		WebElement table=driver.findElement(By.xpath("//table[@id='simpletable']"));

		//get all table heading
		List<WebElement> header=table.findElements(By.tagName("th"));

		for (WebElement tableHeader : header) {
			System.out.println(tableHeader.getText());
		}

		//get all table rows except heading
		List<WebElement> allRows = table.findElements(By.cssSelector("tbody tr"));
		int size=allRows.size();
		System.out.println(size);

		for (int i = 0; i <size; i++) {
			//get all table data
			List<WebElement> rows = allRows.get(i).findElements(By.tagName("td"));
			//filtering to last name column
			WebElement lastName=rows.get(1);
			System.out.println(lastName.getText() );
			String text=lastName.getText();

			if (text.equals("Raj")) {
				//taking the last column and performing action
				rows.get(3).findElement(By.tagName("input")).click();
				break;

			}

		}

		driver.quit();
	}

}
