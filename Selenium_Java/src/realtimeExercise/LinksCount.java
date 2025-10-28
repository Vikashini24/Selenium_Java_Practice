package realtimeExercise;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LinksCount {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//link counts on the page
		int linkCount = driver.findElements(By.tagName("a")).size();
		System.out.println("Count of the links on this page: " + linkCount);
		Assert.assertEquals(27, linkCount);
		
		//links count from footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		int linkFooter = footerDriver.findElements(By.tagName("a")).size();
		System.out.println("Count of links in the footer section: " + linkFooter);
		
		//links count of 1st column in footer section
		WebElement footerFirstColumn = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int linkFooterFirstColumn = footerFirstColumn.findElements(By.tagName("a")).size();
		System.out.println("Count of links in the footer section for first column: " + linkFooterFirstColumn);
		
		
		
		
		//click on each link in the column and check if the pages are opening
		List<WebElement> eachLinks = footerFirstColumn.findElements(By.tagName("a"));
		for(int i=1; i<linkFooterFirstColumn; i++) {
			eachLinks.get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
			//Window handling
			Set<String> windows = driver.getWindowHandles();
			//Iterator<String> it = windows.iterator();  --> already in loop
			String parent = driver.getWindowHandle();
			for (String window : windows) {
				if(!window.equals(parent)) {
					driver.switchTo().window(window);
					String pageTitle = driver.getTitle();
					System.out.println("Page Title: " + pageTitle);
					driver.close();
				}
			}
			 // ✅ Switch back to parent tab after closing child
		    driver.switchTo().window(parent);
		}
		
		driver.quit();
		
	}

}
