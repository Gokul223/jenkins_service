package salesforce.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void runLogin() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String name= "gokul.sekar@testleaf.com";
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys("Leaf$123");
		driver.findElement(By.id("Login")).click();
		driver.quit(); 
		 
	}
	
}
