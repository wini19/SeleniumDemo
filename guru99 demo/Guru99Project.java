package guru99.project;

/* import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; */
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {
	
	ChromeDriver driver;
	
	String url = "http://demo.guru99.com/v4/";
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\eclipse-workspace\\libs\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get(url);
	}
	
	public void login(String username, String password) {
		
		// "By" : a class which gives you methods to identify web elements using locators
		
		WebElement usernameElement = driver.findElement(By.name("uid"));
		
		usernameElement.sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("btnLogin")).click();
		
		
	}
	
	//PART 2
	
	public void addCustomer() {
	
		driver.findElement(By.linkText("New Customer")).click();
		
		driver.findElement(By.name("name")).sendKeys("Anon");
		
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		//absolute xpath: /html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]
		
		driver.findElement(By.name("dob")).sendKeys("14-12-1990");
		
		driver.findElement(By.name("addr")).sendKeys("Indore MP");
		
		driver.findElement(By.name("city")).sendKeys("Indore");
		
		driver.findElement(By.name("state")).sendKeys("Madhya Pradesh");
		
		driver.findElement(By.name("pinno")).sendKeys("452452");
		
		driver.findElement(By.name("telephoneno")).sendKeys("9929929922");
		
		//to get unique email id
		String emailId = "sample" + System.currentTimeMillis() + "id@abc.com" ; 
		System.out.println("Email id used: " + emailId);
		
		//driver.findElement(By.name("emailid")).sendKeys("ynathwani_me20@thapar.edu");
		
		driver.findElement(By.name("emailid")).sendKeys(emailId);
		
		driver.findElement(By.name("password")).sendKeys("passw1234");
		
		driver.findElement(By.name("sub")).click();
		
		// PART 3
		//fetching customer id 
		
		//get nearest element that you can locate and use relative xpath
		String custId = driver.findElementByXPath("//table[@name='customer']/tbody/tr[4]/td[2]").getText();
		
		
		System.out.println("Customer ID = " + custId); 
		
		// driver.quit(); // -- close all windows
		
	}
	

}
