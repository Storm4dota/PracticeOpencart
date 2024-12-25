package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;


public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	

	@FindBy(xpath="//input[@id='input-firstname']") WebElement txtin_firstN;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txtin_lastN;
	@FindBy(xpath="//input[@id='input-email']") WebElement txtin_email;
	@FindBy(xpath="//input[@id='input-telephone']") WebElement txt_tele;
	@FindBy(xpath="//input[@id='input-password']") WebElement txt_pass;
	@FindBy(xpath="//input[@id='input-confirm']") WebElement txt_cpass;
	@FindBy(xpath="//label[normalize-space()='Yes']//input[@name='newsletter']") WebElement SubYes_btn;
	@FindBy(xpath="//input[@value='0']") WebElement SubNo_btn;
	@FindBy(xpath="//input[@name='agree']") WebElement btn_privacy;
	@FindBy(xpath="//input[@value='Continue']") WebElement btn_conti;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement confirmMsg;
	@FindBy(xpath="//input[@value='0']") WebElement SubNo;
	
	
	public void firstname(String fname)
	{
		txtin_firstN.sendKeys(fname);
	}
	
	public void lastname(String lname)
	{
		txtin_lastN.sendKeys(lname);
	}
	
	public void email(String eml)
	{
		txtin_email.sendKeys(eml);
		
	}
	public void phoneno(String ph)
	{
		txt_tele.sendKeys(ph);
		
	}
	public void password(String pass)
	{
		txt_pass.sendKeys(pass);
	}
	public void confpass(String cpass )
	{
		txt_cpass.sendKeys(cpass);
	}
	public void SubYes()
	{
		SubYes_btn.click();
	}
	
	public void privacypolicy()
	{
		btn_privacy.click();
	}
	public void continueBtn()
	{
		btn_conti.click();
	}
	public String getconfirmMsg()
	{
		try
		{
			return(confirmMsg.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	public void SubscribeNo()
	{
		SubNo.click();
	}
	
	
	

}
