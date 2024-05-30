package Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Home_page 
{
	public static WebDriver driver;
	public static Logger log=LogManager.getLogger(Home_page.class);
  @Test(priority=1)
  public void homepage_whats_next()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.whatnext.click();
	  if(proj_pom.whatnextvalidation.isDisplayed())
	  {
	  log.info(proj_pom.whatnextvalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=2)
  public void homepage_women()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  //proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.women.click();
	  if(proj_pom.womenvalidation.isDisplayed())
	  {
	  log.info(proj_pom.womenvalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=3)
  public void homepage_men()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.men.click();
	  if(proj_pom.menvalidation.isDisplayed())
	  {
	  log.info(proj_pom.addressvalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=4)
  public void homepage_gear()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.gear.click();
	  if(proj_pom.gearvalidation.isDisplayed())
	  {
	  log.info(proj_pom.gearvalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=5)
  public void homepage_training()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.training.click();
	  if(proj_pom.trainingvalidation.isDisplayed())
	  {
	  log.info(proj_pom.trainingvalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=6)
  public void homepage_sale()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.sale.click();
	  if(proj_pom.salevalidation.isDisplayed())
	  {
	  log.info(proj_pom.salevalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=7)
  public void homepage_myaccount()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.custdropdown.click();
	  proj_pom.myaccountbutton.click();
	  //proj_pom.myaccount.click();
	  if(proj_pom.myaccountvalidation.isDisplayed())
	  {
	  log.info(proj_pom.myaccountvalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=8)
  public void homepage_myorders()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click();
	  proj_pom.custdropdown.click();
	  proj_pom.myaccountbutton.click();
	  proj_pom.myorder.click();
	  if(proj_pom.myordervalidation.isDisplayed())
	  {
	  log.info(proj_pom.myordervalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=9)
  public void homepage_mydownloadableproducts()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click();
	  proj_pom.custdropdown.click();
	  proj_pom.myaccountbutton.click();
	  proj_pom.mydownload.click();
	  if(proj_pom.mydownloadvalidation.isDisplayed())
	  {
	  log.info(proj_pom.mydownloadvalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=10)
  public void homepage_Mywishlist()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.custdropdown.click();
	  proj_pom.myaccountbutton.click();
	  proj_pom.mywish.click();
	  if(proj_pom.mywishvalidation.isDisplayed())
	  {
	  log.info(proj_pom.mywishvalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=11)
  public void homepage_addressbook()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.custdropdown.click();
	  proj_pom.myaccountbutton.click();
	  proj_pom.address.click();
	  if(proj_pom.addressvalidation.isDisplayed())
	  {
	  log.info(proj_pom.addressvalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=12)
  public void homepage_accountinformation()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.custdropdown.click();
	  proj_pom.myaccountbutton.click();
	  proj_pom.accountinfo.click();
	  if(proj_pom.accountinfovalidation.isDisplayed())
	  {
	  log.info(proj_pom.accountinfovalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=13)
  public void homepage_storedpaymentmethods()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.custdropdown.click();
	  proj_pom.myaccountbutton.click();
	  proj_pom.storedpayment.click();
	  if(proj_pom.storedpaymentvalidation.isDisplayed())
	  {
	  log.info(proj_pom.storedpaymentvalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=14)
  public void homepage_myproductreview()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.custdropdown.click();
	  proj_pom.myaccountbutton.click();
	  proj_pom.myproductreview.click();
	  if(proj_pom.myproductrevvalidation.isDisplayed())
	  {
	  log.info(proj_pom.myproductrevvalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=15)
  public void homepage_logobutton()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.logobutton.click();
	  if(proj_pom.logininvalidcridentials.isDisplayed())
	  {
		  log.info(proj_pom.logininvalidcridentials.getText()); 
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=16)
  public void homepage_support()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.logobutton.click();
	  proj_pom.support.click();
	  if(proj_pom.supportvalidation.isDisplayed())
	  {
	  log.info(proj_pom.supportvalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=17)
  public void homepage_search()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.logobutton.click();
	  proj_pom.searchfield.sendKeys("shoes");
	  proj_pom.searchbutton.click();
	  if(proj_pom.searchvalidtaion.isDisplayed())
	  {
	  log.info(proj_pom.searchvalidtaion.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=18)
  public void homepage_yogabanner()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.logobutton.click();
	  proj_pom.yoga.click();
	  if(proj_pom.yogavalidation.isDisplayed())
	  {
	  log.info(proj_pom.yogavalidation.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @Test(priority=19)
  public void homepage_signout()
  {
	  PageFactory.initElements(driver, proj_pom.class);
	  proj_pom.signinlink.click();
	  proj_pom.loginemailfield.sendKeys("sharath701@gmail.com");
	  proj_pom.loginpasswordfield.sendKeys("Password@123");
	  proj_pom.loginbuttoon.click(); 
	  proj_pom.logobutton.click();
	  proj_pom.custdropdown.click();
	  proj_pom.signoutbuton.click();
	  if(proj_pom.signoutpage.isDisplayed())
	  {
	  log.info(proj_pom.signoutpage.getText());
	  }
	  else
	  {
		  log.warn("Failed");
	  }
  }
  @BeforeTest
  public void openbrowser() 
  {
	  driver=new FirefoxDriver(); 
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
