package selinium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExmple {
  
	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:/Users/KISHANTECH/Downloads/banking-app/chromeDrivers/chromedriver-win64/chromedriver.exe");

	       WebDriver driver = new ChromeDriver();
	       //driver.manage().timeouts().implicitlyWait(5L,TimeUnit.SECONDS);
	       driver.get("https://rahulshettyacademy.com/AutomationPractice");
	       //  <label for="bmw">
          // <input id="checkBoxOption1" value="option1" name="checkBoxOption1" type="checkbox"> Option1
          // </label>
	       
	       driver.findElement(By.name("checkBoxOption1")).click();
	       driver.findElement(By.name("checkBoxOption2")).click();
	       driver.findElement(By.name("checkBoxOption3")).click();
	       
	       driver.findElement(By.name("checkBoxOption1")).clear();
	       driver.findElement(By.name("checkBoxOption2")).clear();
	       driver.findElement(By.name("checkBoxOption3")).clear();
	       
	        System.out.println(driver.findElements(By.cssSelector("[id='checkbox-example']")).size());
	}
}
