package java_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignupPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
				driver.get("https://www.facebook.com/");
				
				driver.findElement(By.linkText("Create New Account")).click();
				Thread.sleep(4000);
				
				driver.findElement(By.name("firstname")).sendKeys("rakesh");
				driver.findElement(By.name("lastname")).sendKeys("shah");
				driver.findElement(By.name("reg_email__")).sendKeys("hgdfxdxzs");
				driver.findElement(By.name("reg_passwd__")).sendKeys("abca123");
				
				WebElement month=driver.findElement(By.id("month"));
				Select m=new Select(month);
				m.selectByValue("7");
				Thread.sleep(2000);
				
				WebElement day=driver.findElement(By.id("day"));
				Select d=new Select(day);
				d.selectByIndex(12);
				Thread.sleep(2000);
				
				WebElement year=driver.findElement(By.id("year"));
				Select y=new Select(year);
				y.selectByVisibleText("2000");
				Thread.sleep(2000);
				
				List<WebElement> radio= driver.findElements(By.xpath("//span[@data-name='gender_wrapper']/span"));
				radio.get(1).click();
						System.out.println(radio.get(1).getText());
					
				
				Thread.sleep(2000);
				
				driver.findElement(By.name("websubmit")).click();
				
				System.out.println("Account created successfully");

	}

}
