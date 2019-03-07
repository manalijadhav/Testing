package Day2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import util.BrowserSetup;

public class dragNdrop
{
	public static void main(String [] args)  
	{
		WebDriver driver=			BrowserSetup.browserStart("firefox","https://jqueryui.com/droppable/");
	Actions action=new Actions(driver);
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	WebElement srcElement=	driver.findElement(By.id("draggable"));
	WebElement desElement=	driver.findElement(By.id("droppable"));	
	action.dragAndDrop(srcElement, desElement).perform();
	
	
	BrowserSetup.getScreenShot("abc");
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
1.Aishwarya
2.Anjali
3.Shivali
4.Chetan
5.SUraj
6.Arzoo
7.Priyanka
8.Akash
9.Ruchika
10.Prachi
11.Vaishnavi


	 * */
	}
}
