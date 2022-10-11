package variousConcept;

import java.util.concurrent.TimeUnit;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	WebDriver driver;
	@Before
	public void inti() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mwamb\\Selenium\\1stSelenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void testLocator() {
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("sex")).click();
		
		//upload file
		//if the tag id is anything else than input then we use a class called Robot
		//driver.findElement(By.id("photo")).sendKeys("C:\\Users\\mwamb\\OneDrive\\Pictures\\Screenshots\\2022-02-26"); t
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		//driver.findElement(By.partialLinkText("OS-API")).click();
		
		//css
		driver.findElement(By.cssSelector("input#exp-3")).click();
		//driver.findElement(By.cssSelector("input[id='tool-1']")).click();
		driver.findElement(By.cssSelector("input[name='tool'][value='Selenium Webdriver']")).click();
		
		//xpath absolute
		//driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("jbxhbhjd");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("bdwhb");
		//x[path with multiple values
		driver.findElement(By.xpath("//input[@name='exp'and @ value='3']")).click();
		
		//text method
		//driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click(); //also with contains method see below
		//contains methods
		driver.findElement(By.xpath("//strong[contains(text(),'Link Test : New Page')]")).click(); //text can be partial
	
	}
		public void nextTest() {
			System.out.println("pring it out");
		}
	
	
}	

