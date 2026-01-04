package com.test.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	 // WebDriver reference passed from Step Definition
	private WebDriver driver;

    // Locator for all product price elements on the page
    // Example text: "$360"
    private By productPrices = By.xpath("//*[@class='card-block']//h5");

 // Constructor initializes driver
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Opens the application URL

    public void open() {
        driver.navigate().to("https://www.demoblaze.com/");
    }

    // Returns all price WebElements

    public List<WebElement> getAllPriceElements() {
        return driver.findElements(productPrices);
    }
    
    // Converts price text into integers
    // "$360" -> 360

    public List<Integer> getAllPricesAsInt() {
        List<Integer> allPrice = new ArrayList<>();
        List<WebElement> productPrice = getAllPriceElements();

    // Loop through each WebElement using for-loop
        for (int i = 0; i < productPrice.size(); i++) {
            String text = productPrice.get(i).getText().replace("$", "");
            allPrice.add(Integer.parseInt(text));
        }
        return allPrice;
    }
}
