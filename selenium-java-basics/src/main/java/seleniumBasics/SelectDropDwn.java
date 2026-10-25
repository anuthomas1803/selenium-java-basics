package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDwn {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectDropDwn sr = new SelectDropDwn();
		sr.dropdownSelection();

	}
	public void dropdownSelection() {
		 driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		WebElement dropdown1=driver.findElement(By.xpath("//select[@id=\"single-input-field\"]")); 
		Select sel =new Select(dropdown1);
		
		//sel.selectByIndex(1); //first one in the drop down
		//sel.selectByVisibleText("Green");
		sel.selectByValue("Red");
		WebElement colordisplaymessage =driver.findElement(By.xpath("//div[contains(text(),\"Selected Color : Red\")]"));
		System.out.println("Color displayed : " +colordisplaymessage.isDisplayed());
		
	}

}
