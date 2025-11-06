package realtimeExercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		String monthNumber = "5";
		String date = "15";
		String year = "2027";
		String[] expectedList = {monthNumber,date,year};
		
		driver.findElement(By.className("react-date-picker__wrapper")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		//driver.findElement(By.xpath("//abbr[@aria-label='September 2025']")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months button")).get(Integer.parseInt(monthNumber)-1).click();
		driver.findElement(By.xpath("//button/abbr[text()='"+date+"']")).click();
		
		List<WebElement> calendar = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0; i<calendar.size(); i++) {
			String getCalendar = calendar.get(i).getDomAttribute("value");
			System.out.println(getCalendar);
			Assert.assertEquals(getCalendar, expectedList[i]);
		}
		
		driver.quit();
		
	}

}
