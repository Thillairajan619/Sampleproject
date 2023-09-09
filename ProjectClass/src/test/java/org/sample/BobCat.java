package org.sample;




import java.util.List;

import org.app.BaseClass.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BobCat extends BaseClass{
	
	@Test
	public void test() {
		url("https://www.bobcat.com/in/en");
		// xpath to close popup
		driver.findElement(By.xpath("//*[@aria-label='Close']")).click();
		// xpath for Equipment button
	driver.findElement(By.xpath("(//button [@type = 'button']) [3]/child ::div")).click();
	// xpath for Skid Steer loader
	driver.findElement(By.xpath("//ul [@aria-label = 'Loaders']/ child ::li[1]")).click();
	
	List <WebElement> header = driver.findElements(By.xpath("//div[@data-test-id=\"product-listing-item__content\"] / child :: h5"));
	List <WebElement> horsepower = driver.findElements(By.xpath("//*[@class=\"list-group list-group-flush\"] / child :: div [1]"));
	List <WebElement> roc = driver.findElements(By.xpath("//*[@class=\"list-group list-group-flush\"] / child :: div [2]"));                               
	List <WebElement> operatingweight = driver.findElements(By.xpath("//*[@class=\"list-group list-group-flush\"] / child :: div [3]"));                               
	
	for (int i=0; i<header.size(); i++) {
		System.out.println(i+1+"."+ header.get(i).getText());
		System.out.println("horse Power:"+ horsepower.get(i).getText());
		System.out.println("Rated Operating Capacity:"+ roc.get(i).getText());
		System.out.println("Operating Weight:"+ operatingweight.get(i).getText());
		}
	System.out.println("----------------------------");
	driver.findElement(By.xpath("(//button [@type = 'button']) [3]/child ::div")).click();
		// xpath for Compact Track loader
		driver.findElement(By.xpath("//ul [@aria-label = 'Loaders']/ child ::li[2]")).click();
		
		
		List <WebElement> header1 = driver.findElements(By.xpath("//div[@data-test-id=\"product-listing-item__content\"] / child :: h5"));
		List <WebElement> horsepower1 = driver.findElements(By.xpath("//*[@class=\"list-group list-group-flush\"] / child :: div [1]"));
		List <WebElement> roc1 = driver.findElements(By.xpath("//*[@class=\"list-group list-group-flush\"] / child :: div [2]"));                               
		List <WebElement> operatingweight1 = driver.findElements(By.xpath("//*[@class=\"list-group list-group-flush\"] / child :: div [3]"));                               
		
		for (int i=0; i<header1.size(); i++) {
			System.out.println(i+1+"."+ header1.get(i).getText());
			System.out.println("horse Power:"+ horsepower1.get(i).getText());
			System.out.println("Rated Operating Capacity:"+ roc1.get(i).getText());
			System.out.println("Operating Weight:"+ operatingweight1.get(i).getText());	
			}
		System.out.println("----------------------------");
		driver.findElement(By.xpath("(//button [@type = 'button']) [3]/child ::div")).click();
		// xpath for Black hoe loader  
		driver.findElement(By.xpath("//ul [@aria-label = 'Loaders']/ child ::li[3]")).click();
		
		List <WebElement> header2 = driver.findElements(By.xpath("//div[@data-test-id=\"product-listing-item__content\"] / child :: h5"));
		List <WebElement> horsepower2 = driver.findElements(By.xpath("//*[@class=\"list-group list-group-flush\"] / child :: div [1]"));
		List <WebElement> roc2 = driver.findElements(By.xpath("//*[@class=\"list-group list-group-flush\"] / child :: div [2]"));                               
		List <WebElement> operatingweight2 = driver.findElements(By.xpath("//*[@class=\"list-group list-group-flush\"] / child :: div [3]"));                               
		
		for (int i=0; i<header2.size(); i++) {
			System.out.println(i+1+"."+ header2.get(i).getText());
			System.out.println("horse Power:"+ horsepower2.get(i).getText());
			System.out.println("Rated Operating Capacity:"+ roc2.get(i).getText());
			System.out.println("Operating Weight:"+ operatingweight2.get(i).getText());	
	}
	}
}
