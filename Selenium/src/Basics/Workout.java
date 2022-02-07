package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class Workout {

	public static void main(String[] args) {
		//Configure the Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		//object creation
		WebDriver driver = new ChromeDriver();
		//launch the browser
		driver.get("https://www.Google.com/");
		//maximize the page
		driver.manage().window().maximize(); 
		driver.findElement(By.className("gb_f")).sendKeys("Madurai"+Keys.ENTER);

	}
}
