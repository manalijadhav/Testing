package in.lnt.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oracle {

	public static void main(String [] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:18171265718319093144::NO:::");
	driver.findElement(By.id("P11_USERNAME")).sendKeys("sys");
	driver.findElement(By.name("p_t02")).sendKeys("Newuser123");
	driver.findElement(By.xpath("/html/body/form/div[6]/table/tbody/tr/td[3]/table[2]/tbody/tr/td/input[1]")).click();
	driver.findElement(By.linkText("Logout")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.quit();
	
	}
}
