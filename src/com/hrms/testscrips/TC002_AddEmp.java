package com.hrms.testscrips;
import org.testng.annotations.Test;

import com.hrms.lib.GeneralUniverse;
public class TC002_AddEmp {
//public static void main(String args[]) {
	@Test
	public void TC002() {
	//Test Steps
	
	GeneralUniverse obj = new GeneralUniverse();
	obj.openApplication();
	obj.login();
	obj.enterFrame();
	obj.addEmployee();
	obj.exitFrame();
	obj.logout();
	obj.closeApplication();
	
}

}
