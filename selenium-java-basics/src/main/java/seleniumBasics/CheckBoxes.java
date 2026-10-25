package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
	public WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxes cb=new CheckBoxes();
		cb.initializebrowser();
		cb.checkboxhanding();
	}
		public void initializebrowser() {
			 driver = new ChromeDriver();
			 driver.get("https://selenium.qabible.in/check-box-demo.php");
	}
		public void checkboxhanding() {
			List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type=\'checkbox\']"));
			for(WebElement chbox:checkboxes)
			{
				System.out.println("Displayed :" + chbox.isDisplayed());
				System.out.println("Enabled :"+ chbox.isEnabled());
				System.out.println("Selected : " +chbox.isSelected());
				if(chbox.isDisplayed() && chbox.isEnabled() && !chbox.isSelected()) {
					chbox.click();
				}
			}
		}
}
