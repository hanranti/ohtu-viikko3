package ohtu;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Stepdefs {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "http://localhost:4567";

    @Given("^login is selected$")
    public void login_selected() throws Throwable {
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();
    }

    @When("^username \"([^\"]*)\" and password \"([^\"]*)\" are given$")
    public void username_and_password_are_given(String username, String password) throws Throwable {
        WebElement element = driver.findElement(By.name("username"));
        element.sendKeys(username);
        element = driver.findElement(By.name("password"));
        element.sendKeys(password);
        element = driver.findElement(By.name("login"));
        element.submit();
    }

    @Then("^system will respond \"([^\"]*)\"$")
    public void system_will_respond(String pageContent) throws Throwable {
        assertTrue(driver.getPageSource().contains(pageContent));
    }

    @When("^correct username \"([^\"]*)\" and password \"([^\"]*)\" are given$")
    public void username_correct_and_password_are_given(String username, String password) throws Throwable {
        logInWith(username, password);
    }

    @When("^correct username \"([^\"]*)\" and incorrect password \"([^\"]*)\" are given$")
    public void username_and_incorrect_password_are_given(String username, String password) throws Throwable {
        logInWith(username, password);
    }

    @When("^incorrect username \"([^\"]*)\" and password \"([^\"]*)\" are given$")
    public void inusername_correct_and_password_are_given(String username, String password) throws Throwable {
        logInWith(username, password);
    }

    @Then("^user is logged in$")
    public void user_is_logged_in() throws Throwable {
        pageHasContent("Ohtu Application main page");
    }

    @Then("^user is not logged in and error message is given$")
    public void user_is_not_logged_in_and_error_message_is_given() throws Throwable {
        pageHasContent("invalid username or password");
        pageHasContent("Give your credentials to login");
    }

    @Then("^correct username \"([^\"]*)\" and correct password and its confirmation \"([^\"]*)\" are given$")
    public void correct_username_and_correct_password_and_its_confirmation_are_given(String username, String password) {
        signUpWith(username, password, password);
    }

    @Then("^user is created$")
    public void user_is_created() {
        pageHasContent("Welcome to Ohtu Application!");
    }

    @Given("^new user is selected$")
    public void new_user_is_selected() {
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();
    }

    @When("too short username \"([^\"]*)\" and correct password with its confirmation \"([^\"]*)\" are given")
    public void too_short_username_and_correct_password_with_its_confirmation_are_given(String username, String password) {
        signUpWith(username, password, password);
    }

    @Then("^user is not created and error \"([^\"]*)\" is reported$")
    public void user_is_not_created_and_error_is_reported(String error) throws Throwable {
        pageHasContent(error);
    }

    @When("^correct username \"([^\"]*)\" and too short password with its confirmation \"([^\"]*)\" are given$")
    public void correct_username_and_too_short_password_with_its_confirmation_are_given(String username, String password) throws Throwable {
        signUpWith(username, password, password);
    }

    @When("^correct username \"([^\"]*)\" and password consisting of letters with its confirmation \"([^\"]*)\" are given$")
    public void correct_username_and_password_consisting_of_letters_with_its_confirmation_are_given(String username, String password) throws Throwable {
        signUpWith(username, password, password);
    }

    @When("^taken username \"([^\"]*)\" and correct password with its confirmation \"([^\"]*)\" are given$")
    public void taken_username_and_correct_password_with_its_confirmation_are_given(String username, String password) throws Throwable {
        signUpWith(username, password, password);
    }

    @When("^correct username \"([^\"]*)\", correct password \"([^\"]*)\" with different password confirmation \"([^\"]*)\"$")
    public void correct_username_correct_password_with_different_password_confirmation(String username, String password, String passwordConfirmation) throws Throwable {
        signUpWith(username, password, passwordConfirmation);
    }

    @Given("^user with username \"([^\"]*)\" with password \"([^\"]*)\" is successfully created$")
    public void user_with_username_with_password_is_successfully_created(String username, String password) throws Throwable {
        new_user_is_selected();
        signUpWith(username, password, password);
    }

    @Given("^user with username \"([^\"]*)\" and password \"([^\"]*)\" is unsuccessfully created$")
    public void user_with_username_and_password_is_unsuccessfully_created(String username, String password) throws Throwable {
        new_user_is_selected();
        signUpWith(username, password, password);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    /* helper methods */
    private void pageHasContent(String content) {
        assertTrue(driver.getPageSource().contains(content));
    }

    private void logInWith(String username, String password) {
        assertTrue(driver.getPageSource().contains("Give your credentials to login"));
        WebElement element = driver.findElement(By.name("username"));
        element.sendKeys(username);
        element = driver.findElement(By.name("password"));
        element.sendKeys(password);
        element = driver.findElement(By.name("login"));
        element.submit();
    }

    private void signUpWith(String username, String password, String passwordConfirmation) {
        assertTrue(driver.getPageSource().contains("Create username and give password"));
        WebElement element = driver.findElement(By.name("username"));
        element.sendKeys(username);
        element = driver.findElement(By.name("password"));
        element.sendKeys(password);
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys(passwordConfirmation);
        element = driver.findElement(By.name("signup"));
        element.submit();
    }
}
