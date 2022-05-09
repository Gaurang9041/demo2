package java_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CicListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();  //open firefox
		
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.get("https://www.hollisterco.com/shop/ca");
		List<WebElement> cicmenu = driver.findElements(By.xpath("//section[@id='flyout-12551']//div[@class='rs-nav__container']//div[@class='rs-nav__cat-container']//div[@class='nav-accordion-items nav-accordion-items--secondary']//div[@class='rs-nav__cat-column regular thin-nav-column']//ul[@class='rs-nav-cat-menu nav-accordion-container--level2']/li"));
		
		System.out.println(cicmenu.size());
		for(int i=0; i<=cicmenu.size(); i++) {
			System.out.println(cicmenu.get(i).getText());
		}
	}

}
