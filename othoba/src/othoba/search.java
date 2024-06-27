package othoba;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","H:\\All about selenium\\edgedriver_win64\\msedgedriver.exe");
		
		EdgeDriver driver =  new EdgeDriver();
		driver.get("https://www.othoba.com/");
		driver.manage().window().maximize();
		
		WebElement searchInput = driver.findElement(By.id("search-input"));

        // Enter search keyword
        searchInput.sendKeys("laptop");

        // Submit the search (using ENTER key)
        searchInput.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	}

}
