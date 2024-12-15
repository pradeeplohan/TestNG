package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("Method passed "+ result.getName());

	}
	
	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("Method failed "+ result.getName());

	}

}
