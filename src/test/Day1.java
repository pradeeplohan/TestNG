package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {

	@AfterTest
	public void endTest()
	{
		System.out.println("I'm last");
	}
	
	//@Parameters({"URL"})
	@Test
	public void Demo()
	{
		System.out.println("Hello world!");
		//System.out.println(url);
	}
	
	@Test(groups= {"Smoke"})
	public void SecondTest()
	{
		System.out.println("bye");
		Assert.assertTrue(false);
	}
	
	@BeforeSuite
	public void suitFirst()
	{
		System.out.println("I'm super first");
	}
	
	@BeforeMethod(enabled=false)
	public void everyMethodFirst()
	{
		System.out.println("I'm before every method of class Day1");
	}

}
