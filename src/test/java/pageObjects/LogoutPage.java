package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage  {
	
	WebDriver driver;
	
	public LogoutPage(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout'] ") WebElement logout_btn;
@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement logout_btnCol;
@FindBy(xpath="//a[@title='My Account']") WebElement MyACC;
@FindBy(xpath="//a[normalize-space()='Continue']") WebElement continue_btn;
public void Logouttopmenu()
{
	logout_btn.click();
}
public void LogoutCol()
{
	logout_btnCol.click();
}

public void MyaccountDropmenu()
{
	MyACC.click();
}
public void ContinueLogout_btn()
{
	continue_btn.click();
}

}

//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']
//a[@class='list-group-item'][normalize-space()='Logout']