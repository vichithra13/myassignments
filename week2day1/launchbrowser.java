package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class launchbrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vichithra");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
	    driver.findElement(By.className("smallsubmit")).click();
	    WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select dd=new Select(source);
	    dd.selectByIndex(2);
	    
	    Thread.sleep(2000);
	    dd.selectByValue("LEAD_EXISTCUST");
	    
	    Thread.sleep(2000);
	    dd.selectByVisibleText("Self Generated");
	    driver.findElement(By.className("smallsubmit")).click();
	    
	
	    WebElement marcamp=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select m=new Select(marcamp);
	    m.selectByIndex(3);
	    
	    Thread.sleep(2000);
	    m.selectByValue("CATRQ_CARNDRIVER");
	    
	    Thread.sleep(2000);
	    m.selectByVisibleText("Car and Drive");
	    driver.findElement(By.className("smallsubmit")).click();
	    
	    
	    
	    
	    
	    
 
						
		
		
		
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
