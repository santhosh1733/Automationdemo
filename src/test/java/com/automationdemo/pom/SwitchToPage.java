package com.automationdemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchToPage {
	@FindBy(linkText = "SwitchTo")
	private WebElement switchtobutton;
	@FindBy(linkText = "Alerts")
	private WebElement alertpage;
	@FindBy(linkText = "Windows")
	private WebElement windowpage;
	@FindBy(linkText = "Frames")
	private WebElement frames;
	
	public SwitchToPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void setAlertpage() {
		switchtobutton.click();
		 alertpage.click();
	}

	public void setWindowpage() {
		switchtobutton.click();
		windowpage.click();
	}

	public void setFrames() {
		switchtobutton.click();
		frames.click();
	}
	
	

}
