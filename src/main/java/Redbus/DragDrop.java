package Redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop 
{
 public static void main(String[] args) throws InterruptedException 
 {
	System.setProperty("webdriver.chrome.driver", "H:\\New folder\\Shivaji Automation\\AUTOMATION SEKE\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://demoqa.com/droppable");
	
	WebElement drag= driver.findElement(By.id("draggable"));
	WebElement drop= driver.findElement(By.id("droppable"));
	
	Thread.sleep(3000);
	
	Actions a= new Actions(driver);
	a.dragAndDrop(drag, drop).build().perform();
	
	Thread.sleep(5000);
	
	driver.findElement(By.id("droppableExample-tab-accept")).sendKeys(Keys.ENTER);
	
	Thread.sleep(3000);
	
	
	//driver.get("https://the-internet.herokuapp.com/drag_and_drop");
	
	/*WebElement drag = driver.findElement(By.id("column-a"));
	WebElement drop = driver.findElement(By.id("column-b"));
	Thread.sleep(3000);
	Actions a= new Actions(driver);
	a.dragAndDrop(drag, drop).build().perform();
	Thread.sleep(3000); */
	
	driver.close();
	
	
 }
}
