package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupDown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Naveen\\\\\\\\eclipse-workspace\\\\\\\\Selenium\\\\\\\\driver\\\\\\\\chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	WebElement scrolldown = driver.findElement(By.xpath("//strong[text()='COMPLETE PRACTICAL TRAINING']"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
	
	Thread.sleep(3000);
	
	WebElement scrollup = driver.findElement(By.xpath("//strong[text()='Greens Technology']"));
	js.executeScript("arguments[0].scrollIntoView(false)", scrollup);
	
	
	
	
	
	}
}
