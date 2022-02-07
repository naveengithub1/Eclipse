package Basics;

import java.awt.AWTException;import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Color {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Naveen\\\\\\\\eclipse-workspace\\\\\\\\Selenium\\\\\\\\driver\\\\\\\\chromedriver.exe");
			
			 WebDriver driver = new ChromeDriver();
			 
			 driver.get("https://www.facebook.com/");
			 driver.manage().window().maximize();
			 
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 
			 WebElement btn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
			js.executeScript("arguments[0].setAttribute('style','background:black;font-size:25px')", btn);
			 

}
}