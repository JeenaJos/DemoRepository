package TestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestNG {
  @Test
  public void f() {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	   driver.get("https://www.automationexercise.com/");
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
	   System.out.println("Sign in");
	   String url = driver.getCurrentUrl();
	   Assert.assertTrue(url.contains("login"));
	   System.out.println("user is in signup/log in page");
	   driver.close();
	   driver.quit(); 
		}
  }

