package com.hrms.testscrips;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.GeneralUniverse;

public class TC001_LL {

//public static void main(String args[]) {
	@Test
	public void tc001() {
	//Test Steps
		DOMConfigurator.configure("log4j.xml");
   GeneralUniverse obj = new GeneralUniverse();
  
   obj.openApplication();
   obj.login();
   obj.logout();
   obj.closeApplication();
}

}
