package org.utilites;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoForgottenMobileNum extends BaseClass{
	public PojoForgottenMobileNum() {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//a[text()='Forgotten password?']")
private WebElement forgottenPass;
@FindBy(id="identify_email")
private WebElement txtboxmobile;
@FindBy(id="did_submit")
private WebElement clickSearchButton;
public WebElement getForgottenPass() {
	return forgottenPass;
}
public WebElement getTxtboxmobile() {
	return txtboxmobile;
}
public WebElement getClickSearchButton() {
	return clickSearchButton;
}


















}
