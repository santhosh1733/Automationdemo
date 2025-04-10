package com.automationdemo.testsrcript;

import org.testng.annotations.Test;

import com.automationdemo.generic.Baseclass;
import com.automationdemo.pom.SwitchToPage;
import com.automationdemo.pom.framepage;

public class FrameModule extends Baseclass {
	
	public void handlingsingleframe() {
		SwitchToPage s=new SwitchToPage(driver);
		s.setFrames();
		framepage p=new framepage(driver);
		p.setsingleframe("abcd");
	}
	@Test
   public void handlingnestedframe() {
	   SwitchToPage s=new SwitchToPage(driver);
		s.setFrames();
		framepage p=new framepage(driver);
		p.setnestedframe("abcd");
   }
}
