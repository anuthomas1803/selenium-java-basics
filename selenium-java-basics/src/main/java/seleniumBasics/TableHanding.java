package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHanding extends BrowserInitialization{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHanding th = new TableHanding();
		th.initializeBrowser();
		th.driver.get("https://selenium.qabible.in/table-pagination.php");
		
		th.tableHeaderRead();
		th.tableRead();
		th.tableRowRead();
		th.tableColumnRead(); 
		th.tableSearch("Airi Satou");
	}
	
	
	//<td> elements are nested inside <tr> hence, specify tr first
	public void tableHeaderRead() {
		WebElement theader = driver.findElement(By.xpath("//table[@id=\'dtBasicExample\']/thead"));
		 System.out.println(theader.getText());	
	}
	
 public void tableRead() {
	 WebElement table = driver.findElement(By.xpath("//table[@id=\'dtBasicExample\']"));
	 System.out.println(table.getText());
 }
 
 public void tableRowRead() {
	 WebElement tableRow =driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
	 System.out.println(tableRow.getText());
 }
 
public void tableColumnRead() 
{   int count=1;
	List<WebElement> tableColumn =driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
    for(WebElement eachColumn:tableColumn) {
	   System.out.println(count +". " +eachColumn.getText());
	   System.out.println();
	   count++;
}
	}

public void tableSearch(String name) {
	List<WebElement> firstcolumn = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
	for(WebElement element:firstcolumn) {
		if(element.getText().equalsIgnoreCase(name)) {
			System.out.println(name +" Name found");
		}
		
		}
	}
}


