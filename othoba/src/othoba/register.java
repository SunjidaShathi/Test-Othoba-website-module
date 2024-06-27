package othoba;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver","H:\\All about selenium\\edgedriver_win64\\msedgedriver.exe");
		
		EdgeDriver driver =  new EdgeDriver();
		driver.get("https://www.othoba.com/");
		driver.manage().window().maximize();
		
	
		driver.findElement(By.linkText("Register")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		driver.findElement(By.name("Phone")).sendKeys("01666666666");
	    WebElement genderMaleLabel = driver.findElement(By.cssSelector("label[for='gender-Male']"));
        genderMaleLabel.click();  // or genderFemaleLabel.click() for female
        driver.findElement(By.name("FirstName")).sendKeys("Byeon Woo");
		driver.findElement(By.name("LastName")).sendKeys("Seok");
		
		
		
		 // Select date of birth
        Select dayDropdown = new Select(driver.findElement(By.name("DateOfBirthDay")));
        Select monthDropdown = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        Select yearDropdown = new Select(driver.findElement(By.name("DateOfBirthYear")));
        
        dayDropdown.selectByValue("10");
        monthDropdown.selectByValue("8");  
        yearDropdown.selectByValue("2001");
        
        WebElement password = driver.findElement(By.id("Password"));
        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        password.sendKeys("Test@1234");
        confirmPassword.sendKeys("Test@1234");
        
        
        driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 
		 
		 
		System.out.println("Register Test Successful"); 

	}

}
