package Basics;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Naveen\\\\\\\\eclipse-workspace\\\\\\\\Selenium\\\\\\\\driver\\\\\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("one plus");
		WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
		searchbtn.click();
		WebElement CharcoalInk = driver.findElement(By.xpath("//span[text()='OnePlus Nord CE 5G (Charcoal Ink, 8GB RAM, 128GB Storage)']"));
		CharcoalInk.click();
		WebElement blue = driver.findElement(By.xpath("//span[text()='OnePlus Nord CE 5G (Blue Void, 8GB RAM, 128GB Storage)']"));
		blue.click();
		WebElement bluetooth = driver.findElement(By.xpath("//span[text()='OnePlus Bullets Bluetooth Wireless Z Bass Edition in Ear Earphones with Mic (Black)']"));
		bluetooth.click();
		WebElement mi = driver.findElement(By.xpath("//span[text()='Mi 11X 5G Cosmic Black 6GB RAM 128GB ROM | SD 870 | DisplayMate A+ rated E4 AMOLED | Upto 18 Months No Cost EMI']"));
		mi.click();
		String parent = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> li = new ArrayList<>();
		li.addAll(windowHandles);
		
		driver.switchTo().window(li.get(4));
		Thread.sleep(5000);
		driver.findElement(By.id("add-to-cart-button")).click();
				
		
		
		
		
		
	
	}
}
 

