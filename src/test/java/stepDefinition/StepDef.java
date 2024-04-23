package stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	WebDriver driver;
	
	@Given("launch Application")
	public void launch_appliction () throws Throwable {
		//WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}

	@And("verify valid UserName")
	public void setUserName () {
		driver.findElement(By.xpath("//input[@name='usename']")).sendKeys("Admin");
	}
	
	@When("verify valid password")
	public void setPassword() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
	}
	@And("verify click on login button")
	public void clickonLoginbtn() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	
	@Then("display successfully logged message")
	public void displayloggedinmessage() {
		Assert.assertEquals(driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText(),
				"Login Successfully");
	}
}