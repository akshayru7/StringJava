package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

	WebDriver driver;
	WebElement OlderNewsLettersDropdown;
	WebElement multiSelectDropdown;
	WebElement OrangeCheckbox;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public WebElement getOlderNewsLettersDropdown() {
		setOlderNewsLettersDropdown();
		return OlderNewsLettersDropdown;
	}

	public void setOlderNewsLettersDropdown() {
		this.OlderNewsLettersDropdown = driver.findElement(By.cssSelector("select#drop1"));
	}

	public WebElement getmultiSelectDropdown() {
		setmultiSelectDropdown();
		return multiSelectDropdown;
	}

	public void setmultiSelectDropdown() {
		this.multiSelectDropdown = driver.findElement(By.cssSelector("select#multiselect1"));
	}

	public WebElement getOrangeCheckbox() {
		setOrangeCheckbox();
		return OrangeCheckbox;
	}

	public void setOrangeCheckbox() {
		this.OrangeCheckbox = driver.findElement(By.cssSelector("#checkbox1"));
	}
}