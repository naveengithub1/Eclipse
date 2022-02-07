package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public static void url(String url) {
		driver.get(url);

	}
	
	public static void maximum() {
		driver.manage().window().maximize();
		

	}

	public static void close() {
		driver.quit();

	}
	public static void textfill(WebElement element, String text) {
		element.sendKeys(text);

	}
	
	public static void btnclick(WebElement element) {
		element.click();

	}
}

	

