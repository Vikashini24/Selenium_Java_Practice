package seleniumFields;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement friendsCheckbox = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		friendsCheckbox.click();
		System.out.println(friendsCheckbox.isSelected());
		
		List<WebElement> checkboxSize = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Size of checkbox: " + checkboxSize.size());
		
		driver.quit();
		
	}

}
