package seleniumFields;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> dropdowns = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		for (WebElement dropdown : dropdowns) {
			if(dropdown.getText().equalsIgnoreCase("india")) {
				dropdown.click();
				break;
			}
		}
		driver.quit();
		
	}

}
