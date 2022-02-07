package Basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RoboClass {
	
	public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Naveen\\\\\\\\eclipse-workspace\\\\\\\\Selenium\\\\\\\\driver\\\\\\\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 WebElement login = driver.findElement(By.id("email"));
		 
		 Actions a = new Actions(driver);
		 
		a.sendKeys(login, "Ducati").perform();
		a.doubleClick(login).perform();
		a.contextClick(login).perform();
		
		Robot r = new Robot();
		
		for (int i = 0; i < 3; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
		
		
		
		
		 
		 
		 
		 
		 
		 
			
		}

}
