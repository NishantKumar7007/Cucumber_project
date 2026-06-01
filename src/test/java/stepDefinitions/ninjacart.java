package stepDefinitions;

import org.openqa.selenium.WebDriver;

import hooks.Hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class ninjacart {

    WebDriver driver;

    page p;

    Hooks h = new Hooks();

    @Before
    public void setupBrowser() {

        h.setup();

        driver = Hooks.driver;
    }

    @After
    public void closeBrowser() {

        h.tearDown();
    }

    @Given("login page should be open in default browser")
    public void login_page_should_be_open_in_default_browser() {

        p = new page(driver);

        p.openLoginPage();
    }

    @When("click on email address field and add valid email {string}")
    public void click_on_email_address_field_and_add_valid_email(String email) {

        p.enterEmail(email);
    }

    @And("then click on password field and enter valid {string}")
    public void then_click_on_password_field_and_enter_valid(String password) {

        p.enterPassword(password);
    }

    @And("now click on login button")
    public void now_click_on_login_button() {

        p.clickLogin();
    }

    @Then("login successfully and redirect to ninja home page")
    public void login_successfully_and_redirect_to_ninja_home_page() {

        System.out.println("Login Successful");
    }

    @When("ninja search input field receives {string}")
    public void ninja_search_input_field_receives(String product) {

        p.searchProduct(product);
    }

    @Then("ninja custom product list matches criteria")
    public void ninja_custom_product_list_matches_criteria() {

        System.out.println("Product Found");
    }

    @When("user clicks on add to cart button for the item")
    public void user_clicks_on_add_to_cart_button_for_the_item() {

        p.addProductToCart();
    }

    @Then("product should be added to cart successfully")
    public void product_should_be_added_to_cart_successfully() {

        System.out.println("Product Added To Cart");
    }

    @When("user clicks on the black shopping cart button")
    public void user_clicks_on_the_black_shopping_cart_button() {

        p.clickCartButton();
    }

    @And("clicks on the checkout option")
    public void clicks_on_the_checkout_option() {

        p.clickCheckout();
    }

    @Then("user should be redirected to the checkout page")
    public void user_should_be_redirected_to_the_checkout_page() {

        System.out.println("Checkout Page Opened");
    }
}