package java_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YouTubeTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.name("search_query")).sendKeys("canada tourism");
		Thread.sleep(1000);
		driver.findElement(By.id("search-icon-legacy")).click();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
	
		
	}

}
