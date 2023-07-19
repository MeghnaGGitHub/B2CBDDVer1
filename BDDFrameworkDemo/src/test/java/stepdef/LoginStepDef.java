package stepdef;
import com.onrender.util.Keywords;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.FileNotFoundException;
import java.io.IOException;
public class LoginStepDef {
    Keywords key;
    @Given("Admin is already present on Login Page")
    public void admin_is_already_present_on_login_page() throws IOException {
        this.key=new Keywords();
        key.openPage(key.getConfigValue("env_url"));
    }
    @When("Admin enters valid Username")
    public void admin_enters_valid_username() throws IOException {
       key.setText(".//input[@name='username']",key.getConfigValue("username"));
    }
    @Then("Admin enters valid Password")
    public void admin_enters_valid_password() throws IOException {
    key.setText(".//input[@name='password']",key.getConfigValue("password"));
    }
    @Then("Admin should get a alert saying Please fill out this field")
    public void admin_should_get_a_alert_saying_please_fill_out_this_field() {
    }
    @Then("Admin clicks on LOGIN button")
    public void admin_clicks_on_login_button() throws FileNotFoundException {
    key.clickLocator("//button[contains(text(),'LOGIN')]");

    }
    @When("Admin of Login Page is:B2c ADMIN DASHBOARD")
    public void admin_of_login_page_is_b2c_admin_dashboard() {
    }
    @Then("Admin enters invalid Username and invalid Password")
    public void admin_enters_invalid_username_and_invalid_password() throws FileNotFoundException, InterruptedException {
        key.setText("//input[@name='username']","Meghna");
        key.setText("//input[@name='password']","@346$$");
    }
    @Then("Admin should get a pop-up displayed as Invalid Cred or Password!!")
    public void admin_should_get_a_pop_up_displayed_as_invalid_cred_or_password() {
          String actual_message=  key.handelAlert();
          Assert.assertEquals("Alert & Alert Message is displayed","Invalid Cred or Password!!",actual_message);
    }
    @Then("Admin enters invalid Username and valid Password")
    public void admin_enters_invalid_username_and_valid_password() throws FileNotFoundException {
        key.setText("//input[@name='username']","Meghn@");
        key.setText("//input[@name='password']","test1234");
    }
    @Then("Admin enters valid Username and invalid Password")
    public void admin_enters_valid_username_and_invalid_password() throws IOException {
        key.setText("//input[@name='username']", key.getConfigValue("username"));
        key.setText("//input[@name='password']","te!s#$4");
    }

    @Then("Verify title of page")
    public void verifyTitleOfPage() throws FileNotFoundException {
            String actual_title  =key.getPageTitle();
            System.out.println("Actual Title --- > "  + actual_title);
            Assert.assertEquals(actual_title,"B2C ADMIN DASHBOARD");
        }
    @When("Admin enters invalid Username")
    public void adminEntersInvalidUsername() throws FileNotFoundException {
        key.setText("//input[@name='username']","admin");
    }

    @And("Admin enters invalid Password")
    public void adminEntersInvalidPassword() throws FileNotFoundException {
        key.setText("//input[@name='password']","admin");
    }
    /*@AfterStep
    //TakesScreenshot scrShot=(TakesScreenshot)driver);
    public void addScreenshot(Scenario scenario){
        if (scenario.isFailed())
        {
            final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            //attach img file report(data,media type,name of the attachment)
            scenario.attach(screenshot,"image/png", scenario.getName());
        }*/
    }
