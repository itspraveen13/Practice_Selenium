package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;

	// WebElements with PageFactory
	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "loginBtn")
	WebElement loginButton;

	// Constructor
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Page actions
	public void login(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
	}

}

//🔹 What is Page Factory?
//
//Page Factory is an implementation of the Page Object Model (POM) in Selenium.
//
//It provides a way to initialize web elements using annotations like @FindBy instead of writing driver.findElement() repeatedly.
//
//It improves readability, reusability, and maintainability of automation code.


//🔹 Why Do We Use Page Factory?
//
//Code is cleaner & structured – all locators are kept in one place (the page class).
//
//Easy maintenance – if a locator changes, update only in that page class.
//
//Reusability – one page object can be reused across multiple test cases.
//
//Reduces boilerplate code – no need to write driver.findElement() everywhere.


//🔹 How Page Factory Works
//
//You define web elements in a page class using annotations (@FindBy).
//
//You initialize them using PageFactory.initElements(driver, this).
//
//Selenium creates proxy objects for the elements and only looks them up when needed (lazy initialization).



