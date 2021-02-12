package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
       String url= ConfigurationReader.get("url");
       Driver.get().get(url);
        //WebDriver driver= Driver.get();
      //  driver.get(url);
        //Thread.sleep(5000);
        //System.out.println("I open browser and navigate to vytrack login page");

    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() throws InterruptedException {
       String username= ConfigurationReader.get("driver_username");
       String password= ConfigurationReader.get("driver_password");

        LoginPage loginPage=new LoginPage();
        loginPage.login(username, password);
        // Thread.sleep(3000);
      //  System.out.println("I put user1 username and UserUser123 password and click login button");
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException {
        BrowserUtils.waitFor(3);
        String actualTitle= Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);
        //Thread.sleep(2000);
       // System.out.println("I verify that title changed to Dashboard");

    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() throws InterruptedException {
        String username= ConfigurationReader.get("sales_manager_username");
        String password= ConfigurationReader.get("sales_manager_password");

        LoginPage loginPage=new LoginPage();
        loginPage.login(username, password);
        //Thread.sleep(3000);
        //System.out.println("I enter sales manager username and password");
    }
    @When ("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() throws InterruptedException {
        String username= ConfigurationReader.get("store_manager_username");
        String password= ConfigurationReader.get("Store_manager_password");

        LoginPage loginPage=new LoginPage();
        loginPage.login(username, password);
        // Thread.sleep(3000);
      //  System.out.println("I login an store manager");
    }
    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
         LoginPage loginPage=new LoginPage();
         loginPage.login(username, password);
        //System.out.println("username = " + username);
       // System.out.println("password = " + password);
    }
    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {
        System.out.println("expectedTitle = " + expectedTitle);
        BrowserUtils.waitFor(5);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
    }


}