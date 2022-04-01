package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage {

    @Given("user is on home page")
    public void loadHomePage(){
        System.out.println("Executing load home page functionality");
    }

    @When("user scrolls down to the bottom")
    public void scrollDownToBottom(){
        System.out.println("Executing scroll down to bottom functionality");
    }

    @Then("user is able to see footer")
    public void checkFooter(){
        System.out.println("Executing check footer functionality");
    }

}
