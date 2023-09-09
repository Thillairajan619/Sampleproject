package org.sample;

import org.app.BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookGroup extends BaseClass {
	
	@Test (groups= {"smoke","reg"})
	public void user () {
		driver.findElement(By.xpath("//* [@id='email']")).sendKeys("Thillairajan");
	}
	
	@Test (groups= {"sanity","reg"})
	public void pass () {
		driver.findElement(By.xpath("//* [@id='pass']")).sendKeys("8678938516");
	}
	@AfterClass (groups= {"sanity","reg"})
	public void click () {
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	}
	
}
