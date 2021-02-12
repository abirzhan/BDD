package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Dashboard extends BasePage{

	WebDriver driver;

	public Dashboard (WebDriver driver) {
		this.driver = driver;
	}

	// Element Lib

	@FindBy(how = How.XPATH, using = "//h2[contains(text(), ' Dashboard ')]")
	WebElement DASHBOARD_HEADER_FIELD;
	public void validateDashboardHeader() {

		waitForElement(driver, 5, DASHBOARD_HEADER_FIELD);
		Assert.assertEquals(DASHBOARD_HEADER_FIELD.getText(), "Dashboard", "Dashboard page not found!!");
	}
}