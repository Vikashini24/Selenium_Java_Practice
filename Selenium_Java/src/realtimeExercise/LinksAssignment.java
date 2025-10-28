package realtimeExercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LinksAssignment {

	public static void main(String[] args) {
		
		//1. Select any checkbox and grab the label of the selected checkox
		//2. Dropdown --> Select the option same as selected checkbox (do not hardcode)
		//3. Alert --> enter the grabed label and enter in the alert textbox
		//4. Click alert and verify the text present same as the grabed label
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement checkbox = driver.findElement(By.id("checkBoxOption2"));
		checkbox.click();
		String checkboxName = checkbox.getDomAttribute("value");
		System.out.println(checkboxName);
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select field = new Select(dropdown);
		field.selectByValue(checkboxName);
		
		driver.findElement(By.id("name")).sendKeys(checkboxName);
		driver.findElement(By.id("alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		if(alertText.contains(checkboxName)) {
			Assert.assertTrue(true);
		}
		driver.switchTo().alert().accept();
		
		driver.quit();
		
	}

}
