package com.automationdemo.testsrcript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.automationdemo.generic.Baseclass;
import com.automationdemo.generic.Filelib;
import com.automationdemo.pom.Registerpage;

public class RegisterModule extends Baseclass{
	@Test
	public void registeruser() throws EncryptedDocumentException, IOException{
		String firstname = f.getExcelData("RegisterDetails", 1, 1);
		String lastname = f.getExcelData("RegisterDetails", 1, 2);
		String address = f.getExcelData("RegisterDetails", 1, 3);
		String emailid = f.getExcelData("RegisterDetails", 1, 4);
		String phonenum = f.getExcelData("RegisterDetails", 1, 5);
		String gender = f.getExcelData("RegisterDetails", 1, 6);
		String skill = f.getExcelData("RegisterDetails", 1, 7);
		String year = f.getExcelData("RegisterDetails", 1, 8);
		String month = f.getExcelData("RegisterDetails", 1, 9);
		String day = f.getExcelData("RegisterDetails", 1, 10);
		String password = f.getExcelData("RegisterDetails", 1, 11);
		String confirpassword = f.getExcelData("RegisterDetails", 1, 12);
		Registerpage r=new Registerpage(driver);
		
	    r.setFirstname(firstname);
	    r.setLastname(lastname);
	r.setAddress(address);
	r.setEmailid(emailid);
	r.setPhonenumber(phonenum);
	r.setGendermaleradiobuttion(gender);
	r.sethobbies();
	r.setSkilldd(skill);
	r.setdateofbirth(year,month,day);
	r.setPassword(password);
	r.setConfirmpassword(confirpassword);
	r.setSubmitbutton();
	}

}
