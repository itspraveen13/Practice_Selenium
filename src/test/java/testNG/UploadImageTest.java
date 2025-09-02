package testNG;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UploadImageTest {
    WebDriver driver;
    
    @BeforeClass
    public void setup() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.remove.bg/uploads");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    
    @Test
    public void testImageUpload() {
        // 1. Locate hidden <input type="file">
        WebElement uploadInput = driver.findElement(By.xpath("//button[.='Upload Image']"));
        
        // 2. Provide file path directly (NO click!)
        File file = new File("\"C:\\Users\\keert\\eclipse-workspace\\Practice_Selenium\\Test-Data\\car.jpg\"");
        uploadInput.sendKeys(file.getAbsolutePath());
        
        // 3. Validate that preview image or result appears
        WebElement preview = driver.findElement(By.xpath("//img[contains(@src,'car')]"));
        Assert.assertTrue(preview.isDisplayed(), "Image upload failed - preview not visible!");
    }
    
    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
