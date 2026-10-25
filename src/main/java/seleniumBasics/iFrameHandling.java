package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandling {
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iFrameHandling ifr = new iFrameHandling();
		ifr.handleframe();
	}

	// Switch to the iframe then locate an element inside it, and then click it
	public void handleframe() {
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/nestedframes.php?utm_source=chatgpt.com");
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(iframe1);
		WebElement element = driver.findElement(By.xpath("//a[@class='external-link']"));
		element.click();
		driver.switchTo().defaultContent();
	}
}
