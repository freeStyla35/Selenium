import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.dice.com");
		driver.get("https://www.indeed.com");
		driver.navigate().back();
		String title = driver.getTitle();
		String url   = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		driver.navigate().forward();
		driver.close();
		driver.quit();

	}

}
