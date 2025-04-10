package com.automationdemo.pom;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.Assertion;

import com.automationdemo.generic.Baseclass;

public class Alertpage extends Baseclass{
       @FindBy(xpath = "//button[@onclick='alertbox()']")
       private WebElement alertbox;
       @FindBy(linkText ="Alert with OK & Cancel")
       private WebElement alertwithokandcancel;
       @FindBy(xpath = "//button[@onclick='confirmbox()']")
       private WebElement confirmbox;
       @FindBy(id = "demo")
       private WebElement text;
       @FindBy(linkText = "Alert with Textbox")
       private WebElement alertwithtextbox ;
       @FindBy(xpath = "//button[@onclick='promptbox()']")
       private WebElement promptbox;
     
       
       public Alertpage(WebDriver driver) {
    	   PageFactory.initElements(driver,this);
       }
     public void setalertbox() {
    	 alertbox.click();
    	 driver.switchTo().alert().accept();
     }  
     
     public void setconfirmbox() {
    	 
    	 alertwithokandcancel.click();
    	 confirmbox.click();
    	 driver.switchTo().alert().accept();
    	 
     }
     public void setpromptbox(String text) {
    	 alertwithtextbox.click();
    	 promptbox.click();
    	Alert alert = driver.switchTo().alert();
    	alert.sendKeys(text);
    	alert.accept();
    	 
    	 
    	 
    	 
     }
       
}
