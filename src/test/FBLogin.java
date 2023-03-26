package test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		// step-2: Maximize the browser

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("abc@xyz.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("password");

		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();

		/* driver.close(); */

	}

}
