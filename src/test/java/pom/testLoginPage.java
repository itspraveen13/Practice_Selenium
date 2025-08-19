package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testLoginPage {
	
	@Test
	public void testLogin() {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://example.com/login");

	    loginPage loginPage = new loginPage(driver);
	    loginPage.login("testUser", "testPass");
	}

}
