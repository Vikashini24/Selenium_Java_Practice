package syncronization;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ImplicitExplicitAssignment {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
        // disable Chrome password manager popup
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
        // optional: suppress other automation banners
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito");
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
		
        
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		ImplicitExplicitAssignment iea = new ImplicitExplicitAssignment();
		String[] credentials = iea.details(driver);
		
		driver.findElement(By.id("username")).sendKeys(credentials[0]);
		driver.findElement(By.id("password")).sendKeys(credentials[1]);
		WebElement user = driver.findElement(By.xpath("//span[text()=' User']/parent::label/span[@class='checkmark']"));
		user.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		dropdown.sendKeys("Consultant" + Keys.ENTER);
		
		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();
		Assert.assertTrue(checkbox.isSelected());
		driver.findElement(By.id("signInBtn")).click();
		
		long startTime = System.currentTimeMillis();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-lg-9")));
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: " + (endTime-startTime)/1000 + "s");
		
		List<WebElement> addButtons = driver.findElements(By.xpath("//button[text()='Add ']"));
		for (WebElement addButton : addButtons) {
			addButton.click();
		}
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		
		driver.quit();
		
	}
	
	
	public String[] details(WebDriver driver) {
		String text = driver.findElement(By.cssSelector(".text-center.text-white")).getText();
		// (username is rahulshettyacademy and Password is learning)
		String usernameSplit = text.split("is ")[1].split(" and")[0];
		String passwordSplit = text.split("Password is ")[1].replace(")", " ").trim();
		return new String[] {usernameSplit, passwordSplit};
	}
	

}
