package FirstSelenium.Seleniumprojec;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.briscoes.co.nz/");   
String title = driver.getTitle();
System.out.println("Current title is:" +title);
String pagesource= driver.getPageSource();
System.out.println("pagesource is" +pagesource);
driver.manage().window().maximize();
driver.findElement(By.xpath("//span[@class='icon-wrapper icon-cart']")).click();
driver.close();
driver.quit();


	
	}

}
