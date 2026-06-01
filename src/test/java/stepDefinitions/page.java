package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page {

    WebDriver driver;

    public page(WebDriver driver) {

        this.driver = driver;
    }

    // LOGIN LOCATORS

    By myAccount =
    By.xpath("//span[text()='My Account']");

    By loginOption =
    By.linkText("Login");

    By emailField =
    By.id("input-email");

    By passwordField =
    By.id("input-password");

    By loginButton =
    By.xpath("//input[@value='Login']");

    // SEARCH LOCATORS

    By searchField =
    By.name("search");

    By searchButton =
    By.xpath("//button[@class='btn btn-default btn-lg']");

    // ADD TO CART

    By addToCart =
    By.xpath("(//span[text()='Add to Cart'])[1]");

    // CART

    By cartButton =
    By.id("cart-total");

    By checkoutButton =
    By.linkText("Checkout");

    // METHODS

    public void openLoginPage() {

        driver.findElement(myAccount).click();

        driver.findElement(loginOption).click();

        System.out.println("Login Page Opened");
    }

    public void enterEmail(String email) {

        driver.findElement(emailField).sendKeys(email);

        System.out.println("Email Entered");
    }

    public void enterPassword(String password) {

        driver.findElement(passwordField).sendKeys(password);

        System.out.println("Password Entered");
    }

    public void clickLogin() {

        driver.findElement(loginButton).click();

        System.out.println("Login Button Clicked");
    }

    public void searchProduct(String product) {

        driver.findElement(searchField).sendKeys(product);

        driver.findElement(searchButton).click();

        System.out.println("Product Searched");
    }

    public void addProductToCart() {

        try {

            Thread.sleep(3000);

        } catch (Exception e) {

        }

        driver.findElement(addToCart).click();

        System.out.println("Product Added To Cart");
    }

    public void clickCartButton() {

        try {

            Thread.sleep(3000);

        } catch (Exception e) {

        }

        driver.findElement(cartButton).click();

        System.out.println("Cart Button Clicked");
    }

    public void clickCheckout() {

        try {

            Thread.sleep(3000);

        } catch (Exception e) {

        }

        driver.findElement(checkoutButton).click();

        System.out.println("Checkout Button Clicked");
    }
}