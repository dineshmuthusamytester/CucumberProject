package flipkart.stepdefenition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchase {
	public static WebDriver driver;
	
	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver ();
		driver .get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}


	@When("user search mobiles")
	public void user_search_mobiles()  {
		
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		
	   
	}

	@When("user choose mobiles")
	public void user_choose_mobiles() throws InterruptedException {
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung mobiles");
			
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);	
	 ;
	}

	@When("user add mobile to add to cart and doing payment")
	public void user_add_mobile_to_add_to_cart_and_doing_payment() {
		 driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F22 (Denim Black, 64 GB)']")).click();
		 driver.findElement(By.xpath("//button[text()='GO TO CART']")).click ();
		
	   
	}

	
}

