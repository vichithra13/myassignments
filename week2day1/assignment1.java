package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

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
	    driver.findElement(By.xpath("//input[text()='firstNameLocal']")).sendKeys("keerthi");
		driver.findElement(By.xpath("//input[text()='departmentName']")).sendKeys("sales");
		driver.findElement(By.xpath("//input[text()='description']")).sendKeys("responsible for greeting customers");
		driver.findElement(By.xpath("//input[@type='Email address']")).sendKeys("vichithracdl@gmail.com");
	    driver.findElement(By.className("smallSubmit")).click();
	    String title = driver.getTitle();
		System.out.println(title);	
		

	}

}
