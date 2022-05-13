package com.Page;

import com.Hooks.hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage {

    WebDriver driver = hook.driver;

    private By Sign_in=By.className("login");
    private By emailID=By.id("email");
    private By passwords=By.id("passwd");
    private By SignInButton = By.id("SubmitLogin");
    private By ListOfActions = By.className("myaccount-link-list");
    private By ErrorMessage = By.className("alert alert-danger");



    public void MainPage(WebDriver driver){
        this.driver=driver;

    }

    public String getThePageTitle(){
        driver.getTitle();
        return driver.getTitle();
    }

    public void enterUserName(String username){
        driver.findElement(emailID).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwords).sendKeys(password);
    }

    public void Click_On_Sign_in(){
        driver.findElement(Sign_in).click();
    }

    public void Click_On_Login(){
        driver.findElement(SignInButton).click();
    }

    public void getListOfActions(){
        List<WebElement> list=driver.findElements(By.className("myaccount-link-list"));
        for (WebElement e : list) {
            String text = e.getText();
            System.out.println(text);
        }
    }

    public WebElement printErrorMessage(){
        WebElement errorMessage=driver.findElement(By.className("alert alert-danger"));
        return errorMessage;
    }







}
