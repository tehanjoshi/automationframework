package com.mypackage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	
	  @Given("user navigates to facebook website") public void
	  user_navigates_to_facebook_website() {
	  System.out.println("@Given - user naviagtes to facebook.com"); }
	  
	  
	  @When("user validates the homepage title") public void
	  user_validates_the_homepage_title() {
	  System.out.println("@When - user Validates the homepage title"); }
	  
	  @Then("user entered {string} username") public void
	  user_entered_valid_username(String username) {
	  System.out.println("@Then - user entered " + username+ " username"); }
	  
	  @And("user entered {string} password") public void
	  user_entered_valid_password(String password) {
	  System.out.println("@And - user entered "+password + " password"); }
	  
	  @Then("user {string} successfully logged in") public void
	  user_shouldbe_successfully_logged_in(String should) {
	  System.out.println("@Then - user " + should + " successfully logged in"); }
	 
}
