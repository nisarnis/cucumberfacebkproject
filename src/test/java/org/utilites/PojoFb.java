package org.utilites;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//
public class PojoFb extends BaseClass{
	public PojoFb() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
	private WebElement txtuser;
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtpass;
	@FindBy(name="login")
	private WebElement btnlogin;
	
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}

}
