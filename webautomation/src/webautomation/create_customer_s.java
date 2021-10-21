package webautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Createcustomer5
{
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\mahesh\\chromedriver_win32\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createcustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("testcustomer");
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("test description");
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    static void createproject()
    {
    	try {
    	oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
    	Thread.sleep(2000);           
    	oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
    	Thread.sleep(2000);            
		oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("testproject");
		Thread.sleep(2000);
		oBrowser.findElement(By.name("projectDescriptionField")).sendKeys("testproject desc");
		oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div/span")).click();
		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
		
    }
    static void deleteproject()
    {
    	try {
    	//oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[1]")).click();
    	//Thread.sleep(2000);           
    	oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
    	Thread.sleep(2000);            
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
		oBrowser.findElement(By.xpath("//*[@id='projectPanel_deleteConfirm_submitTitle']")).click();	 
		Thread.sleep(2000);
		}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
		
    }
	static void deletecustomer()
	{
		try
		{                                       
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitBtn']/div")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
public class create_customer_s {
	public static void main(String[] args) {
		Createcustomer5.launchBrowser();
		Createcustomer5.navigate();
		Createcustomer5.login();
		Createcustomer5.minimizeFlyOutWindow();
	    Createcustomer5.createcustomer();
	    Createcustomer5.createproject();
	    Createcustomer5.deleteproject();
	    Createcustomer5.deletecustomer();    
		Createcustomer5.logout();
		Createcustomer5.closeApplication();
	}

}
