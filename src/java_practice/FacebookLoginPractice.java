package java_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
				driver.get("https://www.facebook.com/");
				driver.findElement(By.id("email")).sendKeys("efwhfweuyfgy");
				String a=driver.findElement(By.id("email")).getAttribute("placeholder");
				System.out.println(a);
				
				String s=driver.findElement(By.id("email")).getAttribute("value");
				System.out.println(s);
					
	}

}
