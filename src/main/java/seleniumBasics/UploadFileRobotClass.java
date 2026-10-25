package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileRobotClass {
WebDriver driver;
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		UploadFileRobotClass upld =new UploadFileRobotClass ();
		upld.fileupload();
	}

	public void fileupload() throws AWTException {
		driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php?utm_source");
		
		WebElement choosefile=driver.findElement(By.xpath("//input[@id=\'uploadFile\']"));
		choosefile.click();
		StringSelection select =new StringSelection("C:\\Users\\anuth\\eclipse-workspace\\obTesting\\src\\test\\resources\\resources\\uploadfile.docx");
 	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);
 	    Robot robot = new Robot();
 	    robot.delay(500);
 	    robot.keyPress(KeyEvent.VK_CONTROL);
 	    robot.keyPress(KeyEvent.VK_V);
 	    robot.keyRelease(KeyEvent.VK_CONTROL);
 	    robot.keyRelease(KeyEvent.VK_V);
 	    robot.keyPress(KeyEvent.VK_ENTER );
 	    robot.keyRelease(KeyEvent.VK_ENTER );
 	    
	}}
