package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	WebDriver driver;
	@Given("Launch the browser")
	public void launch_the_browser() {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver(); 
	}

	@Given("open the facebook application")
	public void open_the_facebook_application() {
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    
	}

	
	@When("Enter the {string} and {string}")
	public void enter_the_and(String username, String password) {
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	    
	    
	}
	@When("click the login button")
	public void click_the_login_button() {
		driver.findElement(By.name("login")).click();
	    
	}

	@Then("Validate the login message")
	public void validate_the_login_message() {
		
		System.out.println("Valid");
	    
	}

	@Then("close the browser")
	public void close_the_browser() {
	    
		driver.quit();
		
	}

	
}