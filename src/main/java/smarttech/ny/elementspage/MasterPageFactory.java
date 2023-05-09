package smarttech.ny.elementspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import smarttech.ny.basepage.ParentClass;
import smarttech.ny.generic.CommonUtil;

public class MasterPageFactory extends ParentClass {
	public MasterPageFactory(){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "(//input[@type='email'])[1]")
	@CacheLookup
	private WebElement enterEmail;
	
	public WebElement getEnterEmail() {
		return enterEmail;
	}
	@FindBy(xpath = "//input[@type='password']")
	@CacheLookup
	private WebElement enterPassword;
	
	public WebElement getEnterPassword() {
		return enterPassword;
	}
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	@CacheLookup
	private WebElement clickOnLoginButton;
	
	public WebElement getClickOnLoginButton() {
		return clickOnLoginButton;
	}
	
	public void getLogin(String userName, String password) { 
		getEnterEmail().sendKeys(userName);
		getEnterPassword().sendKeys(password);
		
		CommonUtil.actionclick(getClickOnLoginButton());
		
		Actions ac = new Actions(driver);
		ac.click(getClickOnLoginButton()).build().perform();
		getClickOnLoginButton().click();
	
	}
	
	
	
}
	

