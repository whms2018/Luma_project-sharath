package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class proj_pom 
{
	public static WebDriver driver;
	//Register
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
	public static WebElement createaccount;
	@FindBy(id="firstname")
	public static WebElement fname;
	@FindBy(id="firstname-error")
	public static WebElement fnerror;
	@FindBy(id="lastname")
	public static WebElement lname;
	@FindBy(id="lastname-error")
	public static WebElement lnerror;
	@FindBy(id="email_address")
	public static WebElement email;
	@FindBy(xpath="//*[@id=\"email_address-error\"]")
	public static WebElement emailerror;
	@FindBy(xpath="//*[@id=\"email_address-error\"]")
	public static WebElement emailformaterror;
	@FindBy(id="password")
	public static WebElement pwd;
	@FindBy(id="password-error")
	public static WebElement pwderror;
	@FindBy(xpath="//*[@id=\"password-error\"]")
	public static WebElement pwdformaterror;
	@FindBy(id="password-confirmation")
	public static WebElement cpwd;
	@FindBy(xpath="//*[@id=\"password-confirmation-error\"]")
	public static WebElement cpwdformaterror;
	@FindBy(xpath="//*[@id=\"password-confirmation-error\"]")
	public static WebElement cpwderror;
	@FindBy(xpath="//*[@id=\"form-validate\"]/div/div[1]/button")
	public static WebElement regbutton;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
	public static WebElement regbuttonvalidation;
	
	//login
	@FindBy(partialLinkText="Sign In")
	public static WebElement signinlink;
	 public void signin()
	 {
	        driver.findElement((By) signinlink).click();
	    }
	@FindBy(id="email")
	public static WebElement loginemailfield;
	@FindBy(id="pass")
	public static WebElement loginpasswordfield;
	@FindBy(id="send2")
	public static WebElement loginbuttoon;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")
	public static WebElement logininvalidcridentials;
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[1]/span")
	public static WebElement signinhome;
	
	//Homepage
	@FindBy(id="ui-id-3")
	public static WebElement whatnext;
	@FindBy(xpath="//*[@id=\"page-title-heading\"]/span")
	public static WebElement whatnextvalidation;
	@FindBy(id="ui-id-4")
	//@FindBy(xpath="/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[2]/a")
	public static WebElement women;
	@FindBy(xpath="//*[@id=\"page-title-heading\"]/span")
	public static WebElement womenvalidation;
	@FindBy(id="ui-id-5")
	public static WebElement men;
	@FindBy(xpath="//*[@id=\"page-title-heading\"]/span")
	public static WebElement menvalidation;
	@FindBy(id="ui-id-6")
	public static WebElement gear;
	@FindBy(xpath="//*[@id=\"page-title-heading\"]/span")
	public static WebElement gearvalidation;
	@FindBy(id="ui-id-7")
	public static WebElement training;
	@FindBy(xpath="//*[@id=\"page-title-heading\"]/span")
	public static WebElement trainingvalidation;
	@FindBy(id="ui-id-8")
	public static WebElement sale;
	@FindBy(xpath="//*[@id=\"page-title-heading\"]/span")
	public static WebElement salevalidation;
	@FindBy(xpath="//*[@id=\"block-collapsible-nav\"]/ul/li[1]/a")
	public static WebElement myaccount;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span")
	public static WebElement myaccountvalidation;
	@FindBy(xpath="html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")
	public static WebElement myaccountbutton;
	@FindBy(xpath="//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")
	public static WebElement myorder;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span")
	public static WebElement myordervalidation;
	@FindBy(xpath="//*[@id=\"block-collapsible-nav\"]/ul/li[3]/a")
	public static WebElement mydownload;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span")
	public static WebElement mydownloadvalidation;
	@FindBy(xpath="//*[@id=\"block-collapsible-nav\"]/ul/li[4]/a")
	public static WebElement mywish;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span")
	public static WebElement mywishvalidation;
	@FindBy(xpath="//*[@id=\"block-collapsible-nav\"]/ul/li[6]/a")
	public static WebElement address;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span")
	public static WebElement addressvalidation;
	@FindBy(xpath="//*[@id=\"block-collapsible-nav\"]/ul/li[7]/a")
	public static WebElement accountinfo;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span")
	public static WebElement accountinfovalidation;
	@FindBy(xpath="//*[@id=\"block-collapsible-nav\"]/ul/li[8]/a")
	public static WebElement storedpayment;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span")
	public static WebElement storedpaymentvalidation;
	@FindBy(xpath="//*[@id=\"block-collapsible-nav\"]/ul/li[10]/a")
	public static WebElement myproductreview;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span")
	public static WebElement myproductrevvalidation;
	@FindBy(xpath="/html/body/div[2]/header/div[2]/a")
	public static WebElement logobutton;
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[1]/span/a")
	public static WebElement support;
	@FindBy(xpath="//*[@id=\"tw-ctr-page\"]/div[1]/div[1]/div/div/div/div[1]/h1/span[1]")
	public static WebElement supportvalidation;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/a/img")
	public static WebElement yoga;
	@FindBy(xpath="//*[@id=\"page-title-heading\"]/span")
	public static WebElement yogavalidation;
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[1]/span")
	public static WebElement custdropdown;
	//signout
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
	public static WebElement signoutbuton;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/h1/span")
	public static WebElement signoutpage;
	public void click_customer_dpdown(){
        driver.findElement((By) custdropdown).click();
    }
    public void signout(){
        driver.findElement((By) signoutbuton).click();
    }
	
	//search
	@FindBy(xpath="//*[@id=\"search\"]")
	public static WebElement searchfield;
	@FindBy(xpath="//*[@id=\"search\"]")
	public static WebElement searchbutton;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/h1/span")
	public static WebElement searchvalidtaion;
}
