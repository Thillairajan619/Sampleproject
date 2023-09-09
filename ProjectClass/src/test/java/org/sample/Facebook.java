package org.sample;

import org.app.BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook extends BaseClass {
	@Parameters ({"Username"})
	@Test (priority=1)
	public void user (String user) {
		driver.findElement(By.xpath("//* [@id='email']")).sendKeys(user);
	}
	@Parameters ({"password"})
	@Test (priority=2)
	public void pass (String pass) {
		driver.findElement(By.xpath("//* [@id='pass']")).sendKeys(pass);
	}
	@AfterClass
	public void click () {
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	}
	

	
	}

