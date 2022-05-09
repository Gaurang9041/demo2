package java_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextboxPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();  //open firefox
		driver.get("https://www.amazon.ca/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");
		String s=driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");
		System.out.println(s);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
