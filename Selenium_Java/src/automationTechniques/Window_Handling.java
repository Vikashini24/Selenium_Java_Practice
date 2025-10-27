package automationTechniques;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Window_Handling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		// window handling
		Set<String> windows = driver.getWindowHandles(); //parent child windows
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		//switch to child window
		driver.switchTo().window(childId);
		//call method
		Window_Handling wh = new Window_Handling();
		String emailReturned = wh.email(driver);
		
		//switch back to parent window
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailReturned);
		
		driver.quit();
		
	}
	
	public String email(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".im-para.red")));
		String getEmail = driver.findElement(By.cssSelector(".im-para.red")).getText();
		//Please email us at mentor@rahulshettyacademy.com with below template to receive response
		String email = getEmail.split("at ")[1].split(" with")[0];
		System.out.println(email);
		//driver.close();
		return email;
	}

}
