package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class r {
	ChromeDriver ob;
@Given("user is on login page")
public void user_is_on_login_page() {
    System.out.println("In login page");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya Udhayakumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	ob= new ChromeDriver();
	
	ob.get("http://www.mycontactform.com");
	
	

}

@When("user enters username and password")
public void user_enters_username_and_password() {
	 System.out.println("Entering username and password");
	//id=user
		ob.findElementById("user").sendKeys("Ramya123");
		
		//name=pass
		ob.findElementByName("pass").sendKeys("1555");
		
		
}

@And("click on login button")
public void click_on_login_button() {
	System.out.println("clicking on login button");
	//classname=btn_log
		 ob.findElementByClassName("btn_log").click();
}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() throws InterruptedException {
	System.out.println("on home page");
	Thread.sleep(3000);
	ob.quit();
}

}
