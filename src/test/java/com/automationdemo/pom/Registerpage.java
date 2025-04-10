package com.automationdemo.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registerpage {
	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstnametextfield;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastnametextfield;
	@FindBy(xpath = "//textarea[@ng-model='Adress']")
	private WebElement addresstextfield;
	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailidtextfield;
	@FindBy(xpath = "//input[@type='tel']")
	private WebElement phonenumbertextfield;
	@FindBy(xpath = "//label[text()=' Male ']")
	private WebElement gendermaleradiobuttion;
	@FindBy(xpath = "//label[text()=' FeMale']")
	private WebElement genderfemaleradiobutton;
	@FindBy(id = "checkbox1")
	private WebElement cricketcheckbox;
	@FindBy(id = "checkbox2")
	private WebElement moviescheckbox;
	@FindBy(id = "checkbox3")
	private WebElement hockeycheckbox;
	@FindBy(id = "msdd")
	private WebElement languagetextfield;
	@FindBy(id = "Skills")
	private WebElement skilldd;
	@FindBy(className ="select2-selection__arrow")
	private WebElement selectcountrydd;
	@FindBy(xpath = "//span[@role='combobox']")
	private WebElement countrynametextfield;
	@FindBy(xpath = "(//select[@type='text'])[3]")
	private WebElement yeardd;
	@FindBy(xpath = "(//select[@type='text'])[4]")
	private WebElement monthdd;
	@FindBy(xpath = "(//select[@type='text'])[5]")
	private WebElement daydd;
	@FindBy(id = "firstpassword")
	private WebElement passwordtextfield;
	@FindBy(id = "secondpassword")
	private WebElement confirmpasswordtextfield;
	@FindBy(id = "submitbtn")
	private WebElement submitbutton;
	@FindBy(id = "Button1")
	private WebElement refreshbutton;
	WebDriver driver;

	public Registerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setFirstname(String firstname) {
		firstnametextfield.sendKeys(firstname);
	}

	public void setLastname(String lastname) {
		lastnametextfield.sendKeys(lastname);
	}

	public void setAddress(String address) {
		addresstextfield.sendKeys(address);
	}

	public void setEmailid(String  emailid) {
		emailidtextfield.sendKeys(emailid);
	}

	public void setPhonenumber(String phonenumber) {
		phonenumbertextfield.sendKeys(phonenumber);
	}

	public void setGendermaleradiobuttion(String gender) {
		String male = gendermaleradiobuttion.getText();
		if(male.equalsIgnoreCase(gender)) {
			gendermaleradiobuttion.click();
		}
		else {
			genderfemaleradiobutton.click();
		}

	}
	public void sethobbies() {
		cricketcheckbox.click();
		moviescheckbox.click();
		hockeycheckbox.click();
	
	}

	public void setLanguage(String language) {
		languagetextfield.click();
		
	}

	public void setSkilldd(String skill) {
		Select s= new Select(skilldd);
		s.selectByVisibleText(skill);
	}
	public void setSelectcountry()  {
		
		selectcountrydd.click();
	}

	public void setdateofbirth(String year,String month, String day) {
		Select s1=new Select(yeardd);
		Select s2=new Select(monthdd);
		Select s3=new Select(daydd);
		s1.selectByVisibleText(year);
		s2.selectByVisibleText(month);
		s3.selectByVisibleText(day);
	}

	public void setPassword(String password) {
		passwordtextfield.sendKeys(password);
	}

	public void setConfirmpassword(String confirmpassword) {
		confirmpasswordtextfield.sendKeys(confirmpassword);
	}

	public void setSubmitbutton() {
		submitbutton.click();
	}

	public void setRefreshbutton() {
		refreshbutton.click();
	}

}
