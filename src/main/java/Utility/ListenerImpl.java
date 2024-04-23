package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImpl implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case Started " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Success " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
//		System.out.println("Test Case Skip " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		System.out.println("Test Case Success in precentage " + result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
//		System.out.println("Test Case Failed with Timeout " + result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
//		System.out.println("Test Case let Started " + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
//		System.out.println("Test Case let Finished " + context.getName());
	}
}