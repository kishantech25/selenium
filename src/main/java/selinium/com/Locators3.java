package selinium.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators3 {



public static void main(String[] args) throws InterruptedException {
	

	  System.setProperty("webdriver.chrome.driver", "C:/Users/KISHANTECH/Downloads/banking-app/chromeDrivers/chromedriver-win64/chromedriver.exe");

       WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(5L,TimeUnit.SECONDS);
       driver.get("https://rahulshettyacademy.com/locatorspractice/");
       
       driver.findElement(By.id("inputUsername")).sendKeys("rahul");
       driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
       driver.findElement(By.className("signInBtn")).click();
       Thread.sleep(2000);
       System.out.println(driver.findElement(By.tagName("p")).getText());
       Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
       //<h2>Hello rahul,</h2>
       Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello rahul,");
     //  <button class="logout-btn">Log Out</button>
}













}
