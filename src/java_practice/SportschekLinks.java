package java_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SportschekLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();  //open firefox
		driver.get("https://www.sportchek.ca/"); 
		
		driver.findElement(By.linkText("Jerseys & Fan Wear")).click();
		Thread.sleep(2000);
		
		List<WebElement>links=driver.findElements(By.xpath("//div[@class='page-nav__flyout expanded']/div[4]/ul/li"));
		
		System.out.println(links.size());
		for(WebElement a:links) {
			System.out.println(a.getText());
		}
		
		

	}

}
