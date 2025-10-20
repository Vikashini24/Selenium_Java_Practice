package seleniumFields;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownLoop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement passengers = driver.findElement(By.id("divpaxinfo"));
		passengers.click();
		WebElement adult = driver.findElement(By.id("hrefIncAdt"));
		for(int i=1; i<=4; i++) {
			adult.click();
		}
		WebElement child = driver.findElement(By.id("hrefIncChd"));
		for(int j=0; j<3; j++) {
			child.click();
		}
		WebElement infant = driver.findElement(By.id("hrefIncInf"));
		infant.click();
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.quit();
		
	}

}
