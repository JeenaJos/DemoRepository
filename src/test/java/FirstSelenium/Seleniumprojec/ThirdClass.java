package FirstSelenium.Seleniumprojec;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
   driver.get("https://skryabin.com/webdriver/html/sample.html");
   driver.findElement(By.name("username")).click();
   driver.findElement(By.name("username")).sendKeys("Jeenamanu");
   driver.findElement(By.xpath("//input[@name='username']"));
	}
	}


