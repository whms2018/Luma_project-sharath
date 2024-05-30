package Project;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Login_page 
{
	public static WebDriver driver;
	public static Logger log=LogManager.getLogger(Login_page.class);
  @Test(dataProvider = "logindata")
  public void login_with_valid_and_invalidcridentials(String uname, String pwd) 
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys(uname);
	  proj_pom.loginpasswordfield.sendKeys(pwd);
	  proj_pom.loginbuttoon.click(); 
	  if(proj_pom.logininvalidcridentials.isDisplayed())
	  {
		  log.info(proj_pom.logininvalidcridentials.getText()); 
	  }
	  else
	  {	  
		  log.info(proj_pom.signinhome.getText());
	  }
  }
  @DataProvider(name="logindata")
  public Object[][] datapass() 
  {
	  Object[][] data=new Object[1][2];
	  data [0][0]="sharath701@gmail.com";
	  data [0][1]="Password@123";
	  //data [1][0]="sharath";
	  //data [1][1]="Password";
	return data;
  }
  @SuppressWarnings("deprecation")
@BeforeTest
  public void openbrowser()
  {
	  driver=new ChromeDriver(); 
	  driver.manage().window().maximize();
	  log.info("opened the browser");
	  driver.get("https://magento.softwaretestingboard.com/");
	  log.info("open the site");
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
  }

  @AfterTest
  public void close() 
  {
	  driver.quit();  
  }

}
