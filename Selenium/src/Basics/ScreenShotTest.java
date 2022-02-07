package Basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.ThreadSafe;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\Naveen\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\driver\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File ("C:\\Users\\Naveen\\eclipse-workspace\\Selenium\\ScreenShots\\Instagram.png");
		
		
		FileUtils.copyFile(source, destination);		

	}

}
 