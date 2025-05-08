package selinium.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locaters2 {

	public static void main(String[] args) {
	

		  System.setProperty("webdriver.chrome.driver", "C:/Users/KISHANTECH/Downloads/banking-app/chromeDrivers/chromedriver-win64/chromedriver.exe");

	         WebDriver driver = new ChromeDriver();
	         driver.manage().timeouts().implicitlyWait(5L,TimeUnit.SECONDS);
	         driver.get("https://rahulshettyacademy.com/locatorspractice/");
	         
       driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
   
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	}
}
