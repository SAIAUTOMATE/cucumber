import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class selDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty(null, null)
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
	driver.getTitle();
System.out.println(driver.getCurrentUrl());
	Thread.sleep(4000);
	System.out.println("title is "+driver.getTitle());
	driver.findElement(By.className("")).click();
	driver.close();
//driver.quit();
	}

}
