package testcases;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.HomePage;
import Utility.CommonUtils;

public class VerifyDropdownOptions extends BaseTest {

	HomePage homepage;

	@Test(description = "Verify Dropdown options", groups = "sanity", priority = 1)
	public void verifyDropdownoptions() {

		homepage = new HomePage(driver);
		WebElement getolderNewLetterDropdown = homepage.getOlderNewsLettersDropdown();
		List<String> expectedDropdownOptions = Arrays.asList("Older Newsletters", "doc 1", "doc 2", "doc 3", "doc 4");
		List<String> allDropdownOptions = CommonUtils.getAlloptionFromDropDown(getolderNewLetterDropdown);
		verify.assertEquals(allDropdownOptions, expectedDropdownOptions, "Dropdown not having mentioned options");
		verify.assertAll();
	}
}