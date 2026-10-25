package seleniumBasics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowHandling {
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandling mh = new MultipleWindowHandling();
		//mh.windowHandling();
		mh.windowHandlingByIndex();
	}

	public void windowHandling() {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		// Store the parent handle before opening the child window.
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		System.out.println(driver.getTitle());

		WebElement loginPortal = driver.findElement(By.xpath("//a[@href='/windows/new']"));
		loginPortal.click(); 
		
		// The child window's title might initially be empty if the page hasn't finished
		// loading
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		Set<String> allWindows = driver.getWindowHandles();
		for (String eachwindow : allWindows) {
			if (!eachwindow.equals(parent))
			{
				driver.switchTo().window(eachwindow);
				System.out.println(eachwindow);
				System.out.println(driver.getTitle());
			}
		}}
	
	
	public void windowHandlingByIndex() {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		WebElement loginPortal = driver.findElement(By.xpath("//a[@href='/windows/new']"));
		loginPortal.click(); 
		  WebDriverWait wait = new WebDriverWait(
			        driver, Duration.ofSeconds(10)
			    );
			    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		//Selenium returns window handles as a Set
		Set<String> allWindows=driver.getWindowHandles();
		
		//Creates an ArrayList by copying elements from allWindows for index-based access.
		List<String> windowlist= new ArrayList<>(allWindows); 
		System.out.println("Window 1 :" +windowlist.get(0));
		System.out.println("Title 1  :" +driver.getTitle());
		System.out.println("Window 2 :" +windowlist.get(1));
		System.out.println("Title 2  :" +driver.getTitle());
		
	}
	
}
