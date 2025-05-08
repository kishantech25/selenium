package selinium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/KISHANTECH/Downloads/banking-app/chromeDrivers/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5L,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		// <input id="checkBoxOption1" value="option1" name="checkBoxOption1"
		// type="checkbox">
		driver.findElement(By.id("name")).sendKeys("Kishan Kumar");
		// <input id="alertbtn" class="btn-style" value="Alert" onclick="displayAlert()"
		// type="submit">
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		// <input id="confirmbtn" class="btn-style" value="Confirm"
		// onclick="displayConfirm()" type="submit">
		driver.findElement(By.id("name")).sendKeys("Kishan Kumar");
		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}
}
