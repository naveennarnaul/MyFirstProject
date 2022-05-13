package com.Steps;

import com.Hooks.hook;
import com.Page.MainPage;

import com.util.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class StepDefinition {



    WebDriver driver = hook.driver;
    MainPage mp=new MainPage();




    @Given("^user is on the required site$")
    public void user_is_on_the_required_site()  {


      String ActualTitle= mp.getThePageTitle();
        String exTitle= Utility.readDataFromPropertyFile("expectedTitle");
        Assert.assertEquals(exTitle,ActualTitle);
        System.out.println("Actual Title :" + ActualTitle);
        System.out.println("user is on the required site");
        mp.Click_On_Sign_in();
        System.out.println("user has successfully reached to the credentials page");
    }

    @Then("^the user enters the username \"([^\"]*)\"$")
    public void the_user_enters_the_username(String username)  {

        mp.enterUserName(username);
        System.out.println("username is entered");
    }

    @Then("^the user enters the password \"([^\"]*)\"$")
    public void the_user_enters_the_password(String password)  {

        mp.enterPassword(password);
        System.out.println("password is entered");

    }

    @Then("^the user clicks on the sign in button$")
    public void the_user_clicks_on_the_sign_in_button()  {
      mp.Click_On_Login();

        System.out.println("sign in button is clicked");
    }

    @Then("^the user enters the site and the main page is opened$")
    public void the_user_enters_the_site_and_the_main_page_is_opened()  {
        String ActualTitle=mp.getThePageTitle();
        String expectedMainPgTitle =Utility.readDataFromPropertyFile("expectedMainPageTitle");
        Assert.assertEquals(expectedMainPgTitle,ActualTitle);
        System.out.println("Actual Title :" + ActualTitle);
        System.out.println("user is on the website");

    }

    @Then("^the user enters the usernames \"([^\"]*)\"$")
    public void the_user_enters_the_usernames(String UserName)  {
        mp.enterUserName(UserName);
    }

    @Then("^the user enters the passwords \"([^\"]*)\"$")
    public void the_user_enters_the_passwords(String Passwd) {
        mp.enterPassword(Passwd);
    }

    @Then("^the user receives the expected messages$")
    public void the_user_receives_the_expected_messages()  {

        String erMsg=mp.printErrorMessage().getText();
        System.out.println("the error message is:"+ erMsg);
        String ActErMsg=Utility.readDataFromPropertyFile("actualErMsg");
        Assert.assertEquals(ActErMsg,erMsg);
    }


    @And("^the lists on the main page are displayed$")
    public void theListsOnTheMainPageAreDisplayed() {
        mp.getListOfActions();
    }
}
