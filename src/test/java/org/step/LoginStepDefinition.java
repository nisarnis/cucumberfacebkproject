package org.step;

import java.time.Duration;

import org.apache.poi.util.SystemOutLogger;
import org.junit.Assert;
import org.utilites.BaseClass;
import org.utilites.PojoFb;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass {


@Given("User should launch the chrome and load the url")
public void user_should_launch_the_chrome_and_load_the_url() {
   browserLaunch();
   geturl("https://www.facebook.com/");
   maxWindow();
}

@When("User should type invalid username and invalid password in the textbox")
public void user_should_type_invalid_username_and_invalid_password_in_the_textbox() {
   PojoFb fb = new PojoFb();
   fillTextBox(fb.getTxtuser(), "Nisar@12394");
   fillTextBox(fb.getTxtpass(),"nisarfathima");
}

@When("User should print the title of the page")
public void user_should_print_the_title_of_the_page() {
	getTitle();
  
}

@When("User should click the login button")
public void user_should_click_the_login_button() throws InterruptedException {
	 PojoFb fb = new PojoFb();
	 fb.clickButton(fb.getBtnlogin());
	 Thread.sleep(4000);
   
}
@When("user should type valid username and invalid password in the textbox")
public void userShouldTypeValidUsernameAndInvalidPasswordInTheTextbox() {
	PojoFb fb = new PojoFb();
	fillTextBox(fb.getTxtuser(),"huruse6737");
	fillTextBox(fb.getTxtuser(),"873439" );
}

@Then("User should navigate to incorrect credential page")
public void user_should_navigate_to_incorrect_credential_page() {
    String current = driver.getCurrentUrl();
    Assert.assertTrue("Verify the incorrect page",current.contains("mutation"));
    System.out.println("verified");
}
@Then("user should navigate to incorrect credential page of valid username and invalid password")
public void userShouldNavigateToIncorrectCredentialPageOfValidUsernameAndInvalidPassword() {
   System.out.println(driver.getCurrentUrl());
}
@When("User shoud print title of the page")
public void userShoudPrintTitleOfThePage() {
   System.out.println(driver.getTitle());
}

@Then("user should navigate to incorrect credential page of invalid username and valid password page")
public void userShouldNavigateToIncorrectCredentialPageOfInvalidUsernameAndValidPasswordPage() {
	String current = driver.getCurrentUrl();
    Assert.assertTrue("Verify the incorrect page",current.contains("mutation"));
    System.out.println("Successfully");
   
}
@When("user should valid username and valid password in the textbox")
public void userShouldValidUsernameAndValidPasswordInTheTextbox() {
	PojoFb fb = new PojoFb();
	fillTextBox(fb.getTxtuser(),"fathi7");
	fillTextBox(fb.getTxtuser(),"873439" );
}
@Then("user should navigate to incorrect credential page")
public void userShouldNavigateToIncorrectCredentialPage() {
	String current = driver.getCurrentUrl();
    Assert.assertTrue("Verify the incorrect page",current.contains("privacy"));
    System.out.println("Done");
}

@When("user should invalid username and valid password in the textbox")
public void userShouldInvalidUsernameAndValidPasswordInTheTextbox() {
	 PojoFb fb = new PojoFb();
	 fillTextBox(fb.getTxtuser(),"Priya2884");
	 fillTextBox(fb.getTxtpass(), "12284949");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
}
}