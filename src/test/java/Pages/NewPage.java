package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewPage extends BasePage {

	WebDriver driver;
	WebElement newWindow;

	public NewPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public WebElement getnewWindow() {
		setnewWindow();
		return newWindow;
	}

	public void setnewWindow() {
		this.newWindow = driver.findElement(By.xpath("//h3[type()='New Window']"));
	}
}