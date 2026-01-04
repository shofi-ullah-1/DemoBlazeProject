package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.pages.HomePage;
import com.test.utils.PriceResult;
import com.test.utils.PriceUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MaxMinSteps {

    // WebDriver instance for this scenario
    private WebDriver driver;

    // Page Object reference
    private HomePage homePage;

    // Holds all extracted prices
    private List<Integer> prices;

    @Given("Open chrome browser")
    public void open_chrome_browser() {

        // Launch Chrome browser
        driver = new ChromeDriver();

        // Standard browser setup
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Initialize page object
        homePage = new HomePage(driver);
    }

    @And("Go to application url")
    public void go_to_application_url() {
        // Navigate to the site
        homePage.open();
    }

    @When("I capture all the product price in a list")
    public void i_capture_all_the_product_price_in_a_list() {
        // Extract prices from UI via Page Object
        prices = homePage.getAllPricesAsInt();
    }

    @Then("I should be able to find 1st, 2nd, 3rd maximum and minimum price")
    public void i_should_be_able_to_find_1st_2nd_3rd_maximum_and_minimum_price() {

        try {
            // Calculate max and min using utility class
            PriceResult max3 = PriceUtils.top3Max(prices);
            PriceResult min3 = PriceUtils.top3Min(prices);

            // Print results (could be replaced with assertions)
            System.out.println("Top 3 Maximum: " + max3);
            System.out.println("Top 3 Minimum: " + min3);

        } finally {
            // Ensure browser always closes
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
