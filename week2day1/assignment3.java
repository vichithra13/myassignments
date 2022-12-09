package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();	
		driver.findElement(By.linkText("Create Contacts")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("vichithra");
		driver.findElement(By.id("lastNameField")).sendKeys("s");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("firstName");
	    String Title = driver.getTitle();
			System.out.println(Title);

	


		
		


	}

}
