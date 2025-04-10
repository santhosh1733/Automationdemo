package com.automationdemo.testsrcript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.automationdemo.generic.Baseclass;
import com.automationdemo.pom.Alertpage;
import com.automationdemo.pom.SwitchToPage;

public class AlertModule extends Baseclass{
 
   public void confirmbox() {
	   SwitchToPage s=new SwitchToPage(driver);
		s.setAlertpage();
		Alertpage a=new Alertpage(driver);
		 a.setconfirmbox();
   }
   @Test
	public void  setpromptbox() {
		SwitchToPage s=new SwitchToPage(driver);
		s.setAlertpage();
		Alertpage a=new Alertpage(driver);
		a.setpromptbox("massage");
	}
	}
		

