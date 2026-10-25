package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserInitialization {
	public WebDriver driver ;
	public static void main(String args[]) {
		BrowserInitialization B=new BrowserInitialization();
		B.initializeBrowser();
		
	}
	public void initializeBrowser() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in");
		
	
	    // Set implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Set browser window size
		// driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(1366,768));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Testing"));
	}
	/*public void quitBrowseraftermethod()
	{
		driver.quit();
	} */
}