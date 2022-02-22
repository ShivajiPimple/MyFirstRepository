package Redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaurkiCom 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\New folder\\Shivaji Automation\\AUTOMATION SEKE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		String CurrentTitle= driver.getTitle();
		System.out.println(CurrentTitle);
		
		String Title=driver.findElement(By.xpath("(//img[@data-ga-track='Naukri Logo|Naukri Logo'])[1]")).getText();
		System.out.println(Title);
		
		String parent= driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.linkText("Jobs")).click();
		Thread.sleep(2500);
		
		driver.close();
		
	}
}
