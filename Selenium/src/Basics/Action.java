package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Naveen\\\\\\\\eclipse-workspace\\\\\\\\Selenium\\\\\\\\driver\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement Courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		 //create object for action
		
		Actions a =  new Actions(driver);
		a.moveToElement(Courses).perform();
		Thread.sleep(4000);
		WebElement oracletraining = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		a.moveToElement(oracletraining).perform();
		Thread.sleep(3000);
		WebElement oracleractraining = driver.findElement(By.xpath("//span[text()='Oracle RAC Training']"));
		a.click(oracleractraining);
		

}

}
