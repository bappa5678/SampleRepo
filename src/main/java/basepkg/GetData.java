package basepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
		    
	    driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium  abdjhdsgksjhgk");
		   driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		  Thread.sleep(5000);	
		    driver.quit();
       System.out.println("This is a test line");
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			driver.quit();
		}
		
	}

}
