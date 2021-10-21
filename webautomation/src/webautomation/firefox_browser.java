package webautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class firefoxtest
{
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "D:\\mahesh\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		
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
}
public class firefox_browser {
	public static void main(String[] args) {
		firefoxtest.launchBrowser();
		firefoxtest.navigate();
		firefoxtest.closeApplication();
	}

}
