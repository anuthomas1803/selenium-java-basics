package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingAlerts alrt=new HandlingAlerts();
		alrt.driver=new ChromeDriver();
		alrt.driver.get("https://selenium.qabible.in/javascript-alert.php");
		//alrt.simpleAlert();
	    alrt.promptAlert();
		//alrt.confirmationAlert();
	}
	

public void simpleAlert()
{  
	WebElement simpleButton=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	 simpleButton.click();
	driver.switchTo().alert().accept();
}

public void confirmationAlert() 
{
	WebElement confirmationButton=driver.findElement(By.xpath("//div[@class=\"card-body\"]//preceding::button[contains(text(),'Click for Prompt Box')]"));
	confirmationButton.click();
	System.out.println(" Button Displayed= " + confirmationButton.isDisplayed());
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	
}

public void promptAlert()
{
	WebElement promptButton=driver.findElement(By.xpath("//button[contains(text(),\"Click for Prompt Box\")]"));
	promptButton.click();
	driver.switchTo().alert().sendKeys("Okay");
	driver.switchTo().alert().accept();	
	
}

}
