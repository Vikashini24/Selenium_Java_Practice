package seleniumFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxWithAssert {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement checkbox = driver.findElement(By.name("checkBoxOption1"));
		checkbox.click();
		Assert.assertTrue(checkbox.isSelected());
		checkbox.click();
		Assert.assertFalse(checkbox.isSelected());
		
		int checkboxCount = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println("Checkbox count: " + checkboxCount);
		
		driver.quit();
		
	}

}
