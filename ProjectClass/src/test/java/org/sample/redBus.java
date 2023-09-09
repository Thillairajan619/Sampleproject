package org.sample;

import java.util.List;

import org.app.BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class redBus extends BaseClass {
     
	
	@Test
	public void from (String user) {
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys(user);
	}
	public void To (String user) {
		driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys(user);
	}
	public void Date () {
		String year ="2023";
		String month = "Nov";
		String Date = "10";
		driver.findElement(By.xpath("")).click();
		
		while (true) {
			String monthyear = driver.findElement(By.xpath("")).getText();
			String arr[]= monthyear.split(" ");
			String mon = arr [0];
			String yr = arr[1];
			if (mon.equalsIgnoreCase(month)&& yr.equals(year))
				break;
			else 
				driver.findElement(By.xpath("")).click();
			}
		List<WebElement> alldates = driver.findElements(By.xpath(""));
		for (WebElement ele:alldates) {
			String dt = ele.getText();
			if(dt.equals(Date)) { 
				ele.click();
			}
		}
		
		
		
	}
	
}
