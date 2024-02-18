package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class StepDefinition {

    private WebDriver driver;
    private Actions actions;

    @Before
    public void initialization() {
        driver = new ChromeDriver();
        actions = new Actions(driver);
    }

    @After
    public void afterScenario() {
        driver.quit();
    }

    @Given("the user visits {string}")
    public void the_user_visits(String endpoint) {
        String BASE_URL = "https://the-internet.herokuapp.com";
        driver.get(BASE_URL.concat(endpoint));
    }

    @When("the user hover over the {string} image")
    public void the_user_hover_over_the_image(String id) {
        WebElement element = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[" + id + "]"));
        actions.moveToElement(element).build().perform();
    }

    @Then("the {string} name should be visible")
    public void the_name_should_be_visible(String expected) {
        String actual = driver.findElement(By.xpath("(//h5[normalize-space()='name: user1'])[1]")).getText();
        Assert.assertEquals(actual, expected, "Please check name mismatch");
    }
}
