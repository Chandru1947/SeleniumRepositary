package week3.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnBrowser {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		String title = driver.getTitle();

		System.out.println(title);

		if (title.equals("Leaftaps - Testleaf Automation Platform")) {

			System.out.println("Verified");

		}

		else {

			System.out.println("Not Verified");

		}

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/S")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Chandru");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	
	    Select obj = new Select(source);
	
	    obj.selectByIndex(4);
	
	    obj.selectByVisibleText("Employee");
	    
	    WebElement MarketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	   
	    Select obj1 = new Select(MarketingCampaign);
	    
	    obj1.selectByValue("9001");
	    
	    WebElement OwnerShip = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    
	    Select obj2 = new Select(OwnerShip);
	    
	    obj2.selectByIndex(5);
	    
	    WebElement Country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	
        Select obj3 = new Select(Country);
        
        obj3.selectByVisibleText("India");
        
        driver.findElement(By.name("submitButton")).click();
        
        String title2 = driver.getTitle();
        
        System.out.println(title2);
        
        
        
        
        
        
        
	}

}
