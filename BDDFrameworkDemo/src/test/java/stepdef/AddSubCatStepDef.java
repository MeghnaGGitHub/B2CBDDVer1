package stepdef;

import com.onrender.util.Keywords;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.FileNotFoundException;

public class AddSubCatStepDef {
        Keywords key;
        @Then("SubCategory dropdown has {int} options")
        public void sub_category_dropdown_has_options() throws FileNotFoundException {
                key=new Keywords();
                key.selectOptionFromCategoryDropdown(".//select[@name='category']","Vegetables");
        }
        @When("Admin clicks on Edit-Subcategory option")
        public void admin_clicks_on_edit_subcategory_option() {
        }
        @Then("Add SubCategory form is visible in Admin Dashboard")
        public void add_sub_category_form_is_visible_in_admin_dashboard() {
        }
        @Then("Admin selects Category name")
        public void admin_selects_category_name() {

        }
        @Then("enter SubCategory name")
        public void enter_sub_category_name() {
        }
        @Then("Selects Header color")
        public void selects_header_color() {
        }
        @Then("selects  Product Allowed option")
        public void selects_product_allowed_option() {
        }
        @Then("Choose File to upload image")
        public void choose_file_to_upload_image() {
        }
        @Then("clicks on Save button")
        public void clicks_on_save_button() {
        }
        @Then("SubCategory added successfully msg is displayed.")
        public void sub_category_added_successfully_msg_is_displayed() {
        }
    }

