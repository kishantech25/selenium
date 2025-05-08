package selinium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver", "C:/Users/KISHANTECH/Downloads/banking-app/chromeDrivers/chromedriver-win64/chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		
		//driver.findElement(By.id("divpaxinfo")).click();
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='SeniorCitizenDiscount']")).isSelected());
		
		System.out.println(driver.findElement(By.cssSelector("input[id='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='SeniorCitizenDiscount']")).isSelected());

	}
}
