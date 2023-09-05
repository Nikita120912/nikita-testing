import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Desktop\\chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
	
		//driver1 = new ChromeDriver(options);

		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.clear();
		usernameField.sendKeys("admin");
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.clear();
		passwordField.sendKeys("Test@123");
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
	    loginButton.click();
	    WebElement icon = driver.findElement(By.xpath("//span[contains(@class, 'app-icon')]"));
	    icon.click();
	  
	    WebElement wb = driver.findElement(By.xpath("//span[contains(@class, 'app-icon-list fa fa-users')]")); 
	    Actions act =new Actions (driver); 
	    act.moveToElement(wb).build().perform();
	    WebElement wp =driver.findElement(By.xpath("//*[@id='mCSB_1_container']/li[2]/a"));	  
	    
	    wp.click();
	    
	    WebElement Add = driver.findElement(By.xpath("//button[contains(text(),'Add Lead')]"));
	    Add.click();
	    	}



	}
		

		
	


	
