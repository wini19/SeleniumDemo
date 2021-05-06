package selWaits;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartProject {
	ChromeDriver driver;
	
	String url = "http://flipkart.com";
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\eclipse-workspace\\libs\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		// wait 60 secs for page to load
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
//		 wait 6-10 secs for web elements to load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
	}
	
	public void mouseHover() {
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//p[contains(text(),'Electronics')]")).click();
		
		WebElement electronicsLink = driver.findElement(By.xpath("//span[@class='_2I9KP_']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(electronicsLink).build().perform();
		
		WebElement samsungLink = driver.findElement(By.linkText("Samsung"));
		
		action.moveToElement(samsungLink).click().build().perform();
		
	}
		
		
	}


