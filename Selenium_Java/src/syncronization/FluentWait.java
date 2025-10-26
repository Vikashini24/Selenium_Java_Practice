package syncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.cssSelector("#start button")).click();
		
		// fluent wait
		//FluentWait<WebDriver> wait = new FluentWait<>(driver)
		
		System.out.println(driver.findElement(By.id("finish")).getText());
		
		
	}

}

// yet to complete