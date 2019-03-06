package in.lnt.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {
	public static void main(String [] args) throws InterruptedException 
	{
				
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wt=new WebDriverWait(driver, 30);
		
		
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	List<WebElement> ls=driver.findElements(By.name("txtUsernameSDSDDD"));
	ls.get(0);	

	
	
	/*	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	driver.findElement(By.name("Submit")).click();
	driver.findElement(By.linkText("Welcome Admin")).click();
	//Thread.sleep(3000);
	wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout111")));

	driver.findElement(By.linkText("Logout")).click();

	*/
	
	
	}
}
