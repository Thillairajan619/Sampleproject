package org.sample;

import java.sql.Driver;

import org.app.BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FlipKart extends BaseClass{
    @Parameters({"browser"})
	@Test
	public void test1(String name) {
		if (name.equals("chrome")) {
			driver = new ChromeDriver();
			driver.get("https://www.facebook.in/");
			
		}
		if (name.equals("edge")) {
		driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		
	}
    }		
}
