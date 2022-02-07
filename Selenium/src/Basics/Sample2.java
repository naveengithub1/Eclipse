package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) {
		
		System.setProperty( "webdriver.chrome.driver", "C:\\\\Users\\\\Naveen\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		
		// object creation
		WebDriver driver = new ChromeDriver();
		
		//Launch the browser
		driver.get("https://www.facebook.com/");
		//maximize
		driver.manage().window().maximize();
		//xpath syntax //tagname[@attribute name='attribute value']
		WebElement findElement = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		findElement.click();
		
		//text syntax //tagname[text()='complete text']
		WebElement findElement2 = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		String text = findElement2.getText();
		System.out.println(text);
		
		
		//contains syntax // tagname[contains(text(),'patial text')]
		WebElement findElement3 = driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]"));
		String attribute = findElement3.getAttribute("data-testid");
		System.out.println(attribute);
		
		
	}
	
}
