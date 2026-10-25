package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumLocators extends BrowserInitialization {

	public static void main(String args[]) {
		 SeleniumLocators lct = new SeleniumLocators();
		lct.initializeBrowser();
		lct.idClasslocators();
		lct.cssSelectorlocator();
	}
	
	public void idClasslocators() {
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		WebElement enterMessageid= driver.findElement(By.id("single-input-field"));
		enterMessageid.sendKeys("Hello");
		
		//*[@class="form-control"] :  in DevTool
		WebElement enterMessageclass= driver.findElement(By.className("form-control"));
		enterMessageclass.sendKeys(" " + "Anu");
		
		WebElement showMessage = driver.findElement(By.id("button-one"));
		showMessage.click();
	}
	
	public void cssSelectorlocator() {
		
		//   1.tag#id  : //input[@id="value-a"]
		WebElement enterValueA = driver.findElement(By.cssSelector("input#value-a"));
		enterValueA.sendKeys("1");
		
		//2. tag.class  : //input[@class="form-control"]
		List<WebElement> enterValueB = driver.findElements(By.cssSelector("input.form-control"));
		enterValueB.get(2).sendKeys("2"); // get the 3rd element using cssSelector
		
		//3.tag[attribute=value]
		List<WebElement> getTotal=driver.findElements(By.cssSelector("button[type=button]"));
		getTotal.get(2).click();
	}
}