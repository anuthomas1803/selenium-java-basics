package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base_Class obj = new Base_Class();
		obj.beforeMethod();
		obj.inputForm();
		obj.dropDown();
		// obj.dragNDrop();
		obj.scrollfunction();

		// obj.afterMethod();

	}

	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("http://selenium.qabible.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void dragNDrop() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement w1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id=\'others\']")));
		w1.click();

		WebElement w2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Draggable n°1']")));
		WebElement w3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\'mydropzone\']")));

		Actions act = new Actions(driver);
		act.dragAndDrop(w2, w3);
	}

	public void inputForm() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	}

	public void dropDown() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement inputForm = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='simple-form-demo.php']")));
		inputForm.click();
		WebElement selectInput = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=\"Select Input\"]")));
		selectInput.click();
		WebElement dropDownSelectColours = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id=\'single-input-field\']")));

		Select selObj = new Select(dropDownSelectColours);
		// selObj.selectByIndex(1);
		selObj.selectByValue("Red");
		// selObj.selectByVisibleText("Red");

	}

	public void scrollfunction() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		js.executeScript("window.scrollBy(0,-2000)");

	}

	public void scrollUptoAnElement() // try
	{

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));// "nav-search-submit-button"
		js.executeScript("arguments[0].click();", search);
		search.click();
	}

	public void afterMethod() {
		driver.quit();

	}

}
