package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Naveen\\\\\\\\eclipse-workspace\\\\\\\\Selenium\\\\\\\\driver\\\\\\\\chromedriver.exe");
			
WebDriver driver = new ChromeDriver();
driver.get("http://demo.guru99.com/test/drag_drop.html");
driver.manage().window().maximize();
WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
Actions a = new Actions(driver);
a.dragAndDrop(source, destination).perform();



}

	
	

}
