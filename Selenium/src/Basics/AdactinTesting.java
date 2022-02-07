package Basics;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AdactinTesting {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
	
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Travelpanda");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Dominar@400");
		WebElement lgnbtn = driver.findElement(By.name("login"));
	    lgnbtn.click();
	    driver.findElement(By.id("location")).sendKeys("Melbourne");
	    driver.findElement(By.id("hotels")).sendKeys("Hotel Sunshine");
	    driver.findElement(By.id("room_type")).sendKeys("Super Deluxe");
	    driver.findElement(By.id("room_nos")).sendKeys("2");
	    Thread.sleep(5000);
	    driver.findElement(By.id("datepick_in")).sendKeys("01/01/2022");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name=\"datepick_in\"]")).sendKeys("05/01/2022");
	    driver.findElement(By.id("adult_room")).sendKeys("2");
	    driver.findElement(By.id("child_room")).sendKeys("0");
	    driver.findElement(By.id("Submit")).click();
	    driver.findElement(By.id("radiobutton_0")).click();
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.id("first_name")).sendKeys("Naveen");
	    driver.findElement(By.id("last_name")).sendKeys("kumar");
	    driver.findElement(By.id("address")).sendKeys("Madurai,India");
	    driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
	    driver.findElement(By.id("cc_type")).sendKeys("American Express");
	    driver.findElement(By.id("cc_exp_month")).sendKeys("August");
	    driver.findElement(By.id("cc_exp_year")).sendKeys("2022");
	    driver.findElement(By.id("cc_cvv")).sendKeys("754");
	    driver.findElement(By.id("book_now")).click();
	    
	    
	    
	
	}
	
}
