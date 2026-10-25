package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseKeyboardActions extends BrowserInitialization {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseKeyboardActions mk = new MouseKeyboardActions();
		mk.initializeBrowser();
		// mk.keyBoardActions();
		mk.mouseActions();
	}

	public void keyBoardActions() {
		driver.get("https://selenium.qabible.in/form-submit.php");
		WebElement firstName = driver.findElement(By.xpath("//input[@id=\"validationCustom01\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(firstName).click().perform();
		action.keyDown(Keys.SHIFT).sendKeys("anumol").keyUp(Keys.SHIFT).perform(); // Actions class are executed only
																					// when you call perform().
	}

	public void mouseActions() {
		driver.get("https://selenium.qabible.in/drag-drop.php");
		WebElement source = driver.findElement(By.xpath("//span[contains(text(),\'Draggable n°1\')]"));
		WebElement destination = driver.findElement(By.xpath("//div[@dropzone='move']"));
		Actions action = new Actions(driver);
		action.moveToElement(source).click().perform();
		action.dragAndDrop(source, destination).build().perform();
		// action.doubleClick();
		// action.contextClick();
	}

}
