package Project;
import org.testng.annotations.Test;

import mvenproject.TestLogger;
//import mvenproject.propertieslog4j;

//import pom.pom1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
public class Register_page 
{
	public static WebDriver driver;
	public static Logger log=LogManager.getLogger(Register_page.class);
  @Test(priority=1)
  public void register_with_valid_inputs()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.createaccount.click();
	  proj_pom.fname.sendKeys("Ram");
	  proj_pom.lname.sendKeys("p");
	  proj_pom.email.sendKeys("sashna97@gmail.com");
	  proj_pom.pwd.sendKeys("password123");
	  proj_pom.cpwd.sendKeys("password123");
	  proj_pom.regbutton.submit();
	  if(proj_pom.regbuttonvalidation.isDisplayed())
	  {
		  log.info(proj_pom.regbuttonvalidation.getText());
	  }
	  else
	  {
	  log.info("account creation failed");
	  }
  }	
  @Test(priority=2)
  public void register_with_invalid_inputs()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.createaccount.click();
	  proj_pom.fname.sendKeys("387358#$%");
	  proj_pom.lname.sendKeys("p^%$");
	  proj_pom.email.sendKeys("sashna97@gma%$%#il.com");
	  proj_pom.pwd.sendKeys("pawor");
	  proj_pom.cpwd.sendKeys("password123");
	  proj_pom.regbutton.submit(); 
	  log.info("account creation failed");  
  }
  @Test(priority=3)
  public void register_with_empty_inputs()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.regbutton.submit();
	  if(proj_pom.fnerror.isDisplayed())
	  {
	  log.info(proj_pom.fnerror.getText());
	  }
  }
  @Test(priority=4)
  public void register_with_invalid_email()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.createaccount.click();
	  proj_pom.fname.sendKeys("387358#$%");
	  proj_pom.lname.sendKeys("p^%$");
	  proj_pom.email.sendKeys("sashna97@gma%$%#il.com");
	  proj_pom.pwd.sendKeys("password123");
	  proj_pom.cpwd.sendKeys("password123");
	  proj_pom.regbutton.submit(); 
	  if(proj_pom.emailformaterror.isDisplayed())
	  {
	  log.info(proj_pom.emailformaterror.getText());
	  }
  }
  @Test(priority=5)
  public void register_with_invalid_password()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.createaccount.click();
	  proj_pom.fname.sendKeys("Ram");
	  proj_pom.lname.sendKeys("p");
	  proj_pom.email.sendKeys("sashna97@gmail.com");
	  proj_pom.pwd.sendKeys("pass@#");
	  proj_pom.cpwd.sendKeys("password123");
	  proj_pom.regbutton.submit(); 
	  if(proj_pom.pwdformaterror.isDisplayed())
	  {
	  log.info(proj_pom.pwdformaterror.getText());
	  }
  }
  @Test(priority=6)
  public void register_with_invalid_confirmpassword()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.createaccount.click();
	  proj_pom.fname.sendKeys("Ram");
	  proj_pom.lname.sendKeys("p");
	  proj_pom.email.sendKeys("sashna97@gmail.com");
	  proj_pom.pwd.sendKeys("password123");
	  proj_pom.cpwd.sendKeys("pass");
	  proj_pom.regbutton.submit(); 
	  if(proj_pom.cpwdformaterror.isDisplayed())
	  {
	  log.info(proj_pom.cpwdformaterror.getText());
	  }
  }
  
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
