package org.sample;

import org.app.BaseClass.BaseClass;
import org.testng.annotations.DataProvider;

public class Sample_DataP {
	
	@DataProvider(name = "PassingData")
	public  Object [][]data_provider(){
		return new Object [][] {{"Username1","Password1"},{ "Usename2", "password2"}};
		
	}
		
}
