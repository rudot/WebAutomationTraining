package com.rudot.TravelokaTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait =  new WebDriverWait(driver, 15);
		driver.manage().window().setSize(new Dimension(1600,900));
		driver.get("http://www.traveloka.com");
		WebElement header = driver.findElement(By.id("desktop-topbar"));
		wait.until(ExpectedConditions.visibilityOf(header));
		System.out.println("test");
	}

}
