package selinium.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		String[] list = { "Cucumber", "Brocolli", "String", "Cauliflower", "Beetroot", "Carrot", "Tomato" };
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/KISHANTECH/Downloads/banking-app/chromeDrivers/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		WebDriverWait driverwait= new WebDriverWait(driver, 5);

		addItems(driver, list);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driverwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		// <input type="text" class="promoCode" placeholder="Enter promo code">
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		// <button class="promoBtn">Apply</button>
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//explicit wait
		WebDriverWait webDriverwait1=new WebDriverWait(driver, 5);
		webDriverwait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
         System.out.println("");
	}

	public static void addItems(WebDriver driver, String[] itemNeeded) {
		List<String> itemNeededList = Arrays.asList(itemNeeded);

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			WebElement webElement = products.get(i);
			String name = webElement.getText();
			String[] array = name.split("-");
			String formatedValue = array[0].trim();

			System.out.println(formatedValue);
			if (itemNeededList.contains(formatedValue)) {
				// click on Add to Cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (i == 6) {
					break;
				}
			}
		}
	}
}
