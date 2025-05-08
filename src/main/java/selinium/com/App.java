package selinium.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	
    	
    	String [] urls= {"https://github.com/kishantech25/kishantech25","https://github.com/kishan-hub"};
        
    	//Invoking Browser
    	//chrome -chromeDriver ->Methods
    	//Firefox -FirefoxDriver ->methods
    	//safarti saafarDriver -> methods 
    	//System.setProperties("webdri", null);
    	//System.setProperty("webdriver.chrome.driver", "C:/Users/KISHANTECH/Downloads/banking-app/chromeDriver/chromedriver-win64/chromedriver.exe");
    //	ChromeDriver driver =new ChromeDriver();
    //	driver.get("https://github.com/kishantech25/kishantech25");
    //	String title=driver.getTitle();
    //	System.out.println(title);
    //	System.out.println(driver.getCurrentUrl());
    //	driver.close();
    //	driver.quit();
    	
     	System.setProperty("webdriver.edge.driver", "C:/Users/KISHANTECH/Downloads/banking-app/edgedriver/msedgedriver.exe");
    	WebDriver driver =new EdgeDriver();
    	
    	//Open urls with seperate tabs
//    	for(int i=0;i<urls.length;i++) {
//    		if(i==0) {
//    			driver.get(urls[i]);
//    		}else {
//    			driver.switchTo().newWindow(WindowType.TAB);
//    			driver.get(urls[i]);
//    		}
//    	}
    	//Microsoft Edge
   
    //print all drivers
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    driver.quit();
       
    }
}
