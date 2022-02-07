package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowwww {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iphone");
		WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
		searchbtn.click();
		WebElement xr = driver.findElement(By.xpath("(//span[text()='Apple iPhone XR (64GB) - White'])[1]"));
		xr.click();
		Thread.sleep(2000);
		WebElement iphone12pro = driver.findElement(By.xpath("(//span[text()='New Apple iPhone 12 Pro (128GB) - Graphite'])[1]"));
		iphone12pro.click();
		Thread.sleep(2000);
		WebElement iphone11 = driver.findElement(By.xpath("//span[text()='Apple iPhone XR (128GB) - (Product) RED']"));
		iphone11.click();
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		List<String> li = new ArrayList<>();
		li.addAll(allwindows);
		Thread.sleep(3000);
		driver.switchTo().window(li.get(1));
		WebElement buy = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		buy.click();
		
		
		
		
		
        
	}


}
