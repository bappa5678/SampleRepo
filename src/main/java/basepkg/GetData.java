package basepkg;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {

	public static void main(String[] args) throws Exception 

	{
		
		
		//Response resp =RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		//System.out.println(resp.getStatusCode());
		
		System.out.println("This is before webdriver");  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\28693\\Desktop\\EclipseWorkSpace\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		try {
		
		   driver.manage().window().maximize();  
		    driver.get("http://www.google.com/");
		    		   
		    WebDriverWait wait = new WebDriverWait(driver,60);
		       wait.until(new ExpectedCondition<Boolean>(){
		           @Override
		           public Boolean apply(WebDriver d){
		               return ((JavascriptExecutor)d).executeScript("return document.readyState").equals("complete");
		           }
		       });
		    
		    
		    
		    
		    
	    driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium  abdjhdsgksjhgk");
		   driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		  Thread.sleep(5000);
		   takeSnapShot(driver, "C:\\Users\\28693\\Desktop\\snapshot\\test.jpeg") ;  
		  
		  System.out.println("After browser Launch");
		    driver.quit();
       System.out.println("This is a test line");
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			driver.quit();
		}
		
	}
	
	
	 public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

	        //Convert web driver object to TakeScreenshot

	        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File(fileWithPath);

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);

	    }
	
	

}
