package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumXpathLocator extends BrowserInitialization{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SeleniumXpathLocator xpathl = new  SeleniumXpathLocator();
		 xpathl.initializeBrowser();
		 //xpathl.basicXPath();
		 //xpathl.xPathAndOrIndex();
		 xpathl.xPathAxesHandling(); 
	}
	
	public void basicXPath() {
		System.out.println("Checkbox Demo");
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkboxmenu= driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		checkboxmenu.click();
	}
	
	
	public void containsXPath() {
		// 2. match part of an attribute , //input[contains(@id,'user')]
	WebElement singlecheckbox= driver.findElement(By.xpath("//input[contains(@id,'gridCheck')]"));
	singlecheckbox.click();
	//Match partial visible text
	WebElement singlecheckboxdeselect = driver.findElement(By.xpath("//label[contains(text(),'Click on this check box')]"));
	singlecheckboxdeselect.click();
	//text , start-with , normalize-space
	//WebElement multiCheckBoxOne = driver.findElement(By.xpath("//button[normalize-space(text()='Show Message')]")); //match exact text
	//multiCheckBoxOne.click();
	}
	
	public void xPathAndOrIndex() {
		//input[@type="checkbox"])[3] >> Use parentheses () around the entire XPath expression before adding the index [3].
		WebElement checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		checkbox2.click();
		WebElement checkbox3=driver.findElement(By.xpath("(//input[@type=\"checkbox\" and @class=\"check-box-list\"])[2]"));
		checkbox3.click();
	}
	
	public void xPathAxesHandling() {
	//parent,child,following, preceding , descendant , ancestor
		// 1.preceding : The element returned by an XPath depends on the tag specified at the end of the expression;
	driver.get("https://selenium.qabible.in/radio-button-demo.php");
	WebElement radioButton1 = driver.findElement(By.xpath("//input[@name=\"inlineRadioOptions\"]//preceding::label[contains(text(),\"Male\")]"));
	radioButton1.click();
	
	
}
	
}

