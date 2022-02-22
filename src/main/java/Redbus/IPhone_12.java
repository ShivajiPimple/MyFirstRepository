package Redbus;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPhone_12 
{
  public static void main(String[] args) throws InterruptedException 
  {
	System.setProperty("webdriver.chrome.driver", "H:\\New folder\\Shivaji Automation\\AUTOMATION SEKE\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(3000);
	
	
	
	driver.findElement(By.linkText("Login")).click();
	Thread.sleep(2500);
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8104506322");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Shiva@7342");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Mobiles")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys(" iPhone 12");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	Thread.sleep(3000);
	
	/*String name= driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).getText();
	System.out.println("Product Name:"+name);
	String Price= driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
	System.out.println("Price of Product:"+Price);
	Thread.sleep(3000); */
	String Parent=driver.getWindowHandle();
	System.out.println(Parent);
	
	Set<String> s=driver.getWindowHandles();
	System.out.println(s);
	
	for(String x:s)
	{
		driver.switchTo().window(x).getTitle().contains(Parent);
	}
	Thread.sleep(2000);
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	//WebElement Element=driver.findElement(By.linkText("Enter Delivery Pincode"));
	js.executeScript("window.scrollBy(0,500)", "");
	Thread.sleep(4000);
	driver.findElement(By.id("pincodeInputId")).sendKeys("421503");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	Thread.sleep(3000);
	driver.switchTo().window(Parent);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@class='_3SkBxJ']")).click();
	Thread.sleep(4000);
	String Amount=driver.findElement(By.xpath("//div[@class='Ob17DV _3X7Jj1']")).getText();
	System.out.println("Total Amount:"+Amount);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l RLM7ES _3AWRsL']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _1seccl _3AWRsL']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='_1aULyb'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='_1XFPmK'])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='_1XFPmK'])[4]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _3JboYb _3AWRsL']")).click();
	Thread.sleep(20000);
	
	driver.quit();
	
  }
}

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
