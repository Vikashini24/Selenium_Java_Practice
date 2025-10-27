package automationTechniques;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAssignmet {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterateWindow = windows.iterator();
		String parentWindow = iterateWindow.next();
		String childWindow = iterateWindow.next();
		
		//switch to child window
		driver.switchTo().window(childWindow);
		
		String childText = driver.findElement(By.cssSelector(".example h3")).getText();
		System.out.println("String from child window: " + childText);
		//driver.close();
		
		//switch to parent window
		driver.switchTo().window(parentWindow);
		String parentText = driver.findElement(By.cssSelector("#content div h3")).getText();
		System.out.println("String from parent window: " + parentText);
		
		driver.quit();
		
	}

}
