package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.className("cart-icon")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
		
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.className("promoBtn")).click();
		//explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		String promoInfo = driver.findElement(By.className("promoInfo")).getText();
		System.out.println(promoInfo);
		
		driver.quit();
		
	}

}

/*
 * pros - wait is applied only at targeted elements. So no more performance issue
 * cons - more code
 */
