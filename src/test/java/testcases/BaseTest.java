package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import Utility.CommonUtils;

public class BaseTest {

	WebDriver driver;
	SoftAssert verify;

	@BeforeMethod(alwaysRun = true)
	public void setup() {

		verify = new SoftAssert();
		Reporter.log("Before Launching Browser");
		driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get(CommonUtils.readProperty("url"));
		Reporter.log("Browser launched Successfully");
		Assert.assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/");
	}

	@AfterMethod(alwaysRun = true)
	public void teardown() {
		driver.quit();
	}
}