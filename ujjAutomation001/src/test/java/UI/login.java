package UI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		//System.setProperty(null, null);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		

		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.saucedemo.com");
	     //waitForSeconds(15);
		 Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys(new CharSequence[] {"standard_user"});
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(new CharSequence[] {"secret_sauce"});
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		driver.close();
	}

	private static void waitForSeconds(int i) {
		// TODO Auto-generated method stub
		
	}

}
