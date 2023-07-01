package signupDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignupStepDef {
	public WebDriver driver;
	 
@Given("User is on home page")
public void user_is_on_home_page() {
	
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	   driver.get("https://www.automationexercise.com/");
	   driver.manage().window().maximize(); 
}

@When("User clicking the signup\\/log in link")
public void user_clicking_the_signup_log_in_link() {
	 
	   driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
	   System.out.println("opening the page");
	   
}

@Then("User should be in the sign up\\/log in page")
public void user_should_be_in_the_sign_up_log_in_page() {
	   String url = driver.getCurrentUrl();
	   Assert.assertTrue(url.contains("login"));
	   System.out.println("user is in signup/log in page");
}


}
