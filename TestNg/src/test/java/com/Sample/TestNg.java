package com.Sample;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseClass;

public class TestNg extends BaseClass {
	
	@BeforeClass
	private void browserlaunch() {
		browserLaunch();
		maximum();
	}
	
@AfterClass
private void CloseBrowser() {
	close();

}
@Test
private void Tc1() {
	url("https://www.facebook.com/");
	textfill(driver.findElement(By.id("email")), "naveen123");
	btnclick(driver.findElement(By.name("login")));
}
@Test
private void Tc2() {
	textfill(driver.findElement(By.id("email")), "kumar123");
	btnclick(driver.findElement(By.name("login")));
	

}
@Test
private void Tc3() {
	textfill(driver.findElement(By.id("email")), "Udhaya456");
	btnclick(driver.findElement(By.name("login")));
	
}
}