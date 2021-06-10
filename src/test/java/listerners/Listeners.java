package listerners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener {
	public static Logger log = LogManager.getLogger(Listeners.class.getName());

	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		// hey i am done
		log.info("################################ Test Execution Completed ########################################");
	}

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		//
		log.info("################################ Test Execution Started ########################################");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		// Driver.takeScreenShot(result);
		log.info("Test failed - " + result.getName().toString());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("Skipping test - " + result.getName().toString());
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		// System.out.println("Executing test ........ " + result.getName().toString());
		log.info("Executing test ........ " + result.getName().toString());

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("Test passed - " + result.getName().toString());
	}
	
}