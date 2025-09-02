package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Page Object Class
public class Example_of_POM_With_DataProvider {
 WebDriver driver;
 By username = By.id("username");
 By password = By.id("password");
 By loginBtn = By.id("login");

 public Example_of_POM_With_DataProvider(WebDriver driver) {
     this.driver = driver;
 }

 public void login(String user, String pass) {
     driver.findElement(username).sendKeys(user);
     driver.findElement(password).sendKeys(pass);
     driver.findElement(loginBtn).click();
 }
}

//Test Class with DataProvider
public class LoginTest {
 WebDriver driver;
 Example_of_POM_With_DataProvider loginPage;

 @BeforeMethod
 public void setup() {
     driver = new ChromeDriver();
     driver.get("https://example.com");
     loginPage = new Example_of_POM_With_DataProvider(driver);
 }

 @DataProvider(name="loginData")
 public Object[][] getData() {
     return new Object[][] {
         {"user1", "pass1"},
         {"user2", "pass2"}
     };
 }

 @Test(dataProvider="loginData")
 public void testLogin(String user, String pass) {
     loginPage.login(user, pass);
     // Add assertions here
 }

 @AfterMethod
 public void tearDown() {
     driver.quit();
 }
}

