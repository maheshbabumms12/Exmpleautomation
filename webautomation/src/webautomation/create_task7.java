package webautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Createcustomer_m7
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
    	//oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
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
    static void createtask()
    {
    	try {                           
    	oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click();
    	Thread.sleep(2000);
    	oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
    	Thread.sleep(2000);          
    	oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")).sendKeys("task1");
    	oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_commitBtn\']/div/span")).click();
    	
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    static void deletetask()
    {
    	try {                           
                           
    	   oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[2]/tbody/tr/td[2]")).click();
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
public class create_task7 {
	public static void main(String[] args) {
		Createcustomer_m7.launchBrowser();
		Createcustomer_m7.navigate();
		Createcustomer_m7.login();
		Createcustomer_m7.minimizeFlyOutWindow();
		Createcustomer_m7.createcustomer();
		Createcustomer_m7.createproject();
		Createcustomer_m7.createtask();
		Createcustomer_m7.deletetask();
		//Createcustomer_m7.deletecustomer();    
		//Createcustomer_m7.logout();
		//Createcustomer_m7.closeApplication();
	}

}
