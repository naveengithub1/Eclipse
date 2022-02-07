package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Naveen\\\\\\\\eclipse-workspace\\\\\\\\Selenium\\\\\\\\driver\\\\\\\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtemail = driver.findElement(By.id("email"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executescript("arguements[0].setAttribute('value','key')"
		js.executeScript("arguments[0].setAttribute('value','naveen123@gmail.com')", txtemail);
		Object o = js.executeScript("return arguments[0].getAttribute('value',)", txtemail);
		System.out.println(o);
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", btnlogin);
		
		
		
		
		
		
		
		
		
		
	}
}