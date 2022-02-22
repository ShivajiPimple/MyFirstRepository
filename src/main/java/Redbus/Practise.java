package Redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise 

{
  public static void main(String[] args) throws InterruptedException 
  {
	System.setProperty("webdriver.chrome.driver", "H:\\New folder\\Shivaji Automation\\AUTOMATION SEKE\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver ();
	
	driver.get("https://www.makemytrip.com/");
	
	driver.manage().window().maximize();
	
	String curretnURL= driver.getCurrentUrl();
	System.out.println(curretnURL);
	
	//String pagesource= driver.getPageSource();
	//System.out.println(pagesource);
	
	String getTitle= driver.getTitle();
	System.out.println(getTitle);
	
	//int count=driver.findElements(By.linkText("myTrips")).size();
	//System.out.println(count);
	
	driver.findElement(By.xpath("//span[@class='switcherDownArrow appendLeft10']")).click();
	WebElement select_duration= driver.findElement(By.xpath("//p[@class='selectConInput']"));
	
	Thread.sleep(2500);
	Select s= new Select(select_duration);
	s.selectByIndex(2);
	
	String dropdown_val=select_duration.getText();  // helps in finding text in dropdown
	System.out.println(dropdown_val);
	
	
	
	
	driver.close();
	
	
 }
}
