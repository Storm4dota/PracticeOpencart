package testBases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.sun.tools.javac.util.Log;

public class BaseClass {
	 
	 public static WebDriver driver;	 	 
	 public Logger logger;
	 public Properties p;
	 
	 
	 @SuppressWarnings("deprecation")
	@BeforeClass
	 @Parameters({"os","browser"})
	 public void setup(String os,String br) throws IOException
	 {
		 FileReader file=new FileReader("./src//test//resources//config.properties");		 
		 p=new Properties();
		 p.load(file);
		 
		 if(p.getProperty("execution_envr").equalsIgnoreCase("remote"))
		 {
			 DesiredCapabilities cap=new DesiredCapabilities();
			 
			 if(os.equalsIgnoreCase("windows"))
			 {
				 cap.setPlatform(Platform.WIN10);
			 }
			 else if(os.equalsIgnoreCase("mac")) 
			 {
				 cap.setPlatform(Platform.MAC);
			 }
			 else if(os.equalsIgnoreCase("linux"))
			 {
				 cap.setPlatform(Platform.LINUX);
			 }
			 else
			 {
				 System.out.println("No matching os");
				 return;
			 }
			 
			 //browser
			 switch(br.toLowerCase())
			 {
			 case "chrome"  : cap.setBrowserName("chrome"); break;
			 case "edge"   : cap.setBrowserName("MicrosoftEdge"); break;
			 default : System.out.println("No matching browser"); return;
			 		
			 }
			 driver=new RemoteWebDriver(new URL("http://192.168.1.5:4444"),cap);
			 
			 
		 }
		//browser 
	   if(p.getProperty("execution_envr").equalsIgnoreCase("local"))
		 { 
		   switch(br.toLowerCase())
			 {		      		 
			 case "chrome" : driver=new ChromeDriver(); break;
			 case "edge"  : driver=new EdgeDriver(); break ;
			 case "firefox" : driver=new FirefoxDriver(); break;
			 default : System.out.println("Invalid browser"); return;
			 }
		 }
		 
		
		 
		 
		 
		 
		 
		 logger =LogManager.getLogger(this.getClass());
		 
		 
		// driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
		 driver.get(p.getProperty("AppURL"));
				 
	 }
	 @AfterClass
		public void teardown() throws InterruptedException
		{
		 Thread.sleep(3000);
		 driver.close();
		}
	 
	 public String randomString()
	 {
		 String generatedname=RandomStringUtils.randomAlphabetic(5);
		 return generatedname;
		 
	 }
	 
	 public String randomnumber()
	 {
		 String generatednum=RandomStringUtils.randomAlphanumeric(10);
		 return generatednum;
	 }
	 
	 public String alphanumeric()
	 {
		 String randomname=RandomStringUtils.randomAlphabetic(3);
		 String randomnum=RandomStringUtils.randomAlphanumeric(4);
		 return(randomname+"!@"+randomnum);
	 }
	 
	 
	 
	 
	 
	 
	public String captureScreen(String tname) throws IOException 
	   {
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenShot = (TakesScreenshot) driver;
		File sourceFile = takesScreenShot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
		
		return targetFilePath;
	
	    }
	

}
