package automationTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame("frame-top").switchTo().frame("frame-middle");
		//driver.switchTo().frame("frame-middle");
		
		WebElement text = driver.findElement(By.id("content"));
		System.out.println(text.getText());
		
	}

}
