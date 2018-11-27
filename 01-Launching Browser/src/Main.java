import org.openqa.selenium.chrome.ChromeDriver;
//the class is in another package => import


public class Main {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/cihan/Selenium/chromedriver");
		
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver(); 
		
		
// for Firefox; (same for IE, just write InternetExplorerDriver)
		//System.setProperty("webdriver.gecko.driver", "../geckodriver");
		//FirefoxDriver driver = new FirefoxDriver(); 
		
		
		driver.get("https://www.amazon.com");
		driver.close();
		driver.quit();
		
		
		
	}

}
