package automationTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		//driver.findElement(By.className("a-button-text")).click();
		
		Actions action = new Actions(driver);
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("books").doubleClick().build().perform();
		
		WebElement accounts = driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(accounts).contextClick().build().perform();
		
	}

}
 
// build --> ready to execute
// perform --> now it will execute