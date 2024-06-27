package othoba;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver","H:\\All about selenium\\edgedriver_win64\\msedgedriver.exe");
		
		EdgeDriver driver =  new EdgeDriver();
		driver.get("https://www.othoba.com/");
		driver.manage().window().maximize();
		
		WebElement imgElement = driver.findElement(By.cssSelector("img[data-src='https://images.othoba.com/images/thumbs/0656379_pharmacy_120.jpeg']"));

        // Click on the image
        imgElement.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        
        
        WebElement imgElement1 = driver.findElement(By.id("cataloglist_prductid2_250533"));

        // Click on the image
        imgElement1.click();
        
        
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button-250533"));

        // Click on the "Add to Cart" button
        addToCartButton.click();
        
        
        
        // Find the input field by ID
        WebElement phoneInput = driver.findElement(By.id("customerPhone"));

        // Enter phone number into the input field
        phoneInput.sendKeys("01666666666");

        // Example: Simulate pressing Enter key (replace with your logic)
        phoneInput.sendKeys(Keys.ENTER);
        
        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
        submitButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        
        System.out.println("Cart Test Successful"); 
        
       
	}

}
