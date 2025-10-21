package seleniumFields;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckEnabledDisabled {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement returnDate = driver.findElement(By.id("Div1"));
		String returnDateAttribute = returnDate.getAttribute("style");
		System.out.println("One way trip: " + returnDateAttribute);
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println("Round trip: " + returnDateAttribute);
		
		if(returnDateAttribute.contains("0.5")) {
			System.out.println("Return date is not enabled");
			Assert.assertTrue(false);
		}
		else if (returnDateAttribute.contains("1")) {
			System.out.println("Return date is enabled");
			Assert.assertTrue(true);
		}
		
		// yet to complete
		
	}

}
