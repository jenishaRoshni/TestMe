package cucumber12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class mercurylogin {
WebDriver driver;
@Given("^user is on the home page$")
public void user_is_on_the_home_page() throws Throwable {
    
	System.setProperty("webdriver.chrome.driver", "C:\\NexGenTesting\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demoaut.com/");
}

@When("^user enter correct \"(.*?)\" and \"(.*?)\"$")
public void user_enter_correct_and(String a, String b) throws Throwable {
    
	driver.findElement(By.name("userName")).sendKeys(a);

driver.findElement(By.name("password")).sendKeys(b);
driver.findElement(By.name("login")).click();
}
@Then("^user does succesful login$")
public void user_does_succesful_login() throws Throwable {
    
	driver.navigate().back();
}



}
