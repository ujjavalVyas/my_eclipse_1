package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class auto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com");
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(new CharSequence[] {"phone"});
		driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]")).click();

	}

}
