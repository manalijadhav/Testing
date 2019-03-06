package in.lnt.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript 
{
	public static void main(String [] args) throws Exception
	{
		
		/*WebDriver is interface FirefoxDriver,ChromeDriver
		OperaDriver are Classes which are implemented
		WebDriver
		*/
		
		
		/*FirefoxDriver driver=new FirefoxDriver();
		CHild c=new CHild()
		*/
System.setProperty
("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//Parent p=new CHild()   >> COmmon methods or function will  be visible
//no Chance of calling child specific function 
		
driver.get("https://www.seleniumhq.org/") ;   // URL must start with http
driver.findElement(By.linkText("Download")).click();   
String title=driver.getTitle(); // Getting current page title
System.out.println("I am on "+title +" Page");
driver.findElement(By.name("q")).sendKeys("LNT");
Thread.sleep(3000);
driver.quit();  //For CLosing Browser
	}
}