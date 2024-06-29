package Inteview_misslenious;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File; 
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class locators {

	 

	public static void main(String[] args) throws InterruptedException {
	 
		ChromeOptions		chromeOptions = new ChromeOptions();
		WebDriver driver = new ChromeDriver(chromeOptions);
		chromeOptions.addArguments("--headless"); 
	 driver.manage().window().maximize();
	 driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("saivogeti@gmail.com");
driver.findElement(By.name("inputPassword")).sendKeys("admin");
driver.findElement(By.className("signInBtn")).click();

//DriverManager.getConnection("https://rahulshettyacademy.com/locatorspractice/", "saivogeti@gmail.com", "admin" )



Thread.sleep(3000);
System.out.println(driver.findElement(By.className("error")).getText());
System.out.println(driver.getTitle());
	driver.findElement(By.linkText("Forgot your password?")).click();
//driver.quit();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("babubangaram");
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahul@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9876543210");
	driver.findElement(By.className("reset-pwd-btn")).click();
	String x=driver.findElement(By.className("infoMsg")).getText();
	//String y[]=x.split("'");

	driver.findElement(By.className("go-to-login-btn")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("inputUsername")).sendKeys("saivogeti@gmail.com");
	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	driver.findElement(By.className("signInBtn")).click();
	System.out.println(x);
	Thread.sleep(3000);
System.out.println(driver.findElement(By.xpath("//p[text()]")).getText());
Thread.sleep(3000);
System.out.println("quitted the browsers as per ur requiest");
  

File shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 
	
driver.quit();

	}

}
