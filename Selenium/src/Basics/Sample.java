package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		//Configure the Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		//object creation
		WebDriver driver = new ChromeDriver();
		//launch the browser
		driver.get("https://www.facebook.com/");
		//maximize the page
		driver.manage().window().maximize(); 
		//to get title
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement loginmail = driver.findElement(By.id("email"));
		loginmail.sendKeys("naveenk405@gmail.com");
		
		WebElement passmail = driver.findElement(By.id("pass"));
		passmail.sendKeys("123415648");
		
		//login button
		WebElement findElement3 = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		findElement3.click();
				
		
	
		
		
	}
}
 