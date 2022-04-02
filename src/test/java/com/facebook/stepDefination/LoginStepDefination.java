package com.facebook.stepDefination;

import com.facebook.pageObject.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination extends LoginPage {
	
	LoginPage loginPage=new LoginPage();

	@Given("^I am a user of facebook application$")
	public void i_am_a_user_of_facebook_application() throws Throwable {
	   loginPage.openUrl();
	}

	@When("^User enter valid Username$")
	public void user_enter_valid_Username() throws Throwable {
	    loginPage.userName();
	}

	@When("^User enter valid password$")
	public void user_enter_valid_password() throws Throwable {
	    loginPage.passWord();
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    loginPage.loginButton();
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	   loginPage.verifyLogin();
	}

}
