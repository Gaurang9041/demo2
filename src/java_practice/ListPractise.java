package java_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListPractise {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		
		driver.findElement(By.id("aboutArrow")).click();
		
		List<WebElement> options= driver.findElements(By.xpath("//ul[@id='aboutSubnav']/div/a"));
		System.out.println(options.size());
		
		for(WebElement a:options) {
			System.out.println(a.getText());
		}

	}

}
