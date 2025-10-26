package ecommerceCart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProducts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] itemsNeeded = {"Cucumber", "Beetroot", "Brinjal", "Potato", "Water Melon"};
		
//		WebElement cucumber = driver.findElement(By.xpath("//h4[text()='Cucumber - 1 Kg']/parent::div//button"));
//		cucumber.click();

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i = 0; i <= products.size(); i++) {
			String singleProduct = products.get(i).getText();
			//check whether name you extracted is present in array or not			
			//convert array into array list for easy search
			//check whether name you extracted is present in arraylist or not
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
		}
		
		
		// using for loop (single product)
//		for (int i = 0; i <= products.size(); i++) {
//			String singleProduct = products.get(i).getText();
//			if (singleProduct.contains("Cucumber")) {
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//				break;
//			}
//		}

		// using for each loop (single product)
//		int index=0;
//		for (WebElement product : products) {
//			String singleProduct = product.getText();
//			if(singleProduct.contains("Cucumber")) {
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(index).click();
//				break;
//			}
//			index++;
//		}

		driver.quit();
		
	}

}
