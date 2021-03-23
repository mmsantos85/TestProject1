package Boltesting.steps;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class registration {
	
WebDriver driver;
	
	@Before()
	public void setup () {
		System.setProperty("webdriver.chrome.driver", "H:\\Testingenvironment\\TestProject1\\BolFramework\\src\\test\\java\\Boltesting\\recources\\chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);		
	}
		
	@Given("^User navigates to bol\\.com(\\d+)$")
	public void user_navigates_to_bol_com(int arg1) throws Throwable {
	    driver.get("https://www.bol.com/nl/");
	}

	@Given("^User clicks on agree cookies(\\d+)$")
	public void user_clicks_on_agree_cookies(int arg1) throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.className("js-confirm-button")).click();
	}

	@Given("^User clicks on login button(\\d+)$")
	public void user_clicks_on_login_button(int arg1) throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/div[1]/div[3]/a[1]/span[1]")).click();
	}

	@Given("^User thicks on own account(\\d+)$")
	public void user_thicks_on_own_account(int arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@id='newuserPrivate']")).click();
	}

	@Given("^User enters valid email(\\d+)$")
	public void user_enters_valid_email(int arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_email_new']")).sendKeys("issakarissefabiala@gmail.com");
	}

	@Given("^User clicks on make an account(\\d+)$")
	public void user_clicks_on_make_an_account(int arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@id='button_new_user_new_checkout']")).click();
	}

	@Then("^User should be navigated to registration form(\\d+)$")
	public void user_should_be_navigated_to_registration_form(int arg1) throws Throwable {
		Thread.sleep(5000);
		WebElement askQuestionsAanhef = driver.findElement(By.xpath("//p[contains(text(),'Aanhef *')]"));
		Assert.assertEquals(true, askQuestionsAanhef.isDisplayed());
	}
	
	@Then("^User ticks Ms$")
	public void user_ticks_Ms() throws Throwable {
		driver.findElement(By.xpath("//input[@id='address.prefixF']")).click();
	} //input[@id='address.prefixF']

	@Then("^User enters his first name$")
	public void user_enters_his_first_name() throws Throwable {
		driver.findElement(By.xpath("//input[@id='address.firstName']")).sendKeys("Issa");
	}//input[@id='address.firstName']

	@Then("^User should type his last name$")
	public void user_should_type_his_last_name() throws Throwable {
		driver.findElement(By.xpath("//input[@id='address.lastName']")).sendKeys("Fabiala");
	}//input[@id='address.lastName']

	@Then("^The user thicks Nederlands$")
	public void the_user_thicks_Nederlands() throws Throwable {
		driver.findElement(By.xpath("//input[@id='address.countryChoiceNL']")).click();
	}//input[@id='address.countryChoiceNL']

	@Then("^User should type a valid zip code$")
	public void user_should_type_a_valid_zip_code() throws Throwable {
		driver.findElement(By.xpath("//input[@id='address.zipCode']")).sendKeys("3233TN");
	}//input[@id='address.zipCode']

	@Then("^User should type a valid house number$")
	public void user_should_type_a_valid_house_number() throws Throwable {
		driver.findElement(By.xpath("//input[@id='address.houseNumberWithExtension']")).sendKeys("11");
	}//input[@id='address.houseNumberWithExtension']


	@Then("^User should type a valid phone number$")
	public void user_should_type_a_valid_phone_number() throws Throwable {
		driver.findElement(By.xpath("//input[@id='account_phone_number']")).sendKeys("0646446996");
	}//input[@id='account_phone_number']


	@Then("^The user should type a valid password$")
	public void the_user_should_type_a_valid_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='account_password']")).sendKeys("uH-$d2G?BTVej@u");
	}//input[@id='account_password'] uH-$d2G?BTVej@u

	@Then("^User ticks checkbox$")
	public void user_ticks_checkbox() throws Throwable {
		driver.findElement(By.xpath("//input[@id='newsletter_purchase']")).click();
	}//input[@id='newsletter_purchase']

	@When("^The user clicks on the send button$")
	public void the_user_clicks_on_the_send_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='button_send']")).click();
	}//input[@id='button_send']

	@Then("^User should be navigated to userprofile$")
	public void user_should_be_navigated_to_userprofile() throws Throwable {
		Thread.sleep(5000);
		WebElement askQuestionsOverzicht = driver.findElement(By.xpath("//h1[contains(text(),'Accountoverzicht')]"));
		Assert.assertEquals(true, askQuestionsOverzicht.isDisplayed());
	}

}
