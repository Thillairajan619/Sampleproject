package org.sample;

import org.app.BaseClass.BaseClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Sample_DataP1  {

	@Test(dataProvider="PassingData", dataProviderClass = Sample_DataP.class)
	public void test1(String a , String b) {
	System.out.println(a);
	System.out.println(b);
	}
	
}
