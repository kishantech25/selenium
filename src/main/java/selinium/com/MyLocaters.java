package selinium.com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import okio.Timeout;

public class MyLocaters {

	public static void main(String[] args) throws InterruptedException {
		

        System.setProperty("webdriver.chrome.driver", "C:/Users/KISHANTECH/Downloads/banking-app/chromeDrivers/chromedriver-win64/chromedriver.exe");

         WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(5L,TimeUnit.SECONDS);
         driver.get("https://rahulshettyacademy.com/locatorspractice/");
         
         driver.findElement(By.id("inputUsername")).sendKeys("rahul");
         //<input type="password" placeholder="Password" name="inputPassword" value="">
         //XPath of above code is    //input[@placeholder='Password']
         driver.findElement(By.name("inputPassword")).sendKeys("welcome");
            
         //<button class="submit signInBtn" type="submit">Sign In</button>
         driver.findElement(By.className("signInBtn")).click();
          //p.error
       //  driver.findElement(By.cssSelector("p[class='error']")).getText();
     
         System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
         //<a href="#">Forgot your password?</a>
         //Xpath can write  //div[contains(@class,'pwd')]
         driver.findElement(By.linkText("Forgot your password?")).click();
         Thread.sleep(2000);
         //<input type="text" placeholder="Name">
         //XPath of above code     //input[@placeholder='Name']
         driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
         
         //<input type="text" placeholder="Email">
         //Xpath of above code  //input[@placeholder='Email']
         driver.findElement(By.cssSelector("//input[@placeholder='Email']")).sendKeys("kishan@gmail.com");
      //   driver.findElement(By.cssSelector("//input[@placeholder='Email']")).clear();
         
//         
//         //<input type="text" placeholder="Phone Number">
//         //Xpath of above code   //input[@placeholder='Phone Number']
//          
//         driver.findElement(By.xpath("input[@placeholder='Phone Number']")).sendKeys("9341951667");
         
         
         
         
	}
}
