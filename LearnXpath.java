package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnXpath {
	
	public static void main(String[] args) {
		
		
		//to launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//to get a url 
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to maximize the Screen
		driver.manage().window().maximize();
		
		//xpath for username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		
		//xpath for password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//xpath for login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//Xpath for CRM/SFA link click
		driver.findElement(By.xpath("//a[contains(text(),'CRM/')]")).click();
		
		//Xpath for lead click
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//Xpath for click Create Lead
        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
        
		//Xpath for enter companyname in create lead page
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		
		//Xpath for enter firstname in create lead page
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Chandru");
		
		//Xpath for enter lastname in create lead page
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S");
		
		//Xpath for select a value for source using index value
	    WebElement source = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
	   
	    Select obj = new Select(source);
	
	    obj.selectByIndex(4);
	    
	    //Xpath for select a value for marketingcampaign using selectvalue
	    WebElement MarketingCampaign = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		   
	    Select obj1 = new Select(MarketingCampaign);
	    
	    obj1.selectByValue("9001");
	    
	    //Xpath for select a value for ownership using index value
        WebElement OwnerShip = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
	    
	    Select obj2 = new Select(OwnerShip);
	    
	    obj2.selectByIndex(5);
	    
	    //Xpath for select a value for country using visibletext
	    WebElement Country = driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']"));
		
        Select obj3 = new Select(Country);
        
        obj3.selectByVisibleText("India");
        
        //Xpath for click the create lead button
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        
        //Xpath for click the edit button
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        
        //Xpath for enter the value in title field
        driver.findElement(By.xpath("//input[@id='updateLeadForm_generalProfTitle']")).sendKeys("Xpath");
        
	    //Xpath for click the update button
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    
	    //Xpath for click the delete button
	    driver.findElement(By.xpath("//a[text()='Delete']")).click();
	    
	    
		
		
		
		
		
		

		
		
		
	}

}
