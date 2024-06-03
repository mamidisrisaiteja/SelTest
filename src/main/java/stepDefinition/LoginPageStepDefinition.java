package stepDefinition;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageStepDefinition {

    WebDriver driver;


    @Given("user is in login page")
    public void user_is_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();  // instead of system.set properties
        driver = new ChromeDriver();
        driver.get("https://ui.cogmento.com/");


    }

}
