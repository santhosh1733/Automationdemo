package com.automationdemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationdemo.generic.Baseclass;

public class framepage extends Baseclass {
	
	@FindBy(id = "singleframe")
	private WebElement singleframe;
	@FindBy(xpath = "//input[@type='text']")
	private WebElement testfield;
	@FindBy(linkText = "Iframe with in an Iframe")
	private WebElement nestedframebutton;
	@FindBy(className = "container")
	private WebElement nestedframe;
	@FindBy(xpath = "//input[@type='text']")
	private WebElement nestedframetestfield;
	@FindBy(xpath = "//div[@class='container iframes-page-container']")
	private WebElement parentframe;
	
	public framepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setsingleframe(String text) {
	driver.switchTo().frame(singleframe);
	testfield.sendKeys(text);
	}
	
	public void setnestedframe(String text) {
		nestedframebutton.click();
		driver.switchTo().frame(parentframe);
		driver.switchTo().frame(nestedframe);
		nestedframetestfield.sendKeys(text);
		
	}

}
