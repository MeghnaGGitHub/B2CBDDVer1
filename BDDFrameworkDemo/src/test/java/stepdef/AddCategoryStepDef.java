package stepdef;
import com.onrender.util.Keywords;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.Color;
//import org.junit.Assert;
import java.io.File;
import java.io.FileNotFoundException;
public class AddCategoryStepDef {
    Keywords key;
    @Then("Category dropdown_menu has two options")
    public void categoryDropdown_menuHasTwoOptions() throws FileNotFoundException, InterruptedException{
        key= new Keywords();
        key.clickLocator("//button[text()='Category']");
        Thread.sleep(100);
    }
    @When("Admin clicks on Add-category option")
    public void admin_clicks_on_add_category_option() throws FileNotFoundException{
    key.clickLocator("//div[text()='Add Category']");
    }
    @Then("Add Category form is visible in Admin Dashboard")
    public void add_category_form_is_visible_in_admin_dashboard() throws FileNotFoundException{
    //key.clickLocator(".//form[@class='w-full mx-auto p-4']");
        String expectedAddCategory= key.getText("//h2[text()='CATEGORY']");
        Assert.assertEquals(expectedAddCategory,"CATEGORY");
    }
    @Then("Admin enters category name")
    public void admin_enters_category_name() throws FileNotFoundException {
    key.setText("//input[@name='category']","Spices");
    }
    @Then("Admin verify default color of header pallete is black")
    public void admin_verify_default_color_of_header_pallete_is_black() throws FileNotFoundException{
//        String expectedColorHex = "rgb([0,0,0])";
//        String expectedColorRGB = Color.fromString(expectedColorHex).asRgb();
        String actualColor = key.verifyHeaderColor("//input[@name='color']");
//        String actualColorRGB = Color.fromString(actualColor).asRgb();
        Assert.assertEquals("Color is black:", "#000000", actualColor);
    }
    @And("Admin selects Header color")
    public void adminSelectsHeaderColor() throws FileNotFoundException {
        key.setColor("input[name='color']","#df1111");
    }
    @And("Admin selects  Sub-category option")
    public void adminSelectsSubCategoryOption() throws FileNotFoundException {
        key.clickLocator("//span[@class='slider rounded']");
    }
    @Then("Admin Choose File to upload image")
    public void admin_choose_file_to_upload_image() throws FileNotFoundException, InterruptedException {
        File f = new File("src/test/resources/CategoryImages/myENGLISH.jpeg");
        System.out.println("Is file found :"+f.exists());
        //key.uploadFile("//input[@type='file']","src/test/resources/CategoryImages/myENGLISH.jpeg");
        key.uploadFileUsingJavaScript(key.getFirefoxDriver(), ,f);
    }
    @And("Admin clicks on Save button")
    public void adminClicksOnSaveButton() throws FileNotFoundException {
        key.clickLocator(".//button[text()='SAVE']");
        // for DISCARD btn xpath-> .//button[text()='DISCARD']
    }
    @Then("Category added successfully msg is displayed")
    public void category_added_successfully_msg_is_displayed() {

    }
}