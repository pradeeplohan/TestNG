package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	
	@AfterSuite
	public void lastSuite()
	{
		System.out.println("I'm super last");
	}
	@Test(groups= {"Smoke"})
	public void newTest()
	{
		System.out.println("nice");
	}

	//@Parameters({"URL"})
	@Test(timeOut=4000)
	public void newTest1()
	{
		System.out.println("bad");
		//System.out.println(url);
	}
	
	@Test
	public void lastTest1()
	{
		System.out.println("last");
	}
	
	@BeforeTest
	public void firstTest1()
	{
		System.out.println("I'm first");
	}
	
	@AfterMethod(enabled=false)
	public void everyMethodLast()
	{
		System.out.println("I'm after every method of class Day2");
	}
	
	@Test(dataProvider="getData", dependsOnMethods= {"newTest", "newTest1"})
	public void myTest1(String username, String password)
	{
		System.out.println(username+password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//create 3 set of data with username and password
		Object[][] data = new Object[3][2];
		
		//1st set
		data[0][0] = "1username";
		data[0][1] = "1password";
		
		//2nd set
		data[1][0] = "2username";
		data[1][1] = "2password";
		
		//3rd set
		data[2][0] = "3username";
		data[2][1] = "3password";
		
		return data;
		
	}

}
