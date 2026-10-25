package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserNavigationCommands extends BrowserInitialization{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserNavigationCommands d = new BrowserNavigationCommands();
		d.initializeBrowser();
		//d.navigationCommands();
		d.browserCommands();
	}

	public void navigationCommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
	}
	
	public void browserCommands() {
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
	}
}