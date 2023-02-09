package org.step;

import org.junit.Assert;
import org.utilites.BaseClass;
import org.utilites.PojoForgottenMobileNum;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgottenPassStepDefinition extends BaseClass {
	@When("User should click the forgotten password")
	public void user_should_click_the_forgotten_password() {
	   PojoForgottenMobileNum p=new PojoForgottenMobileNum();
	   clickButton(p.getForgottenPass());
	}

	@When("User should fill the invalid mobile number")
	public void user_should_fill_the_invalid_mobile_number() {
		PojoForgottenMobileNum p=new PojoForgottenMobileNum();
		fillTextBox(p.getTxtboxmobile(),"123495858690");
	}

	@When("User should click search button")
	public void user_should_click_search_button() {
		PojoForgottenMobileNum p=new PojoForgottenMobileNum();
		clickButton(p.getClickSearchButton());
	}

	

	@Then("user should navigate the incorrect credential page")
	public void user_should_navigate_the_incorrect_credential_page() {
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertTrue("Verify the incorrect page", currentUrl.contains("recover"));
	}
	
	@When("User should get title of the page")
	public void user_should_get_title_of_the_page() {
	    System.out.println(driver.getTitle());
	}

}
