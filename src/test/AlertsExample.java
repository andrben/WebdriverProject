package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		WebElement element = driver.findElement(By.id("alertButton"));
		element.click();
		
		Alert obj = driver.switchTo().alert();
		Thread.sleep(2000);
		obj.accept();
		
		
		WebElement element1 = driver.findElement(By.id("confirmButton"));
		
	
		
		JavascriptExecutor objScroll = (JavascriptExecutor) driver;
		objScroll.executeScript("arguments[0].scrollIntoView();", element1);
		
		element1.click();
		
		obj = driver.switchTo().alert();
		Thread.sleep(2000);
		obj.dismiss();
		
		driver.quit();


	}

}
