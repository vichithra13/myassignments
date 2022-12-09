package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vichithra");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("keerthi");
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("sales");
		driver.findElement(By.xpath("//input[@class='description']")).sendKeys("responsible for greeting customers");
		driver.findElement(By.xpath("//input[@type='Email address']")).sendKeys("vichithracdl@gmail.com");
	    driver.findElement(By.className("smallSubmit")).click();
	    String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("css");		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vichithra");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("divya");		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vichithra");
	    driver.findElement(By.className("smallSubmit")).click();
	    String Title = driver.getTitle();
		System.out.println(Title);
		


		

		
		

	}

}
