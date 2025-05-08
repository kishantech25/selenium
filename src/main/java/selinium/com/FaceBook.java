package selinium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	
	public static void main(String[] args) {
		

		  System.setProperty("webdriver.chrome.driver", "C:/Users/KISHANTECH/Downloads/banking-app/chromeDrivers/chromedriver-win64/chromedriver.exe");

	       WebDriver driver = new ChromeDriver();
	       driver.get("https://facebook.com");
	       driver.findElement(By.xpath("id('email')")).sendKeys("fsfd");
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       
	}

}
