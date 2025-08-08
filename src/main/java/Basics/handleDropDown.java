package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handleDropDown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");

		//handle dropdown select an option
		WebElement fruitsDD = driver.findElement(By.cssSelector("#fruits"));
		Select DD= new Select(fruitsDD);

		//using visible text
		DD.selectByVisibleText("Apple");
		DD.selectByVisibleText("Orange");

		//using value
		DD.selectByValue("4");

		//print selected option
		WebElement selected = DD.getFirstSelectedOption();
		System.out.println(selected.getText());

		//multiselect
		WebElement herosDD = driver.findElement(By.id("superheros"));
		DD= new Select(herosDD);
		DD.selectByVisibleText("Ant-Man");
		DD.selectByVisibleText("The Avengers");
		DD.selectByVisibleText("Daredevil");
		DD.selectByVisibleText("Iron Man");
		
		DD.deselectByVisibleText("Daredevil");//deselect will only work for multiple select dropdown

		List<WebElement> selectedList =DD.getAllSelectedOptions();

		for (WebElement option : selectedList) {
			System.out.println(option.getText());
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
