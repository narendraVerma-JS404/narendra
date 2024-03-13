package com.hrms.testscrips;

import org.testng.annotations.Test;

import com.hrms.lib.GeneralUniverse;

public class TC005_SearchMtd {
	
	//public static void main(String args[]) {
		@Test
		public void TC005() {
			
		
		
		      //Test Steps
		
  GeneralUniverse obj = new GeneralUniverse();
		
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.smEdtEmp();
		obj.edtEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
	}

}
