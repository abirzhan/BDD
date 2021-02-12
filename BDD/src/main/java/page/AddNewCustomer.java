package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewCustomer extends BasePage {
	WebDriver driver;

	public AddNewCustomer(WebDriver driver) {
		this.driver = driver;
	}

//Element library
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement Username_Field;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement Password_Field;
	@FindBy(how = How.XPATH, using =  "//button[@name='login']")
	WebElement SignIn;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement Bank_Cash;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	WebElement New_Account;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement Account_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement Description_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement Balance_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement Account_Number_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement Contact_Person_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement Contact_Phone_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement Banking_Url_Field;
	@FindBy(how = How.XPATH, using = "//*[@id='page-wrapper']/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement Submit_Button;
	
	

	public void enterUsername(String userName) {
		Username_Field.sendKeys(userName);
	}

	public void enterPassword(String passWord) {
		Password_Field.sendKeys(passWord);
	}

	public void clickOnSignIn() {
		SignIn.click();
		
	}

	public void clickOnBankandCash() {
		Bank_Cash.click();
	}

	public void clickOnNewAccount() {
		New_Account.click();
	}

	public void enterAccount(String AccountData) {
		Account_Field.sendKeys(AccountData + new Random().nextInt(999));
		
	}

    public void enterDescrip(String description) {
		Description_Field.sendKeys(description);
	}

	public void enterbaLance(String balance) {
		Balance_Field.sendKeys(balance);
	}

	public void enterAccountNumber(String accountNum) {
		Account_Number_Field.sendKeys(accountNum);
	}

	public void enterContactPer(String contactPerson) {
		Contact_Person_Field.sendKeys(contactPerson);
	}

	public void enterContactPhone(String contactPhone ) {
		Contact_Phone_Field.sendKeys(contactPhone);
	}

	public void enterBankUrl(String bankingUrl) {
		Banking_Url_Field.sendKeys(bankingUrl);
	}

	public void clickOnSubmit() {
		Submit_Button.click();
	}

	public void validateAccount() {
		driver.getTitle();
	}
	



}
