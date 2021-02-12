
package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.AddNewCustomer;
import page.LoginPage;
import util.BrowserFactory;

public class StepDefinitions {
	WebDriver driver;
	AddNewCustomer addCustomer;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		addCustomer = PageFactory.initElements(driver, AddNewCustomer.class);
	}

	@Given("^User is on the techfios login page$")
	public void User_is_on_the_Techfios_login_page() {
		// driver = BrowserFactory.startBrowser();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		;

	}

	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String userName, String passWord) throws Throwable {
		addCustomer.enterUsername(userName);
		addCustomer.enterPassword(passWord);
	}

	@And("^User clicks on login button$")
	public void User_clicks_on_login_button()  throws Throwable {
		addCustomer.clickOnSignIn();
		Thread.sleep(2000);
	}

	@Then("^User should be able to see the dashboard$")
    public void user_should_be_able_to_see_the_dashboard() throws Throwable {
		Assert.assertEquals("Dashboard- iBilling", driver.getTitle());
		addCustomer.takeScreenshotAtEndOfTest(driver);
		
		// loginPage.takeScreenshotAtEndOfTest(driver);

	}

	@Then("^User clicks on bank and cash$")
	public void User_clicks_on_bank_and_cash() throws Throwable {
		addCustomer.clickOnBankandCash();
		
	}

	@Then("^User clicks on new account$")
	public void User_clicks_on_new_account()  throws Throwable {
		addCustomer.clickOnNewAccount();
		Thread.sleep(3000);
	}

	@Then("^User fill up the form entering \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\" and clicks on submit$")
	public void user_fill_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String AccountData,
			String description, String balance, String accountNum, String contactPerson, String contactPhone,
			String bankingUrl) throws Throwable {
		{
			addCustomer.enterAccount(AccountData);
			addCustomer.enterDescrip(description);
			addCustomer.enterbaLance(balance);
			addCustomer.enterAccountNumber(accountNum);
			addCustomer.enterContactPer(contactPerson);
			addCustomer.enterContactPhone(contactPhone);
			addCustomer.enterBankUrl(bankingUrl);
			addCustomer.clickOnSubmit();
		}

	}

	@Then("^User should be able to see validate$")
	public void User_should_be_able_to_see_validate() throws IOException, InterruptedException {
		addCustomer.takeScreenshotAtEndOfTest(driver);
		Thread.sleep(2000);
	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();

	}
}
