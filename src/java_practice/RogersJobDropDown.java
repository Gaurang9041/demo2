package java_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RogersJobDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();  //open firefox
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		
		List<WebElement> cols= driver.findElements(By.xpath("//table[@id='customers']//tr[1]/th"));
		System.out.println(cols.size());
	}

}
