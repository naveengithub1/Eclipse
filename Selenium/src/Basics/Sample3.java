package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Naveen\\\\\\\\eclipse-workspace\\\\\\\\Selenium\\\\\\\\driver\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		WebElement location = driver.findElement(By.id("location"));
		location.sendKeys("madurai");
		
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
		Thread.sleep(5000);
		WebElement login = driver.findElement(By.name("username"));
		login.sendKeys("travel__panda");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("123456");
		WebElement findElement = driver.findElement(By.xpath("//div[text()='Log In']"));
		findElement.click();
		
	}
}
		