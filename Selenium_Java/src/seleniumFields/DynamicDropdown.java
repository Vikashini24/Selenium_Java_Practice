package seleniumFields;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement departureCity = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		departureCity.click();
		driver.findElement(By.xpath("//a[@value='CJB']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']")).click();
		
		
	}

}
