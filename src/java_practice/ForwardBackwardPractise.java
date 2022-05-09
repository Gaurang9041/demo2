package java_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForwardBackwardPractise {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.ca/");
		System.out.println(driver.getTitle());

		
		driver.findElement(By.linkText("Store")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		

	}

}
