package in.lnt.day1;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String [] args) 
	{
				
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.blazedemo.com/");
		
		Select select=new Select(driver.findElement(By.name("fromPort")));
		//select.selectByVisibleText("Portland");
		//select.selectByIndex(6);
		select.selectByValue("Boston");
		System.out.println(driver.findElement(By.name("fromPort")).getText());
		List<WebElement> ls=	select.getOptions();
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i).getText());
		}
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Rome");
		driver.findElement(By.cssSelector("input[value='Find Flights']")).click();
		driver.findElement(By.cssSelector("input[value='Choose This Flight']")).click();

/*List<WebElement> all=driver.findElements(By.cssSelector("input[value='Choose This Flight']"));
all.get(4).click();	*/	
		
	
	
	
	
	}
}
