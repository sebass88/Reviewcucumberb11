package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.RegisterPageClass;
import utils.CommonMethods;

public class RegistrationSteps extends CommonMethods {
    @Given("user is able is navigated to mercury tours application")
    public void user_is_able_is_navigated_to_mercury_tours_application() {
       openBrowserAndLaunchApplication();
    }
    @When("user enters values for registering the user")
    public void user_enters_values_for_registering_the_user() {
        RegisterPageClass r= new RegisterPageClass();

        r.firstName.sendKeys("sorbon");
        r.lastName.sendKeys("ait");
        r.phoneNumber.sendKeys("7034551782");
        r.email.sendKeys("test@abc.com");
        r.addressField.sendKeys("brooklyn");
        r.cityField.sendKeys("woodcliff");
        r.stateField.sendKeys("VA");
        r.postalCode.sendKeys("22152");

        Select select=new Select(r.countryDropdown);
        select.selectByVisibleText("NIUE");
        r.username.sendKeys("alexa123");
        r.password.sendKeys("Test@123");
        r.confirmPassword.sendKeys("Test@123");


    }
    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
     RegisterPageClass r=new RegisterPageClass();
     r.submitButton.click();
    }
    @Then("user should be able to see message successful registration")
    public void user_should_be_able_to_see_message_successful_registration() {
        System.out.println("test passed");
        driver.quit();
    }

    @When("user enters {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} for registering the user")
    public void user_enters_for_registering_the_user(String fn, String ln, String phone, String email, String address, String city, String state,
                                                     String postalCode, String country, String username, String password, String confirmPassword) {
        RegisterPageClass r= new RegisterPageClass();
        r.firstName.sendKeys(fn);
        r.lastName.sendKeys(ln);
        r.phoneNumber.sendKeys(phone);
        r.email.sendKeys(email);
        r.addressField.sendKeys(address);
        r.cityField.sendKeys(city);
        r.stateField.sendKeys(state);
        r.postalCode.sendKeys(postalCode);

        Select select=new Select(r.countryDropdown);
        select.selectByVisibleText(country);
        r.username.sendKeys(username);
        r.password.sendKeys(password);
        r.confirmPassword.sendKeys(confirmPassword);

    }

}
