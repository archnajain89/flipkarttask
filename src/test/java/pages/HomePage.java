package pages;

import java.util.ResourceBundle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class HomePage 
{
	ResourceBundle rb;
	ChromeDriver driver;
	
	public HomePage(ChromeDriver driver)
	{
		this.driver=driver;
		rb=ResourceBundle.getBundle("Element");
	}
	
	public void findText() throws InterruptedException
	{
		
		Actions act=new Actions(driver);
		WebElement ele=driver.findElementByXPath(rb.getString("locatecat_byxpath"));
		act.moveToElement(ele).perform();
		System.out.println("Catgeory found");
		Thread.sleep(10000);
		driver.findElementByXPath(rb.getString("locatesubcatxpath")).click();
		System.out.println("subCatgeory found");
				
	}
	
	
	public void findAllinks()
	{
		
		try
		{
		java.util.List<WebElement> links = driver.findElementsByTagName("a");
		System.out.println("Total no. of links on this page is "+links.size());
		System.out.println("Links are given below:");
		//To find no. of web elements with anchor tag
		for(int i=1;i<=links.size();i++)
		{
			
			System.out.println(links.get(i).getText());
		}
		
		}
		
		catch(Exception e)
		{
			
		}
	}
	
	
	
	
	
}
